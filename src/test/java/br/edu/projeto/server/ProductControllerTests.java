package br.edu.projeto.server;

import br.edu.projeto.server.model.Category;
import br.edu.projeto.server.model.Product;
import br.edu.projeto.server.repository.CategoryRepository;
import br.edu.projeto.server.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class ProductControllerTests {
    private static final String API_CATEGORIES = "/categories";
    private static final String API_PRODUCTS = "/products";

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @BeforeEach
    public void cleanup() {
        productRepository.deleteAll();
        categoryRepository.deleteAll();
        testRestTemplate.getRestTemplate().getInterceptors().clear();
    }

    @Test
    public void postCategory_whenCategoryIsValid_receiveCreated() {
        Category category = createValidCategory();
        ResponseEntity<Object> response = postEntity(API_CATEGORIES, category, Object.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
    }

    @Test
    public void postCategory_whenCategoryIsValid_categorySavedToDatabase() {
        Category category = createValidCategory();
        postEntity(API_CATEGORIES, category, Object.class);
        assertThat(categoryRepository.count()).isEqualTo(1);
    }

    @Test
    public void postProduct_whenProductIsValid_receiveCreated() {
        Category category = categoryRepository.save(createValidCategory());
        Product product = createValidProduct(category);
        ResponseEntity<Object> response = postEntity(API_PRODUCTS, product, Object.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
    }

    @Test
    public void postProduct_whenProductIsValid_productSavedToDatabase() {
        Category category = categoryRepository.save(createValidCategory());
        Product product = createValidProduct(category);
        postEntity(API_PRODUCTS, product, Object.class);
        assertThat(productRepository.count()).isEqualTo(1);
    }

    public <T> ResponseEntity<T> postEntity(String url, Object request, Class<T> responseType) {
        return testRestTemplate.postForEntity(url, request, responseType);
    }

    private Category createValidCategory() {
        Category category = new Category();
        category.setName("Eletrônicos");
        category.setIcon("icon-url");
        return category;
    }

    private Product createValidProduct(Category category) {
        Product product = new Product();
        product.setName("Headset Gamer");
        product.setDescription("Um headset gamer de alta qualidade com som surround.");
        product.setPrice(199.99);
        product.setCategory(category);
        product.setLinkImage("image-url");
        product.setPromotion(true);
        product.setPromotionValue(20);
        product.setInStock(true);
        product.setSeller("Tech Store");
        product.setImageUrls(Collections.singletonList("image-url"));
        return product;
    }
}
