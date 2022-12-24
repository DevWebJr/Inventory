package com.inventory.Inventory.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RoleDto {
    private Integer id;
    private String nom;
}
