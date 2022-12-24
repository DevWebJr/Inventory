package com.inventory.Inventory.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "fournisseur")
public class Fournisseur extends AbstractEntity {
    private String nom;
    private String prenom;
    private Adresse adresse;
    private String photo;
    private String mail;
    private String phone;
    private List<CommandeFournisseur> commandesFournisseur;
}
