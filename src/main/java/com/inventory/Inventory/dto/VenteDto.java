package com.inventory.Inventory.dto;

import com.inventory.Inventory.model.Vente;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class VenteDto {
    private Integer id;
    private String code;

    public static VenteDto getFromEntity(Vente vente) {
        if(vente == null) {
            return null;
            // TODO throw an exception
        }
        return VenteDto.builder()
                .id(vente.getId())
                .code(vente.getCode())
                .build();
    }

    public static Vente SetToEntity(VenteDto venteDto) {
        if(venteDto == null) {
            return null;
            // TODO throw an exception
        }
        Vente vente = new Vente();
        vente.setId(venteDto.getId());
        vente.setCode(venteDto.getCode());
        return vente;
    }
}
