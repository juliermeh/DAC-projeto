package br.edu.ifpb.dac.projeto.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * @author ericl
 */
@Entity
public class Professor extends Login implements Serializable {

    @Basic(optional = true)
    @Column(unique = false, insertable = true, nullable = true, updatable = true, length = 255, scale = 0, precision = 0)
    private String matricula;

    @OneToMany(mappedBy = "professor", orphanRemoval = false, targetEntity = Turma.class)
    private List<Turma> turmas;

    @OneToMany(mappedBy = "professor", orphanRemoval = false, targetEntity = Solicitacao.class)
    private List<Solicitacao> solicitacoes;

    public Professor() {
    }

    public Professor(String matricula, List<Turma> turmas, List<Solicitacao> solicitacoes) {
        this.matricula = matricula;
        this.turmas = turmas;
        this.solicitacoes = solicitacoes;
    }

        
    public Optional<String> getMatricula() {
        return Optional.ofNullable(matricula);
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Turma> getTurmas() {
        if (turmas == null) {
            turmas = new ArrayList<>();
        }
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public void addTurma(Turma turma) {
        getTurmas().add(turma);
        turma.setProfessor(this);
    }

    public void removeTurma(Turma turma) {
        getTurmas().remove(turma);
        turma.setProfessor(null);
    }

    public List<Solicitacao> getSolicitacoes() {
        if (solicitacoes == null) {
            solicitacoes = new ArrayList<>();
        }
        return solicitacoes;
    }

    public void setSolicitacoes(List<Solicitacao> solicitacoes) {
        this.solicitacoes = solicitacoes;
    }

    public void addSolicitaco(Solicitacao solicitaco) {
        getSolicitacoes().add(solicitaco);
        solicitaco.setProfessor(this);
    }

    public void removeSolicitaco(Solicitacao solicitaco) {
        getSolicitacoes().remove(solicitaco);
        solicitaco.setProfessor(null);
    }

}