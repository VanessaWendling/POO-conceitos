package src.model;

import java.util.Date;

import src.utils.DataUtil;

//conta corrente herda de conta bancaria
public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String agencia, String conta, Integer digito, Double saldoInicial) {
        // super significa que ele cria uma conta bancaria
        super(agencia, conta, digito, saldoInicial);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("***********************************");
        System.out.println("******** Extrato Bancário *********");
        System.out.println("***********************************\n");
        System.out.println("Gerado em:" + DataUtil.converterDateParaDataEHora(new Date()));

        for (Movimentacao movimentacao : this.movimentacoes) {
            System.out.println(movimentacao);
            System.out.println("***********************************");

        }
        System.out.println("***********************************");
        System.out.println("***********************************\n");
    }

}
