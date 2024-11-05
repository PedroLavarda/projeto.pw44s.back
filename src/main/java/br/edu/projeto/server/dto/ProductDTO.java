package br.edu.projeto.server.dto;

import br.edu.projeto.server.model.Category;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProductDTO {

    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String description;

    private Double price;

    private Category category;
}
