package com.hatching.hatching.web.controller;
import com.hatching.hatching.service.IncubatorService;
import com.hatching.hatching.model.Incubator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

class ValueDto {
    public int value;
}
@RestController
@Controller
public class IncubatorController {

    @Autowired
    private IncubatorService incubatorService;
    @PostMapping(path="/hatching/add/{idIncubator}") // Map ONLY POST Requests
    public @ResponseBody Incubator addNewEgg (@PathVariable int idIncubator, @RequestBody ValueDto idEgg) {
        return incubatorService.saveEgg(idIncubator, idEgg.value);
    }

    @CrossOrigin()
    @GetMapping("/hatching/all")
    public ResponseEntity<List<Incubator>> getIncubators() {
        return (ResponseEntity<List<Incubator>>) incubatorService.getAllIncubators();
    }

    @CrossOrigin()
    @GetMapping("/hatching")
    public ResponseEntity<List<Incubator>> createIncubators() {
        return (ResponseEntity<List<Incubator>>) incubatorService.createIncubators();
    }

    @PostMapping(path="/hatching/withdraw/{idIncubator}") // Map ONLY POST Requests
    public @ResponseBody Incubator withdrawEgg (@PathVariable int idIncubator, @RequestBody ValueDto idEgg) {
        return incubatorService.withdrawEgg(idIncubator, idEgg.value);
    }


}
