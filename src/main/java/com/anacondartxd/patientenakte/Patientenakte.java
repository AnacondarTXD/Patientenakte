package com.anacondartxd.patientenakte;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Patientenakte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String vorname;
    private String nachname;
    private String geburtsdatum;
    private String geschlecht;
    private Integer gewicht;
    private Integer groesse;
    private String blutgruppe;

    public Patientenakte() {
    }

    public Patientenakte(Integer id, String vorname, String nachname, String geburtsdatum, String geschlecht, Integer gewicht, Integer groesse, String blutgruppe) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
        this.geschlecht = geschlecht;
        this.gewicht = gewicht;
        this.groesse = groesse;
        this.blutgruppe = blutgruppe;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public Integer getGewicht() {
        return gewicht;
    }

    public void setGewicht(Integer gewicht) {
        this.gewicht = gewicht;
    }

    public Integer getGroesse() {
        return groesse;
    }

    public void setGroesse(Integer groesse) {
        this.groesse = groesse;
    }

    public String getBlutgruppe() {
        return blutgruppe;
    }

    public void setBlutgruppe(String blutgruppe) {
        this.blutgruppe = blutgruppe;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Patientenakte that = (Patientenakte) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getVorname(), that.getVorname()) && Objects.equals(getNachname(), that.getNachname()) && Objects.equals(getGeburtsdatum(), that.getGeburtsdatum()) && Objects.equals(getGeschlecht(), that.getGeschlecht()) && Objects.equals(getGewicht(), that.getGewicht()) && Objects.equals(getGroesse(), that.getGroesse()) && Objects.equals(getBlutgruppe(), that.getBlutgruppe());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getVorname(), getNachname(), getGeburtsdatum(), getGeschlecht(), getGewicht(), getGroesse(), getBlutgruppe());
    }
}
