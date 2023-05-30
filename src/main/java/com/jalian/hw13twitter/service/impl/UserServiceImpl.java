package com.jalian.hw13twitter.service.impl;

import com.jalian.hw13twitter.base.service.impl.BaseEntitiyServiceImpl;
import com.jalian.hw13twitter.domain.Twitt;
import com.jalian.hw13twitter.domain.User;
import com.jalian.hw13twitter.repository.UserRepository;
import com.jalian.hw13twitter.service.UserService;

import java.util.List;

public class UserServiceImpl extends BaseEntitiyServiceImpl<User, UserRepository> implements UserService {
    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }

    @Override
    public List<Twitt> getTwitts(User user) {
        repository.getEntityManager().getTransaction().begin();
        List<Twitt> twitts = repository.getTwitts(user);
        repository.getEntityManager().getTransaction().commit();
        return twitts;
    }
}
