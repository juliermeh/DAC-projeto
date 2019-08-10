package br.edu.ifpb.projeto.services.impl;

import br.edu.ifpb.dac.projeto.domain.Aluno;
import br.edu.ifpb.projeto.services.AlunoService;
import java.util.List;
import java.util.Objects;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AlunoServiceImpl implements AlunoService{

    @PersistenceContext
    private EntityManager em;
        
    @Override
    public void adicionar(Aluno aluno) {
       Objects.requireNonNull(aluno,"Aluno inválido!");
       em.persist(aluno);      
    }

    @Override
    public Aluno buscar(int id) {
        return em.find(Aluno.class, id);
    }

    @Override
    public void remover(int id) {
        em.remove(em.merge(id));
    }

    @Override
    public void atualizar(Aluno aluno) {
       em.merge(aluno);
    }

    @Override
    public List<Aluno> todos() {
       return em.createQuery("FROM " + 
         Aluno.class.getName()).getResultList();
    }
    
}
