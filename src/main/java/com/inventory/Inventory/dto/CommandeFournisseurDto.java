package com.inventory.Inventory.dto;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Builder
@Data
public class CommandeFournisseurDto {
    private Integer id;
    private String code;
    private Instant dateCommande;
    private FournisseurDto fournisseur;
    private List<LigneCommandeFournisseurDto> lignesCommandeFournisseur;
}
