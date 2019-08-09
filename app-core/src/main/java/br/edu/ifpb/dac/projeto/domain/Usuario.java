package br.edu.ifpb.dac.projeto.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue
    private int ID;
    private String nome;
    private int matricula;
    private String senha;

    public Usuario() {  }

    public Usuario(int ID, String nome, int matricula, String senha) {
        this.ID = ID;
        this.nome = nome;
        this.matricula = matricula;
        this.senha = senha;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
