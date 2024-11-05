package br.edu.projeto.server.service.impl;

import br.edu.projeto.server.model.Order;
import br.edu.projeto.server.service.IOrderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public class OrderServiceImpl extends CrudServiceImpl<Order, Long> implements IOrderService {
    @Override
    public List<Order> findAll() {
        return List.of();
    }

    @Override
    public List<Order> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Order> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Order save(Order entity) {
        return null;
    }

    @Override
    public Order saveAndFlush(Order entity) {
        return null;
    }

    @Override
    public Iterable<Order> save(Iterable<Order> iterable) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public Order findOne(Long aLong) {
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
    public void delete(Iterable<? extends Order> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
