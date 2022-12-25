package com.inventory.Inventory.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.inventory.Inventory.model.Categorie;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class CategorieDto {
    private Integer id;
    private String code;
    private String designation;
    @JsonIgnore
    private List<ArticleDto> articles;

    public static CategorieDto getFromEntity(Categorie categorie) {
        if(categorie == null) {
            return null;
            // TODO throw an exception
        }
        return CategorieDto.builder()
                .id(categorie.getId())
                .code(categorie.getCode())
                .designation(categorie.getDesignation())
                .build();
    }

    public static Categorie SetToEntity(CategorieDto categorieDto) {
        if(categorieDto == null) {
            return null;
            // TODO throw an exception
        }
        Categorie categorie = new Categorie();
        categorie.setId(categorieDto.getId());
        categorie.setCode(categorieDto.getCode());
        categorie.setDesignation(categorieDto.getDesignation());
        return categorie;
    }
}
