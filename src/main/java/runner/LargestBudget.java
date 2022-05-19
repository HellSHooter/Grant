package runner;

import entity.Investment;
import org.hibernate.Session;

import java.util.List;

//3. Вывести наибольший бюджет у инвесторов

public class LargestBudget {

    public static void Task_3(Session session) {

        List<Investment> investments = session.createQuery("FROM Investment").list();

        double max = 0;

        for (Investment investment : investments) {
            if (max < investment.getBudget()) {
                max = investment.getBudget();
            }
        }

        System.out.println("Наибольший бюджет у инвесторов: " + max);
    }
}
