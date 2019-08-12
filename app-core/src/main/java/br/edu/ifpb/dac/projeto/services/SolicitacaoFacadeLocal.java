/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.projeto.services;

import br.edu.ifpb.dac.projeto.domain.Solicitacao;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ericl
 */
@Local
public interface SolicitacaoFacadeLocal {

    void create(Solicitacao solicitacao);

    void edit(Solicitacao solicitacao);

    void remove(Solicitacao solicitacao);

    Solicitacao find(Object id);

    List<Solicitacao> findAll();

    List<Solicitacao> findRange(int[] range);

    int count();
    
}
