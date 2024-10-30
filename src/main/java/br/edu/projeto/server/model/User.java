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

    private String fullName;
    private String cpf;
    private String rg;
    private Date birthDate;
    private String password;
    private String email;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "idadress", referencedColumnName = "id")
    private Address address;
}
