package com.company;

import com.company.entity.Developer;
import com.company.entity.Fruict;
import com.company.entity.Manager;
import com.company.entity.Water;
import com.company.util.HibernateUtil;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Fruict fruict = new Fruict("Apple", "RED");
        Water water = new Water("Coca-cola", 15.0);

        session.save(fruict);
        session.save(water);

    }
}
