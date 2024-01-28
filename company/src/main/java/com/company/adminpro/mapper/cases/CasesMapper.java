package com.company.adminpro.mapper.cases;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.company.adminpro.model.cases.Cases;

@Mapper
public interface CasesMapper {

    List<Cases> findAll();

    Cases findById(Long id);

    void insert(Cases cases);

    void update(Cases cases);

    void delete(Long id);

    String findMaxCaseIdForToday();
}
