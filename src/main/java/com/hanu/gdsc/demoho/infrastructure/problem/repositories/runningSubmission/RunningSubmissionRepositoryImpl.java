package com.hanu.gdsc.demoho.infrastructure.problem.repositories.runningSubmission;

import com.hanu.gdsc.demoho.domain.problem.models.RunningSubmission;
import com.hanu.gdsc.demoho.domain.problem.repositories.RunningSubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RunningSubmissionRepositoryImpl implements RunningSubmissionRepository {
    @Autowired
    private RunningSubmissionJPARepository runningSubmissionJPARepository;

    @Override
    public void create(RunningSubmission runningSubmission) {
        runningSubmissionJPARepository.save(RunningSubmissionEntity.fromDomain(runningSubmission));
    }
}
