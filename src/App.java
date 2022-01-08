package src;

import src.model.ContaBancaria;
import src.model.ContaCorrente;
import src.model.ContaPoupanca;

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
        System.out.println("Saldo conta destino de R$" + conta2.getSaldo()+ "\n");
        System.out.println("Saldo conta atual de R$" + conta2.getSaldo()+ "\n");




    }
}
