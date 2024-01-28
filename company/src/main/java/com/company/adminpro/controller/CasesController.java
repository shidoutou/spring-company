package com.company.adminpro.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.adminpro.model.cases.Cases;
import com.company.adminpro.service.CasesService;

@RestController
@RequestMapping("/api/Cases")
public class CasesController {

    private final CasesService casesService;

    public CasesController(CasesService casesService) {
        this.casesService = casesService;
    }

    @GetMapping
    public List<Cases> findAll() {
        return casesService.findAll();
    }

    @GetMapping("/{id}")
    public Cases findById(@PathVariable Long id) {
        return casesService.findById(id);
    }

    @PostMapping
    public void insert(@RequestBody Cases cases) {
        casesService.insert(cases);
    }

    @PutMapping
    public void update(@RequestBody Cases cases) {
        casesService.update(cases);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        casesService.delete(id);
    }

}
