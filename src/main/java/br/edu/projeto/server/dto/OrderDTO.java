package br.edu.projeto.server.dto;

import br.edu.projeto.server.model.Address;
import br.edu.projeto.server.model.User;
import lombok.Data;

import java.util.Date;

@Data
public class OrderDTO {
    private Long id;

    private Date date;
    private User user;

    private Address address;
}
