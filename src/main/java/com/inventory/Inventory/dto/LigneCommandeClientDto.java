package com.inventory.Inventory.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LigneCommandeClientDto {
    private Integer id;
    private ArticleDto article;
    private CommandeClientDto commandeClient;
}
