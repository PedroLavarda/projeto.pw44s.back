package br.edu.projeto.server;

import br.edu.projeto.server.model.Category;
import br.edu.projeto.server.repository.CategoryRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class CategoryControllerTests {
    private static final String API_CATEGORIES = "/categories";

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Autowired
    private CategoryRepository categoryRepository;

    @BeforeEach
    public void cleanup() {
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

    public <T> ResponseEntity<T> postEntity(String url, Object request, Class<T> responseType) {
        return testRestTemplate.postForEntity(url, request, responseType);
    }

    private Category createValidCategory() {
        Category category = new Category();
        category.setName("Eletrônicos");
        category.setIcon("icon-url");
        return category;
    }
}