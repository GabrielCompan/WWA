package com.hatching.hatching.service;

import com.hatching.hatching.model.Incubator;
import org.apache.catalina.connector.Response;
import com.hatching.hatching.repository.IncubatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class IncubatorService {
    @Autowired
    private IncubatorRepository incubatorRepository;

    public void saveIncubator( int id, int idEgg) {
        Incubator n = new Incubator();
        n.setId(id);
        n.setIdEgg(idEgg);
        incubatorRepository.save(n);
    }
    public Iterable<Incubator> getAllIncubators() {
        return incubatorRepository.findAll();
    }
};

