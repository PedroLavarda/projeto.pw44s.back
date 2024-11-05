package br.edu.projeto.server.repository;

import br.edu.projeto.server.model.OrderProducts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductsRepository extends JpaRepository<OrderProducts, Long> {
}
