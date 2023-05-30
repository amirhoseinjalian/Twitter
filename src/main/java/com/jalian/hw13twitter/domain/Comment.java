package com.jalian.hw13twitter.domain;

import com.jalian.hw13twitter.base.domain.BaseEntitiy;

import javax.persistence.*;

@Entity
@Table
public class Comment extends BaseEntitiy {
    private String text;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "twittId", nullable = false)
    private Twitt twitt;

    public Comment(String text) {
        this.text = text;
    }

    public Comment() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Twitt getTwitt() {
        return twitt;
    }

    public void setTwitt(Twitt twitt) {
        this.twitt = twitt;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "text='" + text + '\'' +
                ", id=" + getId() +
                '}';
    }
}
