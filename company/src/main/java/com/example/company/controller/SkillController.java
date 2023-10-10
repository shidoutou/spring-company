package com.example.company.controller;

import com.example.company.model.Skill;
import com.example.company.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping
    public List<Skill> findAll() {
        return skillService.findAll();
    }

    @GetMapping("/{id}")
    public Skill findById(@PathVariable Long id) {
        return skillService.findById(id);
    }

    @PostMapping
    public void insert(@RequestBody Skill skill) {
        skillService.insert(skill);
    }

    @PutMapping
    public void update(@RequestBody Skill skill) {
        skillService.update(skill);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        skillService.delete(id);
    }
}
