package com.hatching.hatching.web.controller;
import com.hatching.hatching.model.Egg;
import com.hatching.hatching.service.IncubatorService;
import com.hatching.hatching.model.Incubator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

class ValueDto {
    public int value;
}
@RestController
@Controller
public class IncubatorController {

    @Autowired
    private IncubatorService incubatorService;
    @CrossOrigin()
    @PostMapping(path="/hatching/add/{idIncubator}") // Map ONLY POST Requests
    public @ResponseBody Incubator addNewEgg (@PathVariable int idIncubator, @RequestBody ValueDto idEgg) {
        return incubatorService.saveEgg(idIncubator, idEgg.value);
    }

    @CrossOrigin()
    @GetMapping("/hatching/all")
    public Iterable<Incubator> getIncubators() {
        return (Iterable<Incubator>) incubatorService.getAllIncubators();
    }

    @CrossOrigin()
    @GetMapping("/hatching")
    public Iterable<Incubator> createIncubators() {
        return (Iterable<Incubator>) incubatorService.createIncubators();
    }
    @CrossOrigin()
    @PostMapping(path="/hatching/withdraw/{idIncubator}") // Map ONLY POST Requests
    public @ResponseBody Incubator withdrawEgg (@PathVariable int idIncubator) {
        Incubator idEgg = incubatorService.getIncubatorbyId(idIncubator);
        return idEgg;
    }
}
