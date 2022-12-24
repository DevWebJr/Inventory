package com.inventory.Inventory.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AdresseDto {
    private String adressePrincipale;
    private String adresseSecondaire;
    private String ville;
    private String codePostal;
    private String pays;
}
