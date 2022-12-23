package com.inventory.Inventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ligne_vente")
public class LigneVente extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "id_vente")
    private Vente vente;
    @Column(name = "quantite")
    private BigDecimal quantite;
}
