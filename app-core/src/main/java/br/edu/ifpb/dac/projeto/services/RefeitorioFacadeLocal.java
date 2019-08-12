/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.projeto.services;

import br.edu.ifpb.dac.projeto.domain.Refeitorio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ericl
 */
@Local
public interface RefeitorioFacadeLocal {

    void create(Refeitorio refeitorio);

    void edit(Refeitorio refeitorio);

    void remove(Refeitorio refeitorio);

    Refeitorio find(Object id);

    List<Refeitorio> findAll();

    List<Refeitorio> findRange(int[] range);

    int count();
    
}
