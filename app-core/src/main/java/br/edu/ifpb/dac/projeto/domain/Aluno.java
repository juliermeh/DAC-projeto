package br.edu.ifpb.dac.projeto.domain;

import java.io.Serializable;
import java.util.Optional;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author ericl
 */
@Entity
public class Aluno implements Serializable {

    @Id
    @GeneratedValue
    @Column(unique = false, insertable = true, nullable = true, updatable = true, length = 255, scale = 0, precision = 0)
    private Long id;

    @Basic(optional = true)
    @Column(unique = false, insertable = true, nullable = true, updatable = true, length = 255, scale = 0, precision = 0)
    private String matricula;

    @Basic(optional = true)
    @Column(unique = false, insertable = true, nullable = true, updatable = true, length = 255, scale = 0, precision = 0)
    private String nome;

    @ManyToOne(optional = true, targetEntity = Turma.class)
    private Turma turma;

    public Aluno(String matricula, String nome, Turma turma) {
        this.matricula = matricula;
        this.nome = nome;
        this.turma = turma;
    }

    public Aluno() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Optional<String> getMatricula() {
        return Optional.ofNullable(matricula);
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Optional<String> getNome() {
        return Optional.ofNullable(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Optional<Turma> getTurma() {
        return Optional.ofNullable(turma);
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

}