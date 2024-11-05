package br.edu.projeto.server.service.impl;

import br.edu.projeto.server.model.Address;
import br.edu.projeto.server.service.IAddressService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public class AddressServiceImpl extends CrudServiceImpl<Address, Long> implements IAddressService {
    @Override
    public List<Address> findAll() {
        return List.of();
    }

    @Override
    public List<Address> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Address> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Address save(Address entity) {
        return null;
    }

    @Override
    public Address saveAndFlush(Address entity) {
        return null;
    }

    @Override
    public Iterable<Address> save(Iterable<Address> iterable) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public Address findOne(Long aLong) {
        return null;
    }

    @Override
    public boolean exists(Long aLong) {
        return false;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public void delete(Iterable<? extends Address> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
