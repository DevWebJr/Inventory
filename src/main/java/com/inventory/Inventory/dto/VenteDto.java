package com.inventory.Inventory.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class VenteDto {
    private Integer id;
    private String code;
}
