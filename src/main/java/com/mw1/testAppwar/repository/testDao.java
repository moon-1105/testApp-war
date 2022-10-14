package com.mw1.testAppwar.repository;

import com.mw1.testAppwar.model.test;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class testDao {
    @PersistenceContext
    private EntityManager entityManager;

    public List<test> findAll() {
        return entityManager
                .createQuery("from " + test.class.getName()).getResultList();
    }
}
