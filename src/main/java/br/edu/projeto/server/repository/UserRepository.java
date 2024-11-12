package br.edu.projeto.server.repository;

import br.edu.projeto.server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    // select * from tb_user where displayName LIKE :displayName
    User findByDisplayNameContaining(String displayName);
}
