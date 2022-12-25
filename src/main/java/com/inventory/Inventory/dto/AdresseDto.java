package com.inventory.Inventory.dto;

import com.inventory.Inventory.model.Adresse;
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

    public static AdresseDto getFromEntity(Adresse adresse) {
        if (adresse == null) {
            return null;
            // TODO throw an exception
        }
        return AdresseDto.builder()
                .adressePrincipale(adresse.getAdressePrincipale())
                .adresseSecondaire(adresse.getAdresseSecondaire())
                .ville(adresse.getVille())
                .codePostal(adresse.getCodePostal())
                .pays(adresse.getPays())
                .build();
    }

    public static Adresse SetToEntity(AdresseDto adresseDto) {
        if (adresseDto == null) {
            return null;
            // TODO throw an exception
        }
        Adresse adresse = new Adresse();
        adresse.setAdressePrincipale(adresseDto.getAdressePrincipale());
        adresse.setAdresseSecondaire(adresseDto.getAdresseSecondaire());
        adresse.setVille(adresseDto.getVille());
        adresse.setCodePostal(adresseDto.getCodePostal());
        adresse.setPays(adresseDto.getPays());
        return adresse;
    }
}
