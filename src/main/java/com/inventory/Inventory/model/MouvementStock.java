package com.inventory.Inventory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "mouvement_stock")
public class MouvementStock extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "id_article")
    private Article article;
}
