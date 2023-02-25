package com.hanu.gdsc.demoho.domain.coder.services;

import com.hanu.gdsc.demoho.domain.coder.models.Coder;
import com.hanu.gdsc.demoho.domain.coder.repositories.CoderRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoderServiceImpl implements CoderService {
    @Autowired
    private CoderRepository coderRepository;

    @Override
    public void create(Input input) {
        Coder coder = Coder.create(input.name, input.age);
        coderRepository.save(coder);
    }

    @Override
    public Coder getCoderById(ObjectId id) {
        return coderRepository.getById(id);
    }
}
