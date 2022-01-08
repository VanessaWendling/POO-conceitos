package src;

import src.model.ContaCorrente;
import src.model.ContaPoupanca;
import src.model.Movimentacao;
import src.utils.DataUtil;

public class App {
    public static void main(String[] args) {
        System.out.println("Criando nosso Banco Digital\n");

        // ContaBancaria conta = new ContaBancaria("0001", "7542", 5, 100.0);
        ContaCorrente conta = new ContaCorrente("0001", "7542", 5, 100.0);
        System.out.println("Saldo atual de R$" + conta.getSaldo() + "\n");

        conta.depositar((250.0));
        System.out.println("Saldo atual de R$" + conta.getSaldo() + "\n");

        conta.sacar(150.0);
        System.out.println("Saldo atual de R$" + conta.getSaldo() + "\n");

        // ContaBancaria conta = new ContaBancaria("0001", "7543", 6, 200.0);
        ContaPoupanca conta2 = new ContaPoupanca("0001", "7543", 6, 200.0);
        conta2.transferir(100.0, conta);
        System.out.println("Saldo conta destino de R$" + conta2.getSaldo() + "\n");
        System.out.println("Saldo conta atual de R$" + conta2.getSaldo() + "\n");

        System.out.println(conta2.getDataAbertura());

        // não precisa mais pq o método é estático
        // DataUtil util = new DataUtil();

        // String formatado1 =
        // util.converterDateParaDataEHora(conta2.getDataAbertura());
        String formatado1 = DataUtil.converterDateParaDataEHora(conta2.getDataAbertura());

        // String formatado2 = util.converterDateParaHora(conta2.getDataAbertura());
        String formatado2 = DataUtil.converterDateParaHora(conta2.getDataAbertura());

        // String formatado3 = util.converterDateParaData(conta2.getDataAbertura());
        String formatado3 = DataUtil.converterDateParaData(conta2.getDataAbertura());

        System.out.println(formatado1);
        System.out.println(formatado2);
        System.out.println(formatado3);

        /*
         * um extrato bancário é composto por movimentações bancárias
         * ter algo que possa ser a movimentação
         * ter uma lista de movimentações
         */

         Movimentacao movimentacao = new Movimentacao("Saque", 10.0);
         System.out.println(movimentacao);

         conta.imprimirExtrato();
         conta2.imprimirExtrato();
    }
}
