package src.model;

import java.util.Date;

import src.utils.DataUtil;

public class Movimentacao {
    // #region atributos
    private String descricao;
    private Date data;
    private Double valor;
    // #endregion

    //#region constructors
    public Movimentacao(String descricao, Double valor) {
        this.descricao = descricao;
        this.data = new Date();
        this.valor = valor;
    }
    //#endregion

    //#region getters and setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public Double getValor() {
        return valor;
    }
    //#endregion
    /*
     * Override quer dizer que eu vou sobreescrever um método. 
     * Ou seja, o método antigo não vale mais nada
    */
    @Override
    public String toString(){
        return this.getDescricao() + "\n" + DataUtil.converterDateParaData(this.getData()) + " - R$" + this.valor;
    }
}
