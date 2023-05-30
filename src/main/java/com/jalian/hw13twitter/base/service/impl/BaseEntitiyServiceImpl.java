package com.jalian.hw13twitter.base.service.impl;

import com.jalian.hw13twitter.base.domain.BaseEntitiy;
import com.jalian.hw13twitter.base.repository.BaseEntitiyRepository;
import com.jalian.hw13twitter.base.service.BaseEntityService;

import java.util.List;

public class BaseEntitiyServiceImpl<Entity extends BaseEntitiy, R extends BaseEntitiyRepository <Entity>> implements BaseEntityService<Entity> {
    protected final R repository;

    public BaseEntitiyServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public void saveOrUpdate(Entity entity) {
        repository.getEntityManager().getTransaction().begin();
        repository.saveOrUpdate(entity);
        repository.getEntityManager().getTransaction().commit();
    }

    @Override
    public void delete(Entity entity) {
        repository.getEntityManager().getTransaction().begin();
        repository.delete(entity);
        repository.getEntityManager().getTransaction().commit();
    }

    @Override
    public Entity findById(Long id) {
        repository.getEntityManager().getTransaction().begin();
        Entity e = repository.findById(id);
        repository.getEntityManager().getTransaction().commit();
        return e;
    }

    @Override
    public List<Entity> getAll() {
        return repository.getAll();
    }
}
