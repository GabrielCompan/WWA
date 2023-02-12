package com.hatching.hatching.service;

import com.hatching.hatching.model.Incubator;
import com.hatching.hatching.repository.IncubatorRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class IncubatorService {
    @Autowired
    private IncubatorRepository incubatorRepository;

    public List<Incubator> createIncubators() {
        Incubator exist = incubatorRepository.findById(1).orElse(null);
        if(exist != null) {
            throw new IllegalArgumentException("Incubator already exist");
        }
        else
        {
            ArrayList<Incubator> list = new ArrayList<>();
            Incubator n1 = new Incubator();
            n1.setId(1);
            incubatorRepository.save(n1);
            list.add(n1);
            Incubator n2 = new Incubator();
            n2.setId(1);
            incubatorRepository.save(n2);
            list.add(n2);
            Incubator n3 = new Incubator();
            n3.setId(1);
            incubatorRepository.save(n3);
            list.add(n3);
            return list;
        }
    }

    public Incubator saveEgg(int id, int idEgg) {
        Incubator n = incubatorRepository.findById(id).orElse(null);
        if (n == null) {
            throw new IllegalArgumentException("Incubator not found");
        }
        else if (n.getEggs().size() > 1) {
            throw new IllegalArgumentException("Incubator is full");
        }
        else {
            n.addEgg(idEgg);
            incubatorRepository.save(n);
            return n;
        }
    }

    public Incubator withdrawEgg(int id, int idegg) {
        Incubator n = incubatorRepository.findById(id).orElse(null);
        if (n == null) {
            throw new IllegalArgumentException("Incubator not found");
        }
        else if (n.getEggs().size() == 0) {
            throw new IllegalArgumentException("Incubator is empty");
        }
        else {
            n.getEggs().remove(idegg);
            incubatorRepository.save(n);
            return n;
        }
    }
    public Iterable<Incubator> getAllIncubators() {
        return incubatorRepository.findAll();
    }

    public Incubator getIncubatorbyId(int idIncubator) {
        return incubatorRepository.findById(idIncubator).orElse(null);
    }
};

