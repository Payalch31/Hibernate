package com.carnation;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.carnation.entity.Bank;
import com.carnation.entity.Customer;

public class App 
{
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure().addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Bank.class);
        SessionFactory sf = cfg.buildSessionFactory();

        Session session = sf.openSession();
        session.beginTransaction();
        // --------------

        Customer c1 = new Customer();
        c1.setUserId(101);
        c1.setName("PAYAL CHAUDHARI");
        c1.setAddress("Pune");

        Customer c2 = new Customer();
        c2.setUserId(102);
        c2.setName("PRIYANKA CHAVAN");
        c2.setAddress("JALGAON");

        Bank b1 = new Bank();
        b1.setId(301);
        b1.setName("KOTAK MAHINDRA");
        b1.setBranch("RAVET");

        Bank b2 = new Bank();
        b2.setId(302);
        b2.setName("AXIS BANK");
        b2.setBranch("shivajinagar");

        Bank b3 = new Bank();
        b3.setId(303);
        b3.setName("HDFC Bank");
        b3.setBranch("PIMPRI CHINCHWAD");

        // Saving the Bank objects before associating them with customers to avoid foreign key violation
        session.save(b1);
        session.save(b2);
        session.save(b3);

        c1.setDocuments(Arrays.asList(b1));
        c2.setDocuments(Arrays.asList(b2));

        session.save(c1);
        session.save(c2);

        // -------------
        session.getTransaction().commit();
        session.close();
    }
}
