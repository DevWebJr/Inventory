package com.inventory.Inventory.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "commande_client")
public class CommandeClient extends AbstractEntity {
    @Column(name = "code")
    private String code;
    @Column(name = "date_commande")
    private Instant dateCommande;
    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;
    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommandeClient> lignesCommandeClient;
}
