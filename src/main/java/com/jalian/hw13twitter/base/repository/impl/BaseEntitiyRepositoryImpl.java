package com.jalian.hw13twitter.base.repository.impl;

import com.jalian.hw13twitter.base.domain.BaseEntitiy;
import com.jalian.hw13twitter.base.repository.BaseEntitiyRepository;

import javax.persistence.EntityManager;
import java.util.List;

public abstract class BaseEntitiyRepositoryImpl <Entity extends BaseEntitiy> implements BaseEntitiyRepository<Entity> {
    protected final EntityManager entityManager;

    public BaseEntitiyRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public abstract Class<Entity> getEntityClass();

    @Override
    public void saveOrUpdate(Entity entity) {
        if (entity.getId() == null) {
            entityManager.persist(entity);
        } else {
            entityManager.merge(entity);
        }
    }

    @Override
    public void delete(Entity entity) {
        entityManager.remove(entity);
    }

    @Override
    public Entity findById(Long id) {
        return entityManager.find(getEntityClass(), id);
    }

    @Override
    public List<Entity> getAll() {
        return entityManager.createQuery(
                "from " + getEntityClass().getSimpleName(),
                getEntityClass()
        ).getResultList();
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }
}
