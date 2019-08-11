package br.edu.ifpb.dac.projeto.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * @author ericl
 */
@Entity
public class Gestor extends Login implements Serializable {

    @OneToMany(orphanRemoval = false, targetEntity = ListaAlmoco.class)
    private List<ListaAlmoco> listaAlmocos;

    public List<ListaAlmoco> getListaAlmocos() {
        if (listaAlmocos == null) {
            listaAlmocos = new ArrayList<>();
        }
        return listaAlmocos;
    }

    public Gestor(String login, String senha, String nome) {
        super(login, senha, nome);
    }

    public Gestor() {
    }

    public Gestor(List<ListaAlmoco> listaAlmocos) {
        this.listaAlmocos = listaAlmocos;
    }
    
    public void setListaAlmocos(List<ListaAlmoco> listaAlmocos) {
        this.listaAlmocos = listaAlmocos;
    }

    public void addListaAlmoco(ListaAlmoco listaAlmoco) {
        getListaAlmocos().add(listaAlmoco);
    }

    public void removeListaAlmoco(ListaAlmoco listaAlmoco) {
        getListaAlmocos().remove(listaAlmoco);
    }

}