
package br.edu.ifpb.projeto.services.impl;

import br.edu.ifpb.dac.projeto.domain.Usuario;
import br.edu.ifpb.dac.projeto.domain.Usuario;
import br.edu.ifpb.projeto.services.UsuarioService;
import java.util.List;
import java.util.Objects;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UsuarioServiceImpl implements UsuarioService {

     @PersistenceContext
    private EntityManager em;
    
    @Override
    public void adicionar(Usuario usuario) {
      Objects.requireNonNull(usuario,"Relatório inválido!");
       em.persist(usuario);
    }

    @Override
    public Usuario buscar(int id) {
       return em.find(Usuario.class, id);
    }

    @Override
    public void remover(int id) {
        em.remove(em.merge(id));
    }

    @Override
    public void atualizar(Usuario usuario) {
       em.merge(usuario);
    }

    @Override
    public List<Usuario> todos() {
        return em.createQuery("FROM " + 
         Usuario.class.getName()).getResultList();
    }
}
