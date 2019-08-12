/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.projeto.services;

import br.edu.ifpb.dac.projeto.domain.CAEST;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ericl
 */
@Local
public interface CAESTFacadeLocal {

    void create(CAEST cAEST);

    void edit(CAEST cAEST);

    void remove(CAEST cAEST);

    CAEST find(Object id);

    List<CAEST> findAll();

    List<CAEST> findRange(int[] range);

    int count();
    
}
