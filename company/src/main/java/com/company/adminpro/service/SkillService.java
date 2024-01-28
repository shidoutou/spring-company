package com.company.adminpro.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.adminpro.mapper.SkillMapper;
import com.company.adminpro.model.Skill;

@Service
public class SkillService {

    private final SkillMapper skillMapper;

    public SkillService(SkillMapper skillMapper) {
        this.skillMapper = skillMapper;
    }

    public List<Skill> findAll() {
        return skillMapper.findAll();
    }

    public Skill findById(Long id) {
        return skillMapper.findById(id);
    }

    @Transactional
    public void insert(Skill skill) {
        skillMapper.insert(skill);
    }

    @Transactional
    public void update(Skill skill) {
        skillMapper.update(skill);
    }

    @Transactional
    public void delete(Long id) {
        skillMapper.delete(id);
    }
}
