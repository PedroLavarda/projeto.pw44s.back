package br.edu.projeto.server.repository;

import br.edu.projeto.server.model.Address;
import br.edu.projeto.server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    @Query("""
        SELECT a FROM Address a WHERE a.user.id = :idUser
        """)
    List<Address> getAddressesByUser(@Param("idUser") Long idUser);
}
