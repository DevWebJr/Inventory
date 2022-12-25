package com.inventory.Inventory.dto;

import com.inventory.Inventory.model.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LigneCommandeFournisseurDto {
    private Integer id;
    private ArticleDto article;
    private CommandeFournisseurDto commandeFournisseur;

    public static LigneCommandeFournisseurDto getFromEntity(LigneCommandeFournisseur ligneCommandeFournisseur) {
        if(ligneCommandeFournisseur == null) {
            return null;
            // TODO throw an exception
        }
        return LigneCommandeFournisseurDto.builder()
                .id(ligneCommandeFournisseur.getId())
                .build();
    }

    public static LigneCommandeFournisseur SetToEntity(LigneCommandeFournisseurDto ligneCommandeFournisseurDto) {
        if(ligneCommandeFournisseurDto == null) {
            return null;
            // TODO throw an exception
        }
        LigneCommandeFournisseur ligneCommandeFournisseur = new LigneCommandeFournisseur();
        ligneCommandeFournisseur.setId(ligneCommandeFournisseurDto.getId());
        return ligneCommandeFournisseur;
    }
}
