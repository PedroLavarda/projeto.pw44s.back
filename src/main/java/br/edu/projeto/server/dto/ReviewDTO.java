package br.edu.projeto.server.dto;

import br.edu.projeto.server.model.Product;
import br.edu.projeto.server.model.User;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReviewDTO {
    private Long id;

    @NotNull
    private Product product;

    @NotNull
    private User user;

    @NotNull
    private int rating;

    private String comment;

    private LocalDateTime createdAt;
}
