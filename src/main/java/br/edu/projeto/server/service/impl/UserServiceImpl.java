package br.edu.projeto.server.service.impl;

import br.edu.projeto.server.model.User;
import br.edu.projeto.server.repository.UserRepository;
import br.edu.projeto.server.service.IUserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends CrudServiceImpl<User, Long> implements IUserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    protected JpaRepository<User, Long> getRepository() {
        return userRepository;
    }
}
