package br.edu.ifpb.dac.projeto.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Optional;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author ericl
 */
@Entity
public class Solicitacao implements Serializable {

    @Id
    @GeneratedValue
    @Column(unique = false, insertable = true, nullable = true, updatable = true, length = 255, scale = 0, precision = 0)
    private Long id;

    @Basic(optional = true)
    @Column(unique = false, insertable = true, nullable = true, updatable = true, length = 255, scale = 0, precision = 0)
    private String justificatica;

    @Basic(optional = true)
    @Column(unique = false, insertable = true, nullable = true, updatable = true, length = 255, scale = 0, precision = 0)
    @Temporal(TemporalType.DATE)
    private Date data;

    @Basic(optional = true)
    @Column(unique = false, insertable = true, nullable = true, updatable = true, length = 255, scale = 0, precision = 0)
    @Enumerated(EnumType.STRING)
    private TipoDeferimento status ;

    @OneToOne(optional = true, orphanRemoval = false, targetEntity = Turma.class)
    private Turma turma;

    @ManyToOne(optional = true, targetEntity = Professor.class)
    private Professor professor;

    public Solicitacao(String justificatica, Date data, TipoDeferimento status, Turma turma, Professor professor) {
        this.justificatica = justificatica;
        this.data = data;
        this.status = status;
        this.turma = turma;
        this.professor = professor;
    }

    public Solicitacao() {
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Optional<String> getJustificatica() {
        return Optional.ofNullable(justificatica);
    }

    public void setJustificatica(String justificatica) {
        this.justificatica = justificatica;
    }

    public Optional<Date> getData() {
        return Optional.ofNullable(data);
    }

    public void setData(Date data) {
        this.data = data;
    }

    public TipoDeferimento getStatus() {
        return status;
    }

    public void setStatus(TipoDeferimento status) {
        this.status = status;
    }
    

    public Optional<Turma> getTurma() {
        return Optional.ofNullable(turma);
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Optional<Professor> getProfessor() {
        return Optional.ofNullable(professor);
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

}