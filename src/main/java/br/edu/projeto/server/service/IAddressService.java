package br.edu.projeto.server.service;

import br.edu.projeto.server.model.Address;

import java.util.List;

public interface IAddressService extends ICrudService<Address, Long> {
    List<Address> getAddressesByUser(Long idUser);
}
