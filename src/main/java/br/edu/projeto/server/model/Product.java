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
@Table(name = "tb_products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 2, max = 50)
    @Column
    private String name;

    @NotNull
    @Size(min = 10, max = 100)
    @Column
    private String description;

    @Column
    private Double price;

    @ManyToOne
    @JoinColumn(name = "idcategory", referencedColumnName = "id")
    private Category category;
}
