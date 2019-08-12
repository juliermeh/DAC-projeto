/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.projeto.services;

import br.edu.ifpb.dac.projeto.domain.Aluno;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ericl
 */
@Local
public interface AlunoFacadeLocal {

    void create(Aluno aluno);

    void edit(Aluno aluno);

    void remove(Aluno aluno);

    Aluno find(Object id);

    List<Aluno> findAll();

    List<Aluno> findRange(int[] range);

    int count();
    
}
