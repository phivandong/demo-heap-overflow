package com.hanu.gdsc.demoho.infrastructure.problem.repositories.problem;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hanu.gdsc.demoho.domain.problem.models.Problem;
import com.hanu.gdsc.demoho.domain.problem.models.ProgrammingLanguage;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "problem")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProblemEntity {
    @Id
    @Column(columnDefinition = "CHAR(36)")
    private String id;
    private String name;
    private String allowedProgrammingLanguages;

    public static Problem toDomain(ProblemEntity problemEntity) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        List<String> allowedLang = gson.fromJson(problemEntity.getAllowedProgrammingLanguages(), List.class);
        return Problem.create(problemEntity.getName(), allowedLang.stream().map(s -> ProgrammingLanguage.valueOf(s)).collect(Collectors.toList()));
    }

    public static ProblemEntity fromDomain(Problem problem) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        List<String> allowedLang = problem.getAllowedLang().stream().map(lang -> lang.toString()).toList();
        ProblemEntity problemEntity = ProblemEntity.builder()
                .id(problem.getId().toString())
                .name(problem.getName())
                .allowedProgrammingLanguages(gson.toJson(allowedLang))
                .build();
        return problemEntity;
    }
}
