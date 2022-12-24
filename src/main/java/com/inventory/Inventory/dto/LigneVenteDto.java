package com.inventory.Inventory.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class LigneVenteDto {
    private Integer id;
    private VenteDto vente;
    private BigDecimal quantite;
}
