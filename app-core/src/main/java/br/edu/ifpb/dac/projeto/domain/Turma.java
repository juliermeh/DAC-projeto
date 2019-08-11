package br.edu.ifpb.dac.projeto.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author ericl
 */
@Entity
public class Turma implements Serializable {

    @Id
    @GeneratedValue
    @Column(unique = false, insertable = true, nullable = true, updatable = true, length = 255, scale = 0, precision = 0)
    private Long id;

    @Basic(optional = true)
    @Column(unique = false, insertable = true, nullable = true, updatable = true, length = 255, scale = 0, precision = 0)
    private String nome;

    @ManyToOne(optional = true, targetEntity = Professor.class)
    private Professor professor;

    @OneToMany(mappedBy = "turma", orphanRemoval = false, targetEntity = Aluno.class)
    private List<Aluno> alunos;

    public Turma(String nome, Professor professor, List<Aluno> alunos) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = alunos;
    }

    public Turma() {
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Optional<String> getNome() {
        return Optional.ofNullable(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Optional<Professor> getProfessor() {
        return Optional.ofNullable(professor);
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        if (alunos == null) {
            alunos = new ArrayList<>();
        }
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void addAluno(Aluno aluno) {
        getAlunos().add(aluno);
        aluno.setTurma(this);
    }

    public void removeAluno(Aluno aluno) {
        getAlunos().remove(aluno);
        aluno.setTurma(null);
    }

}