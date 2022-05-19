package runner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utils.NewHibernateUtil;

/**
 * @author 19570
 */

public class Main {
    public static void main(String[] args) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        AuthorProject.Task_1(session);
        BudgetPr.Task_2(session);
        LargestBudget.Task_3(session);

        session.flush();
        transaction.commit();
        session.close();
        sf.close();
    }
}