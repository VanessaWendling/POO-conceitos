package fundamentos;

public class Carro {

    // #region Atributos
    private String modelo;
    private Number ano;
    private String cor;
    // #endregion

    // #region Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Number getAno() {
        return ano;
    }

    public void setAno(Number ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    // #endregion

    //#region Contructors

    //construtor padrão
    public Carro(){
    }

    //contrutor cheio
    public Carro(String modelo, Integer ano, String cor){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }
    //#endregion
}
