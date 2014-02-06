package com.mycompany.ostrogothia;

import com.mycompany.hib.init.HibernateUtil;
import com.mycompany.ostrogothia.model.AuthorYear;
import com.mycompany.ostrogothia.model.Publications;
import org.hibernate.Session;

/**
 *
 * @author bogdasya
 */
public class ArticlesTest {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Publications publications = new Publications();
        publications.setName("JJsdsdJJJ");
        publications.setNaming("XklcjvgklcdjgklfXXX");
        publications.setYear(9999);

        session.save(publications);
        session.getTransaction().commit();
        session.close();
    }
}
