package com.inventory.Inventory.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@EqualsAndHashCode
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Adresse implements Serializable {
    @Column(name = "adresse_principale")
    private String adressePrincipale;
    @Column(name = "adresse_secondaire")
    private String adresseSecondaire;
    @Column(name = "ville")
    private String ville;
    @Column(name = "code_postal")
    private String codePostal;
    @Column(name = "pays")
    private String pays;

}
