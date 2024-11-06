package br.edu.projeto.server.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_order_products")
public class OrderProducts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantity;
    private Double price;

    @OneToOne
    @JoinColumn(name = "idproduct", referencedColumnName = "id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "idorder", referencedColumnName = "id")
    private Order order;
}
