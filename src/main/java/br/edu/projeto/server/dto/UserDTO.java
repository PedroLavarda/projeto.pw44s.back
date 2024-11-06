package br.edu.projeto.server.dto;

import br.edu.projeto.server.model.Address;
import lombok.Data;

import java.sql.Date;

@Data
public class UserDTO {
    private Long id;

    private String fullName;
    private String cpf;
    private String rg;
    private Date birthDate;
    private String password;
    private String email;
    private String phone;
}
