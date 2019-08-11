package br.edu.ifpb.dac.projeto.domain;

import java.io.Serializable;
import java.util.Optional;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author ericl
 */
@Entity
public class Indeferido implements Serializable {

    @Id
    @GeneratedValue
    @Column(unique = false, insertable = true, nullable = true, updatable = true, length = 255, scale = 0, precision = 0)
    private Long id;

    @Basic(optional = true)
    @Column(unique = false, insertable = true, nullable = true, updatable = true, length = 255, scale = 0, precision = 0)
    private String comentario;

    @OneToOne(optional = true, orphanRemoval = false, targetEntity = Solicitacao.class)
    private Solicitacao solicitacao;

    public Indeferido(String comentario, Solicitacao solicitacao) {
        this.comentario = comentario;
        this.solicitacao = solicitacao;
    }

    public Indeferido() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Optional<String> getComentario() {
        return Optional.ofNullable(comentario);
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Optional<Solicitacao> getSolicitacao() {
        return Optional.ofNullable(solicitacao);
    }

    public void setSolicitacao(Solicitacao solicitacao) {
        this.solicitacao = solicitacao;
    }

}