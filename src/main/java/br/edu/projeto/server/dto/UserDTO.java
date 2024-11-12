package br.edu.projeto.server.dto;

import br.edu.projeto.server.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;

    private String username;
    private String displayName;
    private String cpf;
    private String rg;
    private Date birthDate;
    private String password;
    private String email;
    private String phone;

    public UserDTO(User user) {
        this.id = user.getId();
        this.displayName = user.getDisplayName();
        this.username = user.getUsername();
    }
}
