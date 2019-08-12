/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.projeto.services;

import br.edu.ifpb.dac.projeto.domain.AlunoContemplado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ericl
 */
@Local
public interface AlunoContempladoFacadeLocal {

    void create(AlunoContemplado alunoContemplado);

    void edit(AlunoContemplado alunoContemplado);

    void remove(AlunoContemplado alunoContemplado);

    AlunoContemplado find(Object id);

    List<AlunoContemplado> findAll();

    List<AlunoContemplado> findRange(int[] range);

    int count();
    
}
