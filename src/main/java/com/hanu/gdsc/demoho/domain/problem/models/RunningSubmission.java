package com.hanu.gdsc.demoho.domain.problem.models;

import org.bson.types.ObjectId;

public class RunningSubmission {
    private ObjectId id;
    private ObjectId coderId;
    private ObjectId problemId;
    private String code;
    private ProgrammingLanguage programmingLanguage;

    public RunningSubmission(ObjectId id, ObjectId coderId, ObjectId problemId, String code, ProgrammingLanguage programmingLanguage) {
        this.id = id;
        this.coderId = coderId;
        this.problemId = problemId;
        this.code = code;
        this.programmingLanguage = programmingLanguage;
    }

    public static RunningSubmission create(ObjectId coderId, ObjectId problemId, String code, ProgrammingLanguage programmingLanguage) {
        return new RunningSubmission(new ObjectId(), coderId, problemId, code, programmingLanguage);
    }

    public ObjectId getId() {
        return id;
    }

    public ObjectId getCoderId() {
        return coderId;
    }

    public ObjectId getProblemId() {
        return problemId;
    }

    public String getCode() {
        return code;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage.toString();
    }
}
