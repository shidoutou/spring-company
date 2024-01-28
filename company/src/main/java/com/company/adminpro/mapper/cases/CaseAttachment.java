package com.company.adminpro.mapper.cases;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CaseAttachment {

    List<CaseAttachment> findAll();

    CaseAttachment findById(Long id);

    void insert(CaseAttachment caseAttachment);

    void update(CaseAttachment caseAttachment);

    void delete(Long id);
}
