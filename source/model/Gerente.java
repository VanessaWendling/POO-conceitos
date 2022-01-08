package source.model;

import source.interfaces.ICamareira;
import source.interfaces.IRecepcionista;

public class Gerente extends Pessoa implements ICamareira, IRecepcionista{

    public Gerente(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void atenderTelefone() {
        System.out.println("Sei atender mais ou menos o telefone");
    }

    @Override
    public void falarIngles() {
        System.out.println("Sei falar inglês muito bem");
    }

    @Override
    public void arrumarCama() {
        System.out.println("Sei muito bem arrumar a cama");
    }

    @Override
    public void limparQuarto() {
        System.out.println("Sei limpar o quarto mais ou menos");
    }
    
}
