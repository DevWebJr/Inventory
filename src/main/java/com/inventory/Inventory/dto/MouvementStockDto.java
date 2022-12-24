package com.inventory.Inventory.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MouvementStockDto {
    private Integer id;
    private ArticleDto article;
}
