package com.jalian.hw13twitter.base.repository;

import com.jalian.hw13twitter.base.domain.BaseEntitiy;

import javax.persistence.EntityManager;
import java.util.List;

public interface BaseEntitiyRepository<Entity extends BaseEntitiy> {

    public void saveOrUpdate(Entity entity);

    public void delete(Entity entity);

    public Entity findById(Long id);

    public List<Entity> getAll();

    EntityManager getEntityManager();
}