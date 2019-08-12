/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.projeto.services;

import br.edu.ifpb.dac.projeto.domain.ListaAlmoco;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ericl
 */
@Local
public interface ListaAlmocoFacadeLocal {

    void create(ListaAlmoco listaAlmoco);

    void edit(ListaAlmoco listaAlmoco);

    void remove(ListaAlmoco listaAlmoco);

    ListaAlmoco find(Object id);

    List<ListaAlmoco> findAll();

    List<ListaAlmoco> findRange(int[] range);

    int count();
    
}
