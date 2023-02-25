package com.hanu.gdsc.demoho.infrastructure.coder.repositories;

import com.hanu.gdsc.demoho.domain.coder.models.Coder;
import com.hanu.gdsc.demoho.domain.coder.repositories.CoderRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CoderRepositoryImpl implements CoderRepository {
    @Autowired
    private CoderJpaRepository coderJpaRepository;

    @Override
    public void save(Coder coder) {
        coderJpaRepository.save(CoderEntity.fromDomain(coder));
    }

    @Override
    public Coder getById(ObjectId id) {
        return coderJpaRepository.findById(id.toString()).get().toDomain();
    }
}
