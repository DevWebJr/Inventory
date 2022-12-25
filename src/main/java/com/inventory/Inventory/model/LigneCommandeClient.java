package com.inventory.Inventory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ligne_commande_client")
public class LigneCommandeClient extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "id_article")
    private Article article;
    @ManyToOne
    @JoinColumn(name = "id_commande_client")
    private CommandeClient commandeClient;
}
