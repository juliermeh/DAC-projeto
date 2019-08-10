package br.edu.ifpb.dac.projeto.domain;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Aluno implements Serializable {
    
    @Id
    @GeneratedValue
    private int Id;
    private String matricula;
    private String nome;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Usuario usuario;

    public Aluno() { }

    public Aluno(String matricula, String nome, Usuario usuario) {
        this.matricula = matricula;
        this.nome = nome;
        this.usuario = usuario;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
       
}
