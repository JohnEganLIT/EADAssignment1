package Model;

import Passengers.Passengers;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public class RoutesDB {
        public static List<Passengers> getAllRoutes() {
        EntityManager em = DBUtil.getEmf().createEntityManager();
        
        String q = "SELECT p from Passengers p";
        
        TypedQuery<Passengers> tq = em.createQuery(q, Passengers.class);
        
        List<Passengers> list;
        
        try {
            list = tq.getResultList();
            if(list == null || list.isEmpty())
                list = null;
        }
        finally {
            em.close();
        }
        return list;
    }
        
    public static void updateRoute(Passengers p) {
        EntityManager em = DBUtil.getEmf().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        
        try {
            trans.begin();
            em.merge(p);
            trans.commit();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.close();
        }
    }
}
