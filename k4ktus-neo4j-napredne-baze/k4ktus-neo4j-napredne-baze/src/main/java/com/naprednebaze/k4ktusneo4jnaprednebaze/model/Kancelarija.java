package com.naprednebaze.k4ktusneo4jnaprednebaze.model;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Data
@Node("Kancelarija")
public class Kancelarija {
    @Id
    @GeneratedValue
    private Long id;
    private Long broj_kancelarije;
    private Double kvadratura;
    private Long broj_radnika;
    private Boolean status;
    private Long idPoslovnogProstora;

    @Relationship(type = "Iznajmljuje" , direction = Relationship.Direction.OUTGOING)
    private Firma firma;

    public Kancelarija() {

    }

    public Kancelarija(Long broj_kancelarije, Double kvadratura, Long broj_radnika, Boolean status, Long idPoslovnogProstora) {
        this.id = null;
        this.broj_kancelarije = broj_kancelarije;
        this.kvadratura = kvadratura;
        this.broj_radnika = broj_radnika;
        this.status = status;
        this.idPoslovnogProstora = idPoslovnogProstora;
    }

    public Kancelarija withId(Long id) {
        if (this.id.equals(id)) {
            return this;
        } else {
            Kancelarija newObject = new Kancelarija(this.broj_kancelarije, this.kvadratura, this.broj_radnika, this.status, this.idPoslovnogProstora);
            newObject.id = id;
            return newObject;
        }
    }
}
