package br.edu.projeto.server.service.impl;

import br.edu.projeto.server.model.OrderProducts;
import br.edu.projeto.server.repository.OrderProductsRepository;
import br.edu.projeto.server.service.IOrderProductsService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderProductsServiceImpl extends CrudServiceImpl<OrderProducts, Long> implements IOrderProductsService {
    private final OrderProductsRepository orderProductsRepository;

    public OrderProductsServiceImpl(OrderProductsRepository orderProductsRepository) {
        this.orderProductsRepository = orderProductsRepository;
    }

    @Override
    protected JpaRepository<OrderProducts, Long> getRepository() {
        return orderProductsRepository;
    }
}
