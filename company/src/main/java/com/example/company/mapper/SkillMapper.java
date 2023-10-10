package com.example.company.mapper;

import com.example.company.model.Skill;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface SkillMapper {

    List<Skill> findAll();

    Skill findById(Long id);

    void insert(Skill skill);

    void update(Skill skill);

    void delete(Long id);
}
