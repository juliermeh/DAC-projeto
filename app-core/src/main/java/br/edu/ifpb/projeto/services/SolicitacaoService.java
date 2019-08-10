package br.edu.ifpb.projeto.services;

import br.edu.ifpb.dac.projeto.domain.Solicitacao;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface SolicitacaoService {
    void adicionar(Solicitacao solicitacao);
    Solicitacao buscar(int codigo);
    void remover (int codigo);
    void atualizar(Solicitacao solicitacao);
    List <Solicitacao> todos ();
}
