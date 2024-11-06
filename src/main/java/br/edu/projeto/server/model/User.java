package br.edu.projeto.server.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
@Table(name = "tb_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false, name = "full_name")
    private String fullName;

    @Column(length = 50, nullable = false)
    private String cpf;

    @Column(length = 50, nullable = false)
    private String rg;

    @Column(length = 50, nullable = false)
    private Date birthDate;

    @Column(length = 50, nullable = false)
    private String password;

    @Column(length = 50, nullable = false)
    private String email;

    @Column(length = 50, nullable = false)
    private String phone;
}
