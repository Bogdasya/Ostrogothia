package com.mycompany.ostrogothia;

import com.mycompany.hib.init.HibernateUtil;
import com.mycompany.ostrogothia.model.Monuments;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author bogdasya
 */
public class ReadOperation {
    public static void main(String[] args)
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();  
        Session session = sessionFactory.openSession();  
          
        List<Monuments> s = session.createQuery("from Monuments").list();  
          
        session.close();  
          
        for (Monuments st : s) {  
            System.out.println(st.getIdMonument()+". "+st.getCharacter()+" "+st.getDistrict());  
        }  
    }
}
