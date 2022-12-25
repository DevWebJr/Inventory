package com.inventory.Inventory.dto;

import com.inventory.Inventory.model.Role;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RoleDto {
    private Integer id;
    private String nom;

    public static RoleDto getFromEntity(Role role) {
        if(role == null) {
            return null;
            // TODO throw an exception
        }
        return RoleDto.builder()
                .id(role.getId())
                .nom(role.getNom())
                .build();
    }

    public static Role SetToEntity(RoleDto roleDto) {
        if(roleDto == null) {
            return null;
            // TODO throw an exception
        }
        Role role = new Role();
        role.setId(roleDto.getId());
        role.setNom(roleDto.getNom());
        return role;
    }
}
