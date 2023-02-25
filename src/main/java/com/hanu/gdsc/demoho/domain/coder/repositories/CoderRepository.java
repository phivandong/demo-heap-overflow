package com.hanu.gdsc.demoho.domain.coder.repositories;

import com.hanu.gdsc.demoho.domain.coder.models.Coder;
import org.bson.types.ObjectId;

public interface CoderRepository {
    void save(Coder coder);
    Coder getById(ObjectId id);
}
