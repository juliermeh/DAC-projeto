package br.edu.ifpb.dac.projeto.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Solicitacao implements Serializable {
    
    @Id
    @GeneratedValue
    private int codigo;
    private String justificativa;
    @Temporal(TemporalType.DATE)
    private Date data;
    private int quantidade;

    public Solicitacao() {  }

    public Solicitacao(String justificativa, Date data, int quantidade) {
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
