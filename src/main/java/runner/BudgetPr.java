package runner;

import entity.Author;
import entity.Project;
import org.hibernate.Session;

import java.util.List;

//2. Вывести бюджет грантов для проектов автора

public class BudgetPr {

    public static void Task_2(Session session) {

        List<Author> authors = session.createQuery("FROM Author").list();

        System.out.println("Автор " + authors.get(0).getName());

        for (Project project : authors.get(0).getProjects()) {
            System.out.println("Проект " + project.getName() + " притендует на грант " + project.getGrant().getName() + "\n" +
                    "Бюджет гранта: " + project.getGrant().getBudget());
        }
    }
}
