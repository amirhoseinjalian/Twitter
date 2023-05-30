package com.jalian.hw13twitter.repository.impl;

import com.jalian.hw13twitter.base.repository.impl.BaseEntitiyRepositoryImpl;
import com.jalian.hw13twitter.domain.Comment;
import com.jalian.hw13twitter.domain.Twitt;
import com.jalian.hw13twitter.repository.TwittRepository;

import javax.persistence.EntityManager;
import java.util.List;

public class TwittRepositoryImpl extends BaseEntitiyRepositoryImpl<Twitt> implements TwittRepository {
    public TwittRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Twitt> getEntityClass() {
        return Twitt.class;
    }

    @Override
    public List<Comment> getComments(Twitt twitt) {
        return entityManager.createQuery("select c from Comment c where c.twitt.id = " + twitt.getId()).getResultList();
    }

    @Override
    public void like(Twitt twitt) {
        twitt.setNumberOfLikes(twitt.getNumberOfLikes() + 1);
        entityManager.merge(twitt);
    }

    @Override
    public void dislike(Twitt twitt) {
        twitt.setNumberOfLikes(twitt.getNumberOfLikes() - 1);
        entityManager.merge(twitt);
    }
}
