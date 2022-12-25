package com.inventory.Inventory.dto;

import com.inventory.Inventory.model.CommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Builder
@Data
public class CommandeFournisseurDto {
    private Integer id;
    private String code;
    private Instant dateCommande;
    private FournisseurDto fournisseur;
    private List<LigneCommandeFournisseurDto> lignesCommandeFournisseur;

    public static CommandeFournisseurDto getFromEntity(CommandeFournisseur commandeFournisseur) {
        if(commandeFournisseur == null) {
            return null;
            // TODO throw an exception
        }
        return CommandeFournisseurDto.builder()
                .id(commandeFournisseur.getId())
                .code(commandeFournisseur.getCode())
                .dateCommande(commandeFournisseur.getDateCommande())
                .build();
    }

    public static CommandeFournisseur SetToEntity(CommandeFournisseurDto commandeFournisseurDto) {
        if(commandeFournisseurDto == null) {
            return null;
            // TODO throw an exception
        }
        CommandeFournisseur CommandeFournisseur = new CommandeFournisseur();
        CommandeFournisseur.setId(commandeFournisseurDto.getId());
        CommandeFournisseur.setCode(commandeFournisseurDto.getCode());
        CommandeFournisseur.setDateCommande(commandeFournisseurDto.getDateCommande());
        return CommandeFournisseur;
    }
}
