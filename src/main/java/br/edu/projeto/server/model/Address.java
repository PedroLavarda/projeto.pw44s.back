package br.edu.projeto.server.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
@Table(name = "tb_adresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 10, max = 100)
    private String street;

    @NotNull
    @Size(min = 10, max = 100)
    private String city;

    @NotNull
    @Size(min = 10, max = 100)
    private String state;

    @NotNull
    private String cep;

    @NotNull
    @Size(min = 10, max = 100)
    private String country;

    @ManyToOne
    @JoinColumn(name = "iduser", referencedColumnName = "id")
    private User user;
}