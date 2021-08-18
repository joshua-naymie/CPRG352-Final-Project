package dataaccess;

import javax.persistence.*;

public class DBUtil
{
    private static final
    EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("Home_nVentoryPU");
    
    public static EntityManagerFactory getEMFactory()
    {
        return emFactory;
    }
}