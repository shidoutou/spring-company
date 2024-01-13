package com.company.adminpro.mapper.cases;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.company.adminpro.model.Skill;

@Mapper
public interface CaseMapper {

    List<Skill> findAll();

    Skill findById(Long id);

    void insert(Skill skill);

    void update(Skill skill);

    void delete(Long id);
}
