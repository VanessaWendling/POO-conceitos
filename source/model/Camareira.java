package source.model;

import source.interfaces.ICamareira;

public class Camareira extends Pessoa implements ICamareira{

    public Camareira(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void arrumarCama() {
        System.out.println("Sei muito bem arrumar a cama");
    }

    @Override
    public void limparQuarto() {
        System.out.println("Sei muito bem limpar o quarto");
    }
    
}
