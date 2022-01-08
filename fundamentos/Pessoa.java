package fundamentos;
//métodos acessores
// public: indica que qualquer classe pode acessar os elementos
// private: somente a classe consegue acessar
// protected: indica que somente a classe e seus filhos conseguem acessar
// default: indica que somente a classe, seus filhos e as classes mno mesmo package conseguem acessar

public class Pessoa {
    private String nome;
    private Integer idade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade (Integer idade){
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public Integer getIdade(){
        return this.idade;
    }
}