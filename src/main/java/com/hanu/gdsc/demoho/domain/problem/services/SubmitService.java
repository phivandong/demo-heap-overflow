package com.hanu.gdsc.demoho.domain.problem.services;

import com.hanu.gdsc.demoho.domain.problem.models.ProgrammingLanguage;
import org.bson.types.ObjectId;

public interface SubmitService {
    String saveSubmit(ObjectId coderId, ObjectId problemId, String code, ProgrammingLanguage programmingLanguage);
}
