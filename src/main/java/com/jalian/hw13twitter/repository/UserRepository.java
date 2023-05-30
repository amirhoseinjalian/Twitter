package com.jalian.hw13twitter.repository;

import com.jalian.hw13twitter.base.repository.BaseEntitiyRepository;
import com.jalian.hw13twitter.domain.Twitt;
import com.jalian.hw13twitter.domain.User;

import java.util.List;

public interface UserRepository extends BaseEntitiyRepository<User> {
    public List<Twitt> getTwitts(User user);
}
