package com.inventory.Inventory.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.inventory.Inventory.model.Client;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ClientDto {
    private Integer id;
    private String nom;
    private String prenom;
    private AdresseDto adresse;
    private String photo;
    private String mail;
    private String phone;
    @JsonIgnore
    private List<CommandeClientDto> commandesClient;

    public Client toEntity(ClientDto clientDto) {
        if(clientDto == null) {
            return null;
            // TODO throw an exception
        }
        return Client.builder().build();
    }
}
