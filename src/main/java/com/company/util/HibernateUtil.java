package com.company.util;

import com.company.entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                Properties properties = new Properties();
                properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                properties.put(Environment.URL, "jdbc:mysql://localhost:3306/hiber");
                properties.put(Environment.USER, "root");
                properties.put(Environment.PASS, "12345678");
                properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
                properties.put(Environment.SHOW_SQL, "true");
                properties.put(Environment.HBM2DDL_AUTO, "update");

                configuration.setProperties(properties);
                configuration.addAnnotatedClass(User.class);
                configuration.addAnnotatedClass(Passport.class);
                configuration.addAnnotatedClass(Adress.class);
                configuration.addAnnotatedClass(Book.class);
                configuration.addAnnotatedClass(Author.class);
                configuration.addAnnotatedClass(Person.class);
                configuration.addAnnotatedClass(Nissan.class);
                configuration.addAnnotatedClass(BMW.class);
                configuration.addAnnotatedClass(Employee.class);
                configuration.addAnnotatedClass(Developer.class);
                configuration.addAnnotatedClass(Manager.class);
                configuration.addAnnotatedClass(Product.class);
                configuration.addAnnotatedClass(Fruict.class);
                configuration.addAnnotatedClass(Water.class);
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {

                System.out.println("Some error: " + e.getMessage());
            }
        }
        return sessionFactory;
    }
}
