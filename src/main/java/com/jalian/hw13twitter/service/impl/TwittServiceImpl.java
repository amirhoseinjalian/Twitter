package com.jalian.hw13twitter.service.impl;

import com.jalian.hw13twitter.base.service.impl.BaseEntitiyServiceImpl;
import com.jalian.hw13twitter.domain.Comment;
import com.jalian.hw13twitter.domain.Twitt;
import com.jalian.hw13twitter.repository.TwittRepository;
import com.jalian.hw13twitter.service.TwittService;

import java.util.List;

public class TwittServiceImpl extends BaseEntitiyServiceImpl<Twitt, TwittRepository> implements TwittService {
    public TwittServiceImpl(TwittRepository repository) {
        super(repository);
    }

    @Override
    public List<Comment> getComments(Twitt twitt) {
        repository.getEntityManager().getTransaction().begin();
        List<Comment> comments = repository.getComments(twitt);
        repository.getEntityManager().getTransaction().commit();
        return comments;
    }

    @Override
    public void like(Twitt twitt) {
        repository.getEntityManager().getTransaction().begin();
        repository.like(twitt);
        repository.getEntityManager().getTransaction().commit();
    }

    @Override
    public void dislike(Twitt twitt) {
        repository.getEntityManager().getTransaction().begin();
        repository.dislike(twitt);
        repository.getEntityManager().getTransaction().commit();
    }
}
