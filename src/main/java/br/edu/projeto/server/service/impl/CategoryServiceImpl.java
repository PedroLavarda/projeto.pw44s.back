package br.edu.projeto.server.service.impl;

import br.edu.projeto.server.model.Category;
import br.edu.projeto.server.service.ICategoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public class CategoryServiceImpl extends CrudServiceImpl<Category, Long> implements ICategoryService {
    @Override
    public List<Category> findAll() {
        return List.of();
    }

    @Override
    public List<Category> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Category save(Category entity) {
        return null;
    }

    @Override
    public Category saveAndFlush(Category entity) {
        return null;
    }

    @Override
    public Iterable<Category> save(Iterable<Category> iterable) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public Category findOne(Long aLong) {
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
    public void delete(Iterable<? extends Category> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
