package br.edu.projeto.server.repository;

import br.edu.projeto.server.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
