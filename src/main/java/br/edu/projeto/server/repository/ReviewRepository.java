package br.edu.projeto.server.repository;

import br.edu.projeto.server.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
