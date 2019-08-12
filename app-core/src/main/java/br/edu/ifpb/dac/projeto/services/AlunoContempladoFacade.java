/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.projeto.services;

import br.edu.ifpb.dac.projeto.domain.AlunoContemplado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ericl
 */
@Stateless
public class AlunoContempladoFacade extends AbstractFacade<AlunoContemplado> {

    @PersistenceContext(unitName = "DEFAULT_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AlunoContempladoFacade() {
        super(AlunoContemplado.class);
    }
    
}
