package br.edu.projeto.server.controller;

import br.edu.projeto.server.dto.ProductDTO;
import br.edu.projeto.server.model.Product;
import br.edu.projeto.server.service.ICrudService;
import br.edu.projeto.server.service.IProductService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController extends CrudController<Product, ProductDTO, Long> {
    private final IProductService productService;
    private final ModelMapper modelMapper;

    public ProductController(IProductService productService,
                             ModelMapper modelMapper) {
        super(Product.class, ProductDTO.class);
        this.productService = productService;
        this.modelMapper = modelMapper;
    }

    @Override
    protected ICrudService<Product, Long> getService() {
        return this.productService;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return this.modelMapper;
    }
}
