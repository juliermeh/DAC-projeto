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
    private int ID;
    private String matricula;
    private String nome;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Usuario usuario;

    public Aluno() { }

    public Aluno(int ID, String matricula, String nome, Usuario usuario) {
        this();
        this.ID = ID;
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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
    
    
}
