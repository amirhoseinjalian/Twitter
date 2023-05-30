package com.jalian.hw13twitter.domain;

import com.jalian.hw13twitter.base.domain.BaseEntitiy;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Twitt extends BaseEntitiy {
    private String text;
    private long numberOfLikes;

    @OneToMany(mappedBy = "twitt", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Comment> comments;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", nullable = false)
    private User user;
    public Twitt() {
    }

    public Twitt(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(long numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Twitt{" +
                "text='" + text + '\'' +
                ", numberOfLikes=" + numberOfLikes +
                ", comments=" + comments +
                ", id=" + getId() +
                '}';
    }
}
