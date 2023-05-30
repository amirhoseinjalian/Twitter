package com.jalian.hw13twitter.base.service;

import java.util.List;

public interface BaseEntityService<Entity> {
    public void saveOrUpdate(Entity entity);

    public void delete(Entity entity);

    public Entity findById(Long id);

    public List<Entity> getAll();
}
