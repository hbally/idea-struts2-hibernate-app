import com.ttg.bean.MUser;
import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.metamodel.EntityType;

import java.util.Map;

public class Main {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();
        try {
            System.out.println("querying all the managed entities...");
            final Metamodel metamodel = session.getSessionFactory().getMetamodel();
//            for (EntityType<?> entityType : metamodel.getEntities()) {
//                final String entityName = entityType.getName();
//                final Query query = session.createQuery("from " + entityName);
//                System.out.println("executing: " + query.getQueryString());
//                for (Object o : query.list()) {
//                    System.out.println("  " + o);
//                }
//            }
            //第一种方式-查询所有的对象参数
            String sql = "select  *  from  m_user t ";
            Query<MUser> q = session.createNativeQuery(sql,MUser.class);
            for (MUser o : q.list()) {
                System.out.println("  " + o);
            }
            //第二种方式-查询表中的某些参数
            String sql2 = "select t.no, t.age,t.name  from  m_user t ";
            NativeQuery q2 = session.createNativeQuery(sql2);
            for (Object o : q2.list()) {
                Object[] params = (Object[]) o;
                System.out.println("  no =" + params[0] + " age =" + params[1] + " name=" + params[2]);
            }
        } finally {
            session.close();
        }
    }
}