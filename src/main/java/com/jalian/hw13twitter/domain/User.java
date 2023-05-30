package com.jalian.hw13twitter.domain;

import com.jalian.hw13twitter.base.domain.BaseEntitiy;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class User extends BaseEntitiy {
    private String name;
    private String username;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Twitt> twitts;

    public User() {
    }

    public User(String name, String username) {
        this.name = name;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", twitts=" + twitts +
                ", id=" + getId() +
                '}';
    }
}
