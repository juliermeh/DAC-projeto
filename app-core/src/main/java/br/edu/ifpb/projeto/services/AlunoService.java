package br.edu.ifpb.projeto.services;

import br.edu.ifpb.dac.projeto.domain.Aluno;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface AlunoService {
    void adicionar(Aluno aluno);
    Aluno buscar(int id);
    void remover (int id);
    void atualizar(Aluno aluno);
    List <Aluno> todos ();
}
