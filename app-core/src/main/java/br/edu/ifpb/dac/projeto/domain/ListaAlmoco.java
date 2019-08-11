package br.edu.ifpb.dac.projeto.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Optional;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Persistence;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author ericl
 */
@Entity
public class ListaAlmoco implements Serializable {

    @Id
    @GeneratedValue
    @Column(unique = false, insertable = true, nullable = true, updatable = true, length = 255, scale = 0, precision = 0)
    private Long id;

    @Basic(optional = true)
    @Column(unique = false, insertable = true, nullable = true, updatable = true, length = 255, scale = 0, precision = 0)
    private String matricula;

    @Basic(optional = true)
    @Column(unique = false, insertable = true, nullable = true, updatable = true, length = 255, scale = 0, precision = 0)
    private String nome;

    @Basic(optional = true)
    @Column(unique = false, insertable = true, nullable = true, updatable = true, length = 255, scale = 0, precision = 0)
    private String status;

    @Basic(optional = true)
    @Column(unique = false, insertable = true, nullable = true, updatable = true, length = 255, scale = 0, precision = 0)
    @Temporal(TemporalType.DATE)
    private Date data;

    @ManyToOne(optional = true, targetEntity = CAEST.class)
    private CAEST CAEST;

    public ListaAlmoco(String matricula, String nome, String status, Date data, CAEST CAEST) {
        this.matricula = matricula;
        this.nome = nome;
        this.status = status;
        this.data = data;
        this.CAEST = CAEST;
    }

    public ListaAlmoco() {
    } 
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Optional<String> getMatricula() {
        return Optional.ofNullable(matricula);
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Optional<String> getNome() {
        return Optional.ofNullable(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Optional<Date> getData() {
        return Optional.ofNullable(data);
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Optional<CAEST> getCAEST() {
        return Optional.ofNullable(CAEST);
    }

    public void setCAEST(CAEST CAEST) {
        this.CAEST = CAEST;
    }

    public void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DEFAULT_PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

}