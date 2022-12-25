package com.inventory.Inventory.dto;

import com.inventory.Inventory.model.Entreprise;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EntrepriseDto {
    private Integer id;
    private String nom;

    public static EntrepriseDto getFromEntity(Entreprise entreprise) {
        if(entreprise == null) {
            return null;
            // TODO throw an exception
        }
        return EntrepriseDto.builder()
                .id(entreprise.getId())
                .nom(entreprise.getNom())
                .build();
    }

    public static Entreprise SetToEntity(EntrepriseDto entrepriseDto) {
        if(entrepriseDto == null) {
            return null;
            // TODO throw an exception
        }
        Entreprise entreprise = new Entreprise();
        entreprise.setId(entrepriseDto.getId());
        entreprise.setNom(entrepriseDto.getNom());
        return entreprise;
    }
}
