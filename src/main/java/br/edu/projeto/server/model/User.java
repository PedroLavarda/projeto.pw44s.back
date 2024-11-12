package br.edu.projeto.server.model;

import jakarta.persistence.*;
import lombok.*;
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
    @Column(length = 50, nullable = false, name = "username")
    private String username;

    @Getter
    @Column(length = 50, nullable = false, name = "display_name")
    private String displayName;

    @Column(length = 50, nullable = false)
    private String cpf;

    @Column(length = 50, nullable = false)
    private String rg;

    @Column(length = 50, nullable = false, name = "birth_date")
    private Date birthDate;

    @Column(length = 100, nullable = false)
    private String password;

    @Column(length = 50, nullable = false)
    private String email;

    @Column(length = 50, nullable = false)
    private String phone;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return AuthorityUtils.createAuthorityList("ROLE_USER");
    }

}
