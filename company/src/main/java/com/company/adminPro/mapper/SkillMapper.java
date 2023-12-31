package com.company.adminPro.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.company.adminPro.model.Skill;

@Mapper
public interface SkillMapper {

    List<Skill> findAll();

    Skill findById(Long id);

    void insert(Skill skill);

    void update(Skill skill);

    void delete(Long id);
}
