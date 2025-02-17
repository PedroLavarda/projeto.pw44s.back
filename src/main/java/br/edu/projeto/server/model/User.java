package br.edu.projeto.server.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "tb_users")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @NotNull
    @Size(min = 10, max = 50)
    @Column(name = "username", unique = true)
    private String username;

    @Getter
    @NotNull
    @Size(min = 6, max = 20)
    private String displayName;

    @NotNull
    @Column(unique = true)
    @Size(min = 11, max = 11)
    private String cpf;

    @NotNull
    @Column(unique = true)
    @Size(min = 9, max = 9)
    private String rg;

    @NotNull
    @Column(name = "birth_date")
    private Date birthDate;

    @NotNull
    @Size(min = 6)
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$")
    private String password;

    @NotNull
    @Email(regexp = ".+[@].+[\\.].+")
    @Column(unique = true)
    private String email;

    @Column(length = 50)
    private String phone;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return AuthorityUtils.createAuthorityList("ROLE_USER");
    }
}
