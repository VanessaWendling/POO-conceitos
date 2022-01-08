package src.model;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.ArrayList;
/*A classe conta bancária tem que ser abstrata pq ela só serve de modelo para as demais
 * ela não pode ser referenciada/instanciada, apenas modelar outras classes.
 */

/*
 * ArrayList precisa smp ser instanciado, então para garantir instanciamos ele dentro do construtor
 * se ele não for instanciado, derá uma exception de nullpointerException 
 */
public abstract class ContaBancaria {
    // #region atributos
    private String agencia;
    private String conta;
    private Integer digito;
    private Double saldo;
    private Date dataAbertura;
    public Double VALOR_MINIMO_DEPOSITO = 10.0;
    //protected pq só a classe e os filhos podem mexer nela
    protected ArrayList<Movimentacao> movimentacoes;
    // #endregion

    // #region contrutores
    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date();

        this.movimentacoes = new ArrayList<Movimentacao>();

        // primeira movimentação
        Movimentacao movimentacao = new Movimentacao("Abertura de conta", saldoInicial);

        // salvando a movimentacao dentro do array de movimentações
        // iniciando o extrato bancário
        this.movimentacoes.add(movimentacao);
    }

    // #endregion

    // #region getters and setters
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }
    // #endregion

    // #region metodos
    public void depositar(Double valor) {
        if (valor < VALOR_MINIMO_DEPOSITO) {
            throw new InputMismatchException("O valor mínimo de depósito é R$" + VALOR_MINIMO_DEPOSITO);
        }
        this.saldo += valor;
        Movimentacao movimentacao = new Movimentacao("Depósito", valor);
        this.movimentacoes.add(movimentacao);
    }

    public Double sacar(Double valor) {
        if (this.saldo < valor) {
            throw new InputMismatchException("Saldo insuficiente");
        }
        this.saldo -= valor;
        Movimentacao movimentacao = new Movimentacao("Sacar", valor);
        this.movimentacoes.add(movimentacao);
        return valor;
    }

    public void transferir(Double valor, ContaBancaria contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    // métodos abstratos não podem ser implementados, apenas dizer o nome dele
    // e obrigar as classes que herdam a implementar
    public abstract void imprimirExtrato();
    // #endregion
}
