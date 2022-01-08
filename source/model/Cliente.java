package source.model;

public class Cliente extends Pessoa{

    private Integer idade;

    public Cliente(String nome, String telefone, String cpf, Integer idade) {
        super(nome, telefone, cpf);
        this.idade = idade;
        //TODO Auto-generated constructor stub
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    
}
