package br.edu.projeto.server.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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

    @NotNull
    @Column(name = "link_image")
    private String linkImage;

    @NotNull
    @Column
    private boolean promotion;

    @NotNull
    @Column(name = "promotion_value")
    private Integer promotionValue;

    @NotNull
    @Column(name = "in_stock")
    private boolean inStock;

    @NotNull
    @Column(name = "seller")
    private String seller;

    @NotNull
    @ElementCollection
    private List<String> imageUrls;
}
