package com.company.adminpro.mapper.cases;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.company.adminpro.model.cases.CaseLog;

@Mapper
public interface CaseLogMapper {

    List<CaseLog> findAll();

    CaseLog findById(Long id);

    void insert(CaseLog caseLog);

    void update(CaseLog caseLog);

    void delete(Long id);
}
