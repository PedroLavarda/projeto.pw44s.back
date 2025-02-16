package br.edu.projeto.server.service.impl;

import br.edu.projeto.server.model.Product;
import br.edu.projeto.server.repository.ProductRepository;
import br.edu.projeto.server.service.IProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl extends CrudServiceImpl<Product, Long> implements IProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    protected JpaRepository<Product , Long> getRepository() {
        return productRepository;
    }
}
