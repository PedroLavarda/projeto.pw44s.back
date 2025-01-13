package br.edu.projeto.server.security.dto;

import br.edu.projeto.server.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDTO {
    private Long id;
    private String username;
    private String displayName;
    private String cpf;
    private String rg;
    private Date birthDate;
    private String email;
    private String phone;
    private Set<AuthorityResponseDTO> authorities;

    public UserResponseDTO(User user) {
        this.id = user.getId();
        this.displayName = user.getDisplayName();
        this.username = user.getUsername();
        this.cpf = user.getCpf();
        this.rg = user.getRg();
        this.birthDate = user.getBirthDate();
        this.email = user.getEmail();
        this.phone = user.getPhone();
        this.authorities = new HashSet<>();
        for (GrantedAuthority authority: user.getAuthorities()) {
            authorities.add( new AuthorityResponseDTO(authority.getAuthority()) );
        }
    }
}
