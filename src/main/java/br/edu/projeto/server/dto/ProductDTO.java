package br.edu.projeto.server.dto;

import br.edu.projeto.server.model.Category;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class ProductDTO {

    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String description;

    private Double price;

    private Category category;

    private String linkImage;

    private boolean promotion;

    private Double promotionValue;

    private boolean inStock;

    @NotNull
    private String seller;

    @NotNull
    private List<String> imageUrls;
}
