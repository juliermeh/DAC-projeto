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
public class AlunoContemplado implements Serializable {

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

    @Basic(optional = true)
    @Column(unique = false, insertable = true, nullable = true, updatable = true, length = 255, scale = 0, precision = 0)
    private String dataInicio;

    @ManyToOne(optional = true, targetEntity = CAEST.class)
    private CAEST CAEST;

    public AlunoContemplado(String matricula, String nome, String dataInicio, CAEST CAEST) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.CAEST = CAEST;
    }

    public AlunoContemplado() {
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

    public Optional<String> getDataInicio() {
        return Optional.ofNullable(dataInicio);
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Optional<CAEST> getCAEST() {
        return Optional.ofNullable(CAEST);
    }

    public void setCAEST(CAEST CAEST) {
        this.CAEST = CAEST;
    }

}