package com.example.company.service;

import com.example.company.mapper.SkillMapper;
import com.example.company.model.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    @Autowired
    private SkillMapper skillMapper;

    public List<Skill> findAll() {
        return skillMapper.findAll();
    }

    public Skill findById(Long id) {
        return skillMapper.findById(id);
    }

    public void insert(Skill skill) {
        skillMapper.insert(skill);
    }

    public void update(Skill skill) {
        skillMapper.update(skill);
    }

    public void delete(Long id) {
        skillMapper.delete(id);
    }
}
