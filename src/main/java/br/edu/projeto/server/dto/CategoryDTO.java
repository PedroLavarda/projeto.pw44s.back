package br.edu.projeto.server.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CategoryDTO {
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String icon;
}
