package de.gbsschulen.wagenhuber.wawi.rest;

import javax.persistence.*;
import java.util.List;

public class ArtikelService {

    private EntityManagerFactory emf;
    private EntityManager em;

    public ArtikelService() {
        emf = Persistence.createEntityManagerFactory("artikel");
        em = emf.createEntityManager();
    }


    public List<Artikel> getAllArtikel() {
        TypedQuery<Artikel> typedQuery = em.createQuery("SELECT a from Artikel a", Artikel.class);
        return typedQuery.getResultList();
    }


    public Artikel getArtikel(int id) {
        return em.find(Artikel.class, id);
    }


    public Artikel deleteArtikel(int id) {
        Artikel artikel = getArtikel(id);
        if (artikel != null) {
            em.getTransaction().begin();
            em.remove(artikel);
            em.getTransaction().commit();
        }
        return artikel;
    }

    public List<Artikel> getArtikelHigherThanPrice(double vkpreis) {
        //Auch mit JPA können klassische SQL-Statements verwendet werden:
        //Query nativeQuerry = em.createNamedQuery("select * from artikel where vkpreis > " + vkpreis);
        //return nativeQuerry.getResultList();

        //Lösung mittels TypedQuerry
        TypedQuery<Artikel> typedQuery = em.createQuery("SELECT a from Artikel a where a.vkpreis > " + vkpreis, Artikel.class);
        return typedQuery.getResultList();



    }


}
