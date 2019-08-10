package br.edu.ifpb.projeto.services;

import br.edu.ifpb.dac.projeto.domain.Relatorio;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface RelatorioService {
    void adicionar(Relatorio relatorio);
    Relatorio buscar(int codigo);
    void remover (int codigo);
    void atualizar(Relatorio relatorio);
    List <Relatorio> todos ();
}
