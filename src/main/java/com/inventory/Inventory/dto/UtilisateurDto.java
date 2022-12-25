package com.inventory.Inventory.dto;

import com.inventory.Inventory.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UtilisateurDto {
    private Integer id;
    private String nom;

    public static UtilisateurDto getFromEntity(Utilisateur utilisateur) {
        if(utilisateur == null) {
            return null;
            // TODO throw an exception
        }
        return UtilisateurDto.builder()
                .id(utilisateur.getId())
                .nom(utilisateur.getNom())
                .build();
    }

    public static Utilisateur SetToEntity(UtilisateurDto utilisateurDto) {
        if(utilisateurDto == null) {
            return null;
            // TODO throw an exception
        }
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(utilisateurDto.getId());
        utilisateur.setNom(utilisateurDto.getNom());
        return utilisateur;
    }
}
