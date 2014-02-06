package com.mycompany.ostrogothia;

import com.mycompany.hib.init.HibernateUtil;
import com.mycompany.ostrogothia.model.AuthorYear;
import com.mycompany.ostrogothia.model.Documents;
import com.mycompany.ostrogothia.model.Monuments;
import com.mycompany.ostrogothia.model.Publications;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;

/**
 *
 * @author bogdasya
 */
public class MonumentTest {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        AuthorYear authorYear = new AuthorYear(1);
        Publications publications = new Publications(1);
        
        Documents documents = new Documents();
        documents.setPath("Dsdsd");
        documents.setType("hsjdfhs");
        
        Set<Documents> documentses = new HashSet<Documents>();
        documentses.add(documents);
        
        
        Monuments monuments = new Monuments();
        monuments.setName("XXXX");
        monuments.setType("YYYY");
        monuments.setCharacter("AAAA");
        monuments.setFounding("GGGGG");
        monuments.setAuthorYear(authorYear);
        monuments.setPublications(publications);
        monuments.setLatitude(8.7);
        monuments.setLongitude(8.9);
        monuments.setHydraulics("sdsd");
        monuments.setOrderRiver(56);
        monuments.setTopographi("EEE");
        monuments.setRegion("DDDD");
        monuments.setDistrict("QQQQ");
        
        
        session.save(monuments);
        session.getTransaction().commit();
        session.close();

    }
    
}
