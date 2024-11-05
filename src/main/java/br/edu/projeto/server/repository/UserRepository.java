package br.edu.projeto.server.repository;

import br.edu.projeto.server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
