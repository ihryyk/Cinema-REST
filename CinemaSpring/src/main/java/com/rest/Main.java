package com.rest;

import com.rest.model.entity.Language;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceUnitName");
        Language language = new Language();
        language.setName("Enggg");
      EntityManager entityManager = entityManagerFactory.createEntityManager();
     entityManager.getTransaction().begin();
     entityManager.persist(language);
      entityManager.getTransaction().commit();
       entityManager.close();

    }
}
