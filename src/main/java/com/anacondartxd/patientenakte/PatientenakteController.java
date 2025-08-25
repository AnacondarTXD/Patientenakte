package com.anacondartxd.patientenakte;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/patientenakte")
public class PatientenakteController {
    private final PatientenakteService service;
    public PatientenakteController(PatientenakteService service) {
        this.service = service;
    }
    @GetMapping
    public List<Patientenakte> getAllPatientenakte() {
        return service.getAllPatientenakte();
    }
    @GetMapping("{id}")
    public Patientenakte getPatientenakteById(@PathVariable Integer id) {
        return service.getPatientenakteById(id);
    }
    @PostMapping
    public void addNewPatientenakte(@RequestBody Patientenakte patientenakte) {
        service.addNewPatientenakte(patientenakte);
    }
    @DeleteMapping("{id}")
    public void deletePatientenakteById(@PathVariable Integer id) {
        service.deletePatientenakteById(id);
    }
    @PutMapping
    public void updatePatientenakte(@RequestParam String vorname,
                                    @RequestParam String nachname,
                                    @RequestParam String geburtsdatum,
                                    @RequestBody Patientenakte patientenakte) {
        service.updatePatientenakte(vorname, nachname, geburtsdatum, patientenakte);
    }
}
