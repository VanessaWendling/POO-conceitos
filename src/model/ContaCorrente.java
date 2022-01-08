package src.model;

//conta corrente herda de conta bancaria
public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String agencia, String conta, Integer digito, Double saldoInicial) {
        //super significa que ele cria uma conta bancaria
        super(agencia, conta, digito, saldoInicial);
        //TODO Auto-generated constructor stub
    }
    
}
