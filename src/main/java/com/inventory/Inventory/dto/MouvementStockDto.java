package com.inventory.Inventory.dto;

import com.inventory.Inventory.model.MouvementStock;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MouvementStockDto {
    private Integer id;
    private ArticleDto article;

    public static MouvementStockDto getFromEntity(MouvementStock mouvementStock) {
        if(mouvementStock == null) {
            return null;
            // TODO throw an exception
        }
        return MouvementStockDto.builder()
                .id(mouvementStock.getId())
                .build();
    }

    public static MouvementStock SetToEntity(MouvementStockDto mouvementStockDto) {
        if(mouvementStockDto == null) {
            return null;
            // TODO throw an exception
        }
        MouvementStock mouvementStock = new MouvementStock();
        mouvementStock.setId(mouvementStockDto.getId());
        return mouvementStock;
    }
}
