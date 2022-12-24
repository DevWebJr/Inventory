package com.inventory.Inventory.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "commande_fournisseur")
public class CommandeFournisseur extends AbstractEntity {
    @Column(name = "code")
    private String code;
    @Column(name = "date_commande")
    private Instant  dateCommande;
    @ManyToOne
    @JoinColumn(name = "id_fournisseur")
    private Fournisseur fournisseur;
    @OneToMany(mappedBy = "commandeFournisseur")
    private List<LigneCommandeFournisseur> lignesCommandeFournisseur;
}
