package br.edu.projeto.server.controller;

import br.edu.projeto.server.dto.UserDTO;
import br.edu.projeto.server.model.User;
import br.edu.projeto.server.service.AuthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("login")
public class LoginController {

    private final AuthService authService;

    public LoginController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping("user-info")
    public UserDTO getUserInfo(Principal principal) {
        return new UserDTO((User) authService.loadUserByUsername(principal.getName()));
    }
}