package com.jalian.hw13twitter.ui;

import com.jalian.hw13twitter.util.HibernateUtil;

import javax.persistence.EntityManager;

public class UI {
    public static void main(String[] args) {
        EntityManager entityManager = HibernateUtil.getEntityManger();
        HibernateUtil.close();
    }
}
