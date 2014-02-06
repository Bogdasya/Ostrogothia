package com.mycompany.ostrogothia;

import com.mycompany.hib.init.HibernateUtil;
import com.mycompany.ostrogothia.model.Documents;
import com.mycompany.ostrogothia.model.Monuments;
import org.hibernate.Session;

/**
 *
 * @author bogdasya
 */
public class DocumentsTest {
     public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Documents documents = new Documents();
        documents.setIdDocument(1);
        documents.setPath("sdsdsd");
        documents.setType("csdsdsd");
        Monuments a = new Monuments(3); 
        documents.setMonuments(a);

        session.save(documents);
        session.getTransaction().commit();
        session.close();

    }
    
}
