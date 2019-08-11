package br.edu.ifpb.dac.projeto.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * @author ericl
 */
@Entity
public class CAEST extends Login implements Serializable {

    @OneToMany(mappedBy = "CAEST", orphanRemoval = false, targetEntity = AlunoContemplado.class)
    private List<AlunoContemplado> alunoContemplados;

    @OneToMany(orphanRemoval = false, targetEntity = Solicitacao.class)
    private List<Solicitacao> solicitacoes;

    public CAEST(List<AlunoContemplado> alunoContemplados, List<Solicitacao> solicitacoes, String login, String senha, String nome) {
        super(login, senha, nome);
        this.alunoContemplados = alunoContemplados;
        this.solicitacoes = solicitacoes;
    }

    public CAEST(List<AlunoContemplado> alunoContemplados, List<Solicitacao> solicitacoes) {
        this.alunoContemplados = alunoContemplados;
        this.solicitacoes = solicitacoes;
    }

    public CAEST() {
    }

    public CAEST(String login, String senha, String nome) {
        super(login, senha, nome);
    }

   
    public List<AlunoContemplado> getAlunoContemplados() {
        if (alunoContemplados == null) {
            alunoContemplados = new ArrayList<>();
        }
        return alunoContemplados;
    }

    public void setAlunoContemplados(List<AlunoContemplado> alunoContemplados) {
        this.alunoContemplados = alunoContemplados;
    }

    public void addAlunoContemplado(AlunoContemplado alunoContemplado) {
        getAlunoContemplados().add(alunoContemplado);
        alunoContemplado.setCAEST(this);
    }

    public void removeAlunoContemplado(AlunoContemplado alunoContemplado) {
        getAlunoContemplados().remove(alunoContemplado);
        alunoContemplado.setCAEST(null);
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
    }

    public void removeSolicitaco(Solicitacao solicitaco) {
        getSolicitacoes().remove(solicitaco);
    }

}