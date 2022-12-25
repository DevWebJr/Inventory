package com.inventory.Inventory.dto;

import com.inventory.Inventory.model.LigneCommandeClient;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LigneCommandeClientDto {
    private Integer id;
    private ArticleDto article;
    private CommandeClientDto commandeClient;

    public static LigneCommandeClientDto getFromEntity(LigneCommandeClient ligneCommandeClient) {
        if(ligneCommandeClient == null) {
            return null;
            // TODO throw an exception
        }
        return LigneCommandeClientDto.builder()
                .id(ligneCommandeClient.getId())
                .build();
    }

    public static LigneCommandeClient SetToEntity(LigneCommandeClientDto ligneCommandeClientDto) {
        if(ligneCommandeClientDto == null) {
            return null;
            // TODO throw an exception
        }
        LigneCommandeClient ligneCommandeClient = new LigneCommandeClient();
        ligneCommandeClient.setId(ligneCommandeClientDto.getId());
        return ligneCommandeClient;
    }
}
