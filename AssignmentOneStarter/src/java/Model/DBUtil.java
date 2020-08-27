package Model;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DBUtil {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("AssignmentOneStarterPU");
    
    public static EntityManagerFactory getEmf() {
        return emf;
    }
}
