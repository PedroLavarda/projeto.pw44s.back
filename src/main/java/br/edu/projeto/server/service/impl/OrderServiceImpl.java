package br.edu.projeto.server.service.impl;

import br.edu.projeto.server.model.Order;
import br.edu.projeto.server.repository.OrderRepository;
import br.edu.projeto.server.service.IOrderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl extends CrudServiceImpl<Order, Long> implements IOrderService {
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    protected JpaRepository<Order, Long> getRepository() {
        return orderRepository;
    }
}
