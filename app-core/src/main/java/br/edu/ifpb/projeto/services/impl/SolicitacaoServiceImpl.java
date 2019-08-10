package br.edu.ifpb.projeto.services.impl;

import br.edu.ifpb.dac.projeto.domain.Solicitacao;
import br.edu.ifpb.projeto.services.SolicitacaoService;
import java.util.List;
import java.util.Objects;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class SolicitacaoServiceImpl implements SolicitacaoService{

     @PersistenceContext
    private EntityManager em;
    
    @Override
    public void adicionar(Solicitacao solicitacao) {
      Objects.requireNonNull(solicitacao,"Solicitacao inválido!");
       em.persist(solicitacao);
    }

    @Override
    public Solicitacao buscar(int codigo) {
       return em.find(Solicitacao.class, codigo);
    }

    @Override
    public void remover(int codigo) {
        em.remove(em.merge(codigo));
    }

    @Override
    public void atualizar(Solicitacao solicitacao) {
       em.merge(solicitacao);
    }

    @Override
    public List<Solicitacao> todos() {
        return em.createQuery("FROM " + 
         Solicitacao.class.getName()).getResultList();
    }
}
