package com.inventory.Inventory.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "article")
public class Article extends AbstractEntity {
    @Column(name="code_article")
    private String codeArticle;
    @Column(name="designation")
    private String designation;
    @Column(name = "prix_unitaire_ht")
    private BigDecimal prixUnitaireHt;
    @Column(name = "taux_tva")
    private BigDecimal tauxTva;
    @Column(name = "prix_unitaire_ttc")
    private BigDecimal prixUnitaireTtc;
    @Column(name = "photo")
    private String photo;
    @ManyToOne
    @JoinColumn(name = "id_categorie")
    private Categorie categorie;
}
