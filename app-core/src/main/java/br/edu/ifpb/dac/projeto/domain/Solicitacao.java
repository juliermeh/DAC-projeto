package br.edu.ifpb.dac.projeto.domain;

import java.io.Serializable;
import javax.persistence.Temporal;

public class Solicitacao implements Serializable {
    
    private int codigo;
    private String justificativa;
    private Temporal data;
    private int quantidade;

    public Solicitacao() {  }

    public Solicitacao(int codigo, String justificativa, Temporal data, int quantidade) {
        this.codigo = codigo;
        this.justificativa = justificativa;
        this.data = data;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public Temporal getData() {
        return data;
    }

    public void setData(Temporal data) {
        this.data = data;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
