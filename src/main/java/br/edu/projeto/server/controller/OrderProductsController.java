package br.edu.projeto.server.controller;

import br.edu.projeto.server.dto.OrderProductsDTO;
import br.edu.projeto.server.model.OrderProducts;
import br.edu.projeto.server.service.ICrudService;
import br.edu.projeto.server.service.IOrderProductsService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orderProducts")
public class OrderProductsController extends CrudController<OrderProducts, OrderProductsDTO, Long> {
    private final IOrderProductsService orderProductsService;
    private final ModelMapper modelMapper;

    public OrderProductsController(IOrderProductsService orderProductsService,
                             ModelMapper modelMapper) {
        super(OrderProducts.class, OrderProductsDTO.class);
        this.orderProductsService = orderProductsService;
        this.modelMapper = modelMapper;
    }

    @Override
    protected ICrudService<OrderProducts, Long> getService() {
        return this.orderProductsService;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return this.modelMapper;
    }
}
