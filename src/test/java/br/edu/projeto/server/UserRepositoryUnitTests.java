package br.edu.projeto.server;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;

import br.edu.projeto.server.model.User;
import br.edu.projeto.server.repository.UserRepository;
import br.edu.projeto.server.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserRepositoryUnitTests {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userService;

    @Test
    public void findByUsername_whenUserExists_returnUser() {
        User user = new User();
        user.setUsername("Pedro1234!");
        user.setEmail("test@email.com");

        when(userRepository.findByUsername("Pedro1234!")).thenReturn(user);

        User foundUser = userService.findUserByUsername("Pedro1234!");

        assertThat(foundUser).isNotNull();
        assertThat(foundUser.getUsername()).isEqualTo("Pedro1234!");
    }
}