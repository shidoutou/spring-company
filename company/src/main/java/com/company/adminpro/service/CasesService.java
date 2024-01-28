package com.company.adminpro.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.adminpro.mapper.cases.CasesMapper;
import com.company.adminpro.model.cases.Cases;

@Service
public class CasesService {

    private final CasesMapper casesMapper;

    public CasesService(CasesMapper casesMapper) {
        this.casesMapper = casesMapper;
    }

    public List<Cases> findAll() {
        return casesMapper.findAll();
    }

    public Cases findById(Long id) {
        return casesMapper.findById(id);
    }

    @Transactional
    public void insert(Cases cases) {
        casesMapper.insert(cases);
    }

    @Transactional
    public void update(Cases cases) {
        casesMapper.update(cases);
    }

    @Transactional
    public void delete(Long id) {
        casesMapper.delete(id);
    }
}
