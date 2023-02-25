package com.hanu.gdsc.demoho.domain.problem.services;

import com.hanu.gdsc.demoho.domain.problem.models.ProgrammingLanguage;
import com.hanu.gdsc.demoho.domain.problem.models.RunningSubmission;
import com.hanu.gdsc.demoho.domain.problem.repositories.RunningSubmissionRepository;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SubmitServiceImpl implements SubmitService {
    private final RunningSubmissionRepository runningSubmissionRepository;

    @Override
    public String saveSubmit(ObjectId coderId, ObjectId problemId, String code, ProgrammingLanguage programmingLanguage) throws RuntimeException {
        if (code == null || code.trim().isEmpty()) {
            throw new RuntimeException("Code must be non-blank");
        }
        final RunningSubmission runningSubmission = RunningSubmission.create(coderId, problemId, code, programmingLanguage);
        runningSubmissionRepository.create(runningSubmission);
        return runningSubmission.getId().toString();
    }
}
