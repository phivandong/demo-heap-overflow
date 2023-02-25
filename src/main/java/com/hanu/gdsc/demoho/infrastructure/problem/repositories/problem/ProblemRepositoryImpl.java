package com.hanu.gdsc.demoho.infrastructure.problem.repositories.problem;

import com.hanu.gdsc.demoho.domain.problem.models.Problem;
import com.hanu.gdsc.demoho.domain.problem.repositories.ProblemRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProblemRepositoryImpl implements ProblemRepository {
    @Autowired
    private ProblemJPARepository problemJPARepository;

    @Override
    public Problem getById(ObjectId id) {
        ProblemEntity problemEntity = problemJPARepository.findById(id.toString()).get();
        return ProblemEntity.toDomain(problemEntity);
    }
}
