package com.jalian.hw13twitter.service;

import com.jalian.hw13twitter.base.service.BaseEntityService;
import com.jalian.hw13twitter.domain.Comment;
import com.jalian.hw13twitter.domain.Twitt;

import java.util.List;

public interface TwittService extends BaseEntityService<Twitt> {
    public List<Comment> getComments(Twitt twitt);
    public void like(Twitt twitt);
    public void dislike(Twitt twitt);
}
