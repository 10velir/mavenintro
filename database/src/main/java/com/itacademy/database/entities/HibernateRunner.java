package com.itacademy.database.entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateRunner {

    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory()) {
            try (Session session = sessionFactory.openSession()) {
                session.beginTransaction();

                Passport passport = Passport.builder()
                        .number("KB")
                        .series("qweqwe")
                        .build();
                Address address = Address.builder()
                        .street("Nemiga")
                        .city("Moscow")
                        .build();

                User Jey = User.builder()
                        .name("Ivan")
                        .login("213")
                        .password("aweqweqwe")
                        .passport(passport)
                        .build();

                Car car = Car.builder()
                        .supplier("BMW")
                        .model("TT")
                        .price(100)
                        .build();

                session.save(car);

                session.getTransaction().commit();
            }
        }
    }
}
