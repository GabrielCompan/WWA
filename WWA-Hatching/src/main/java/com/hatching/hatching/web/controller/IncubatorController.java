package com.hatching.hatching.web.controller;
import com.hatching.hatching.repository.IncubatorRepository;
import com.hatching.hatching.service.IncubatorService;
import com.hatching.hatching.model.Incubator;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@Controller
public class IncubatorController {

    @Autowired
    private IncubatorService incubatorService;
    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewIncubator (@RequestParam int id
            , @RequestParam int idEgg) {
        incubatorService.saveIncubator(id, idEgg);
        return "Saved";
    }

    @CrossOrigin()
    @GetMapping("/hatching")
    public ResponseEntity<List<Incubator>> getIncubators() {
        List<Incubator> incubators = (List<Incubator>) incubatorService.getAllIncubators();
        return ResponseEntity.ok(incubators);
    }
}
