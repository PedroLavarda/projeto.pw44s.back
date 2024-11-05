package br.edu.projeto.server.service.impl;

import br.edu.projeto.server.model.Address;
import br.edu.projeto.server.repository.AddressRepository;
import br.edu.projeto.server.service.IAddressService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl extends CrudServiceImpl<Address, Long> implements IAddressService {
    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    protected JpaRepository<Address, Long> getRepository() {
        return addressRepository;
    }
}
