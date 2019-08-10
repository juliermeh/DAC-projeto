package br.edu.ifpb.projeto.services;

import br.edu.ifpb.dac.projeto.domain.Usuario;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface UsuarioService {
    void adicionar(Usuario usuario);
    Usuario buscar(int id);
    void remover (int id);
    void atualizar(Usuario usuario);
    List <Usuario> todos ();
}
