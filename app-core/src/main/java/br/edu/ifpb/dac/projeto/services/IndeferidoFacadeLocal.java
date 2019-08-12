/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.projeto.services;

import br.edu.ifpb.dac.projeto.domain.Indeferido;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ericl
 */
@Local
public interface IndeferidoFacadeLocal {

    void create(Indeferido indeferido);

    void edit(Indeferido indeferido);

    void remove(Indeferido indeferido);

    Indeferido find(Object id);

    List<Indeferido> findAll();

    List<Indeferido> findRange(int[] range);

    int count();
    
}
