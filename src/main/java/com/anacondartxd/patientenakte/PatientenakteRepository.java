package com.anacondartxd.patientenakte;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PatientenakteRepository extends CrudRepository<Patientenakte, Integer>{

    Optional<Patientenakte> findByVornameAndNachnameAndGeburtsdatum(String vorname, String nachname, String geburtsdatum);
}
