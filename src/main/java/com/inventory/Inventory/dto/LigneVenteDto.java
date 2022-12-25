package com.inventory.Inventory.dto;

import com.inventory.Inventory.model.LigneVente;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class LigneVenteDto {
    private Integer id;
    private VenteDto vente;
    private BigDecimal quantite;

    public static LigneVenteDto getFromEntity(LigneVente ligneVente) {
        if(ligneVente == null) {
            return null;
            // TODO throw an exception
        }
        return LigneVenteDto.builder()
                .id(ligneVente.getId())
                .quantite(ligneVente.getQuantite())
                .build();
    }

    public static LigneVente SetToEntity(LigneVenteDto ligneVenteDto) {
        if(ligneVenteDto == null) {
            return null;
            // TODO throw an exception
        }
        LigneVente ligneVente = new LigneVente();
        ligneVente.setId(ligneVenteDto.getId());
        ligneVente.setQuantite(ligneVenteDto.getQuantite());
        return ligneVente;
    }
}
