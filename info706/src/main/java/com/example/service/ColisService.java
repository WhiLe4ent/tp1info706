package com.example.service;

import com.example.colis.Colis;
import com.example.colis.Position;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;


@Stateless
public class ColisService {

    @PersistenceContext
    private EntityManager entityManager;


    // Enregistrer un nouveau colis
    public void enregistrerColis(Colis colis) {
        entityManager.persist(colis);
    }

    // Obtenir un colis par son ID
    public Colis obtenirColisParId(Long id) {
        return entityManager.find(Colis.class, id);
    }

    // Enregistrer une nouvelle position pour un colis
    public void enregistrerPosition(Position position) {
        entityManager.persist(position);
    }

    // Obtenir l'historique des positions pour un colis
    public List<Position> obtenirPositionsParColisId(Long colisId) {
        return entityManager.createQuery("SELECT p FROM Position p WHERE p.colis.id = :colisId", Position.class)
                 .setParameter("colisId", colisId)
                 .getResultList();
    }
}
