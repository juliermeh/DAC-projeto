package br.edu.ifpb.dac.projeto.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue
    private int Id;
    private String nome;
    private int matricula;
    private String senha;

    public Usuario() {  }

    public Usuario(String nome, int matricula, String senha) {
        this.nome = nome;
        this.matricula = matricula;
        this.senha = senha;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
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
