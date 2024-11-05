package br.edu.projeto.server.repository;

import br.edu.projeto.server.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
