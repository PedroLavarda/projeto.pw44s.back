package br.edu.projeto.server;

import br.edu.projeto.server.model.User;
import br.edu.projeto.server.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

import java.sql.Date;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class UserControllerTests {
    private static final String API_USERS = "/users";
    @Autowired
    private TestRestTemplate testRestTemplate;
    @Autowired
    private UserRepository userRepository;


    @BeforeEach
    public void cleanup() {
        userRepository.deleteAll();
        testRestTemplate.getRestTemplate().getInterceptors().clear();
    }

    @Test
    public void postUser_whenUserIsValid_receiveCreated() {
        User user = createValidUser();
        ResponseEntity<Object> response = postSignup(user, Object.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
    }

    @Test
    public void postUser_whenUserIsValid_userSavedToDatabase() {
        User user = createValidUser();
        postSignup(user, Object.class);
        assertThat(userRepository.count()).isEqualTo(1);
    }

    public <T> ResponseEntity<T> postSignup(Object request,  Class<T> responseType) {
        return testRestTemplate.postForEntity(API_USERS, request, responseType);
    }

    private User createValidUser() {
        User user = new User();
        user.setUsername("Pedro Lavarda Zorel");
        user.setEmail("test@email.com");
        user.setDisplayName("pedro_zorel");
        user.setPassword("P4ssword");
        user.setCpf("09545852917");
        user.setPhone("+5546988358080");
        user.setBirthDate(Date.valueOf("2024-10-09"));
        user.setRg("131995423");
        return user;
    }
}
