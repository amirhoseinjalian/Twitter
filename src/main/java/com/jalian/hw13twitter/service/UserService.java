package com.jalian.hw13twitter.service;

import com.jalian.hw13twitter.base.service.BaseEntityService;
import com.jalian.hw13twitter.domain.Twitt;
import com.jalian.hw13twitter.domain.User;

import java.util.List;

public interface UserService extends BaseEntityService<User> {
    public List<Twitt> getTwitts(User user);

}
