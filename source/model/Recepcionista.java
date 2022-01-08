package source.model;

import source.interfaces.IRecepcionista;

public class Recepcionista extends Pessoa implements IRecepcionista{

    public Recepcionista(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void atenderTelefone() {
        System.out.println("Sei atender o telefone");
    }

    @Override
    public void falarIngles() {
        System.out.println("Sei falar inglês");
    }
    
}
