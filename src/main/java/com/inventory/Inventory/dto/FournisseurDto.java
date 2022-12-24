package com.inventory.Inventory.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class FournisseurDto {
    private Integer id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Embedded
    private AdresseDto adresse;
    @Column(name = "photo")
    private String photo;
    @Column(name = "mail")
    private String mail;
    @Column(name = "phone")
    private String phone;
    @OneToMany(mappedBy = "fournisseur")
    private List<CommandeFournisseurDto> commandesFournisseur;
}
