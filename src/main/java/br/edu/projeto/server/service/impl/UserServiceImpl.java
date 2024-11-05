package br.edu.projeto.server.service.impl;

import br.edu.projeto.server.model.User;
import br.edu.projeto.server.service.IUserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public class UserServiceImpl extends CrudServiceImpl<User, Long> implements IUserService {
    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public List<User> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public User save(User entity) {
        return null;
    }

    @Override
    public User saveAndFlush(User entity) {
        return null;
    }

    @Override
    public Iterable<User> save(Iterable<User> iterable) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public User findOne(Long aLong) {
        return null;
    }

    @Override
    public boolean exists(Long aLong) {
        return false;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public void delete(Iterable<? extends User> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
