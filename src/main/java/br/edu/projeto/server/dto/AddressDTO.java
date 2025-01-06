package br.edu.projeto.server.dto;

import br.edu.projeto.server.model.User;
import lombok.Data;

@Data
public class AddressDTO {
    private Long id;

    private String street;
    private String city;
    private String state;
    private String cep;
    private String country;

    private UserDTO user;
}
