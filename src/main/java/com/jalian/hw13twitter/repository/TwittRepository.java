package com.jalian.hw13twitter.repository;

import com.jalian.hw13twitter.base.repository.BaseEntitiyRepository;
import com.jalian.hw13twitter.domain.Comment;
import com.jalian.hw13twitter.domain.Twitt;

import java.util.List;

public interface TwittRepository extends BaseEntitiyRepository<Twitt> {
    public List<Comment> getComments(Twitt twitt);
    public void like(Twitt twitt);
    public void dislike(Twitt twitt);
}
