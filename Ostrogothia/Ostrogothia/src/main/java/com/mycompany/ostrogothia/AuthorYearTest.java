package com.mycompany.ostrogothia;

import com.mycompany.hib.init.HibernateUtil;
import com.mycompany.ostrogothia.model.AuthorYear;
import org.hibernate.Session;

/**
 *
 * @author bogdasya
 */
public class AuthorYearTest {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        AuthorYear authorYear = new AuthorYear();
        authorYear.setName("TTTT");
        authorYear.setYear(8888);
        authorYear.setAuthorName("RRRR");

        session.save(authorYear);
        session.getTransaction().commit();
        session.close();

    }
}
