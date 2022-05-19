package runner;

import entity.Author;
import entity.Project;
import org.hibernate.Session;

import java.util.List;

// 1. Вывести автора и его проект

public class AuthorProject {

    public static void Task_1(Session session) {

        List<Author> authors = session.createQuery("FROM Author").list();

        for (Author author : authors) {
            System.out.println("Автор " + author.getName() + "\n" +
                    "Проекты:");
            for (Project project : author.getProjects()) {
                System.out.println(project.getName());
            }
        }
    }
}
