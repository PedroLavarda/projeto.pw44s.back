package br.edu.projeto.server.service.impl;

import br.edu.projeto.server.model.Product;
import br.edu.projeto.server.service.IProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public class ProductServiceImpl extends CrudServiceImpl<Product, Long> implements IProductService {
    @Override
    public List<Product> findAll() {
        return List.of();
    }

    @Override
    public List<Product> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Product save(Product entity) {
        return null;
    }

    @Override
    public Product saveAndFlush(Product entity) {
        return null;
    }

    @Override
    public Iterable<Product> save(Iterable<Product> iterable) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public Product findOne(Long aLong) {
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
    public void delete(Iterable<? extends Product> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
