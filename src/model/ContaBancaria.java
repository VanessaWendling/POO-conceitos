package src.model;

import java.util.InputMismatchException;

public class ContaBancaria {
    // #region atributos
    private String agencia;
    private String conta;
    private Integer digito;
    private Double saldo;
    public Double VALOR_MINIMO_DEPOSITO = 10.0;
    // #endregion

    // #region contrutores
    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
    }

    // #endregion

    //#region getters and setters
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
    //#endregion

//#region metodos
public void depositar(Double valor){
    if(valor < VALOR_MINIMO_DEPOSITO){
    throw new InputMismatchException("O valor mínimo de depósito é R$" + VALOR_MINIMO_DEPOSITO);
    }
    this.saldo += valor;
}
public Double sacar(Double valor){
    if(this.saldo < valor){
        throw new InputMismatchException("Saldo insuficiente" );
    }
    this.saldo -= valor;
    return valor;
}

public void transferir(Double valor, ContaBancaria contaDestino){
    this.sacar(valor);
    contaDestino.depositar(valor);
}
//#endregion
}