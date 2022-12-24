package com.inventory.Inventory.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UtilisateurDto {
    private Integer id;
    private String nom;
}
