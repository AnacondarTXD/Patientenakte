package com.anacondartxd.patientenakte;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientenakteService {
    private final PatientenakteRepository repository;

    public PatientenakteService(PatientenakteRepository repository) {
        this.repository = repository;
    }

    public List<Patientenakte> getAllPatientenakte() {
        return (List<Patientenakte>) repository.findAll();
    }

    public Patientenakte getPatientenakteById(Integer id) {
        return repository.findById(id).orElseThrow(() -> new IllegalStateException(
            "Patientenakte mit der " + id + " existiert nicht."));
    }

    public void addNewPatientenakte(Patientenakte patientenakte) {
        repository.save(patientenakte);
    }

    public void deletePatientenakteById(Integer id) {
        if (!repository.existsById(id)) {throw new IllegalStateException(
            "Patientenakte mit der " + id + " existiert nicht.");}
        repository.deleteById(id);
    }

    public void updatePatientenakte(String suchVorname,
                                    String suchNachname,
                                    String suchGeburtsdatum,
                                    Patientenakte update) {
        Patientenakte old = repository
                .findByVornameAndNachnameAndGeburtsdatum(suchVorname, suchNachname, suchGeburtsdatum)
                .orElseThrow(() -> new IllegalStateException(
                    "Patientenakte mit der Person " + suchVorname + " " + suchNachname + " " + suchGeburtsdatum + " existiert nicht."));

        if (update.getVorname() != null) old.setVorname(update.getVorname());
        if (update.getNachname() != null) old.setNachname(update.getNachname());
        if (update.getGeburtsdatum() != null) old.setGeburtsdatum(update.getGeburtsdatum());
        if (update.getGeschlecht() != null) old.setGeschlecht(update.getGeschlecht());
        if (update.getGewicht() != null) old.setGewicht(update.getGewicht());
        if (update.getGroesse() != null) old.setGroesse(update.getGroesse());
        if (update.getBlutgruppe() != null) old.setBlutgruppe(update.getBlutgruppe());
        repository.save(old);
    }
}
