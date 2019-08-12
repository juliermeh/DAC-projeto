/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.projeto.services;

import br.edu.ifpb.dac.projeto.domain.Gestor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ericl
 */
@Local
public interface GestorFacadeLocal {

    void create(Gestor gestor);

    void edit(Gestor gestor);

    void remove(Gestor gestor);

    Gestor find(Object id);

    List<Gestor> findAll();

    List<Gestor> findRange(int[] range);

    int count();
    
}
