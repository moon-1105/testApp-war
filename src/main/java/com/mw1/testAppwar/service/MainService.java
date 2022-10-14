package com.mw1.testAppwar.service;

import com.mw1.testAppwar.model.test;
import com.mw1.testAppwar.repository.testDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class MainService {
    @Autowired
    private testDao dao;

    public List<test> findAll() {
        return dao.findAll();

    }
}
