package com.hanu.gdsc.demoho.infrastructure.coder.controllers;

import com.hanu.gdsc.demoho.domain.coder.models.Coder;
import com.hanu.gdsc.demoho.domain.coder.services.CoderService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CoderController {
    @Autowired
    private CoderService coderService;

    @PostMapping("/coder/create")
    public void createCoder(@RequestBody CoderService.Input input) {
        coderService.create(input);
    }

    @GetMapping("/coder/get-coder/{id}")
    public Coder getCoder(@RequestParam ObjectId id) {
        return coderService.getCoderById(id);
    }
}
