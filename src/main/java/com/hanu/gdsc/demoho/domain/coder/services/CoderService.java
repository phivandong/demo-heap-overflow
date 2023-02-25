package com.hanu.gdsc.demoho.domain.coder.services;

import com.hanu.gdsc.demoho.domain.coder.models.Coder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

public interface CoderService {
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Input {
        public String name;
        public int age;
    }

    void create(Input input);
    Coder getCoderById(ObjectId id);
}
