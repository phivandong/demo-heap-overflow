package com.hanu.gdsc.demoho.domain.problem.models;

import org.bson.types.ObjectId;

import java.util.List;

public class Problem {
    private ObjectId id;
    private String name;
    private List<ProgrammingLanguage> allowedLang;

    public Problem(ObjectId id, String name, List<ProgrammingLanguage> allowedLang) {
        this.id = id;
        this.name = name;
        this.allowedLang = allowedLang;
    }

    public static Problem create(String name, List<ProgrammingLanguage> allowedLang) {
        return new Problem(new ObjectId(), name, allowedLang);
    }

    public ObjectId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<ProgrammingLanguage> getAllowedLang() {
        return allowedLang;
    }
}
