/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.projeto.services;

import br.edu.ifpb.dac.projeto.domain.Professor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ericl
 */
@Local
public interface ProfessorFacadeLocal {

    void create(Professor professor);

    void edit(Professor professor);

    void remove(Professor professor);

    Professor find(Object id);

    List<Professor> findAll();

    List<Professor> findRange(int[] range);

    int count();
    
}
