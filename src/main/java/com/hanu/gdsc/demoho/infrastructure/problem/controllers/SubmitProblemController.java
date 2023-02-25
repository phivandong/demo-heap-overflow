package com.hanu.gdsc.demoho.infrastructure.problem.controllers;

import com.hanu.gdsc.demoho.domain.problem.models.ProgrammingLanguage;
import com.hanu.gdsc.demoho.domain.problem.services.SubmitService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubmitProblemController {
    @Autowired
    private SubmitService submitService;

    @AllArgsConstructor
    @NoArgsConstructor
    public static class SubmitInput {
        public ObjectId coderId;
        public ObjectId problemId;
        public String code;
        public ProgrammingLanguage programmingLanguage;
    }

    @PostMapping("/practiceProblem/submit")
    public ResponseEntity<?> summit(@RequestBody SubmitInput input) {
        return new ResponseEntity<>(submitService.saveSubmit(input.coderId, input.problemId, input.code, input.programmingLanguage), HttpStatus.OK);
    }
}
