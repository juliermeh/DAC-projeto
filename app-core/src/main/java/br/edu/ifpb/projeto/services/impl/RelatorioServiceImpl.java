package br.edu.ifpb.projeto.services.impl;

import br.edu.ifpb.dac.projeto.domain.Relatorio;
import br.edu.ifpb.projeto.services.RelatorioService;
import java.util.List;
import java.util.Objects;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class RelatorioServiceImpl implements RelatorioService{

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void adicionar(Relatorio relatorio) {
      Objects.requireNonNull(relatorio,"Relatório inválido!");
       em.persist(relatorio);
    }

    @Override
    public Relatorio buscar(int codigo) {
       return em.find(Relatorio.class, codigo);
    }

    @Override
    public void remover(int codigo) {
        em.remove(em.merge(codigo));
    }

    @Override
    public void atualizar(Relatorio relatorio) {
       em.merge(relatorio);
    }

    @Override
    public List<Relatorio> todos() {
        return em.createQuery("FROM " + 
         Relatorio.class.getName()).getResultList();
    }
    
}
