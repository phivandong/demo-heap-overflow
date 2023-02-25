package com.hanu.gdsc.demoho.domain.problem.repositories;

import com.hanu.gdsc.demoho.domain.problem.models.Problem;
import org.bson.types.ObjectId;

public interface ProblemRepository {
    Problem getById(ObjectId id);
}
