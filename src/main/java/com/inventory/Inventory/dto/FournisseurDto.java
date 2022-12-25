package com.inventory.Inventory.dto;

import com.inventory.Inventory.model.Fournisseur;
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

    public static FournisseurDto getFromEntity(Fournisseur fournisseur) {
        if(fournisseur == null) {
            return null;
            // TODO throw an exception
        }
        return FournisseurDto.builder()
                .id(fournisseur.getId())
                .nom(fournisseur.getNom())
                .prenom(fournisseur.getPrenom())
                .photo(fournisseur.getPhoto())
                .mail(fournisseur.getMail())
                .phone(fournisseur.getPhone())
                .build();
    }

    public static Fournisseur setToEntity(FournisseurDto fournisseurDto) {
        if(fournisseurDto == null) {
            return null;
            // TODO throw an exception
        }
        Fournisseur fournisseur = new Fournisseur();
        fournisseur.setId(fournisseurDto.getId());
        fournisseur.setNom(fournisseurDto.getNom());
        fournisseur.setPrenom(fournisseurDto.getPrenom());
        fournisseur.setPhoto(fournisseurDto.getPhoto());
        fournisseur.setMail(fournisseurDto.getMail());
        fournisseur.setPhone(fournisseurDto.getPhone());
        return fournisseur;
    }
}
