package br.edu.projeto.server.service.impl;

import br.edu.projeto.server.model.OrderProducts;
import br.edu.projeto.server.service.IOrderProductsService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public class OrderProductsServiceImpl extends CrudServiceImpl<OrderProducts, Long> implements IOrderProductsService {
    @Override
    public List<OrderProducts> findAll() {
        return List.of();
    }

    @Override
    public List<OrderProducts> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<OrderProducts> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public OrderProducts save(OrderProducts entity) {
        return null;
    }

    @Override
    public OrderProducts saveAndFlush(OrderProducts entity) {
        return null;
    }

    @Override
    public Iterable<OrderProducts> save(Iterable<OrderProducts> iterable) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public OrderProducts findOne(Long aLong) {
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
    public void delete(Iterable<? extends OrderProducts> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
