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

    public static ClientDto getFromEntity(Client client) {
        if(client == null) {
            return null;
            // TODO throw an exception
        }
        return ClientDto.builder()
                .id(client.getId())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .photo(client.getPhoto())
                .mail(client.getMail())
                .phone(client.getPhone())
                .build();
    }

    public static Client setToEntity(ClientDto clientDto) {
        if(clientDto == null) {
            return null;
            // TODO throw an exception
        }
        Client client = new Client();
        client.setId(clientDto.getId());
        client.setNom(clientDto.getNom());
        client.setPrenom(clientDto.getPrenom());
        client.setPhoto(clientDto.getPhoto());
        client.setMail(clientDto.getMail());
        client.setPhone(clientDto.getPhone());
        return client;
    }
}
