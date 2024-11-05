package br.edu.projeto.server.dto;

import br.edu.projeto.server.model.Order;
import br.edu.projeto.server.model.Product;
import lombok.Data;

@Data
public class OrderProductsDTO {
    private Long id;

    private Double totalPrice;

    private Product product;
    private Order order;
}
