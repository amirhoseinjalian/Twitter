package com.jalian.hw13twitter.repository.impl;

import com.jalian.hw13twitter.base.repository.impl.BaseEntitiyRepositoryImpl;
import com.jalian.hw13twitter.base.service.impl.BaseEntitiyServiceImpl;
import com.jalian.hw13twitter.domain.Twitt;
import com.jalian.hw13twitter.domain.User;
import com.jalian.hw13twitter.repository.UserRepository;

import javax.persistence.EntityManager;
import java.util.List;

public class UserRepositoryImpl extends BaseEntitiyRepositoryImpl<User> implements UserRepository {
    public UserRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<User> getEntityClass() {
        return User.class;
    }

    @Override
    public List<Twitt> getTwitts(User user) {
        return entityManager.createQuery("select t from Twitt t where t.user.id = " + user.getId()).getResultList();
    }
}
