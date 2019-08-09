package br.edu.ifpb.dac.projeto.domain;

import java.io.Serializable;

public class Aluno implements Serializable {
    
    private int ID;
    private String matricula;
    private String nome;

    public Aluno() { }

    public Aluno(int ID, String matricula, String nome) {
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
