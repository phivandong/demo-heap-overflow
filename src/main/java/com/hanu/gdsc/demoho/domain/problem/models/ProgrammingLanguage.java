package com.hanu.gdsc.demoho.domain.problem.models;

public enum ProgrammingLanguage {
    JAVA, PYTHON, CPLUSPLUS, JAVASCRIPT;

    public static ProgrammingLanguage from(String val) throws Exception {
        switch (val) {
            case "JAVA":
                return JAVA;
            case "PYTHON":
                return PYTHON;
            case "CPLUSPLUS":
                return CPLUSPLUS;
            case "JAVASCRIPT":
                return JAVASCRIPT;
            default:
                throw new Exception(
                        "Invalid programming language, valid " +
                                "values are: [JAVA, PYTHON, CPLUSPLUS, JAVASCRIPT].");
        }
    }
}
