package entity;

import javax.persistence.*;

import java.util.List;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "grants")
public class Grant implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "budget", nullable = false, length = 30)
    private double budget;

    @Column(name = "fond", nullable = false, length = 30)
    private double fond;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "grant")
    private Set<Project> projects;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "grant1")
    private Set<Investment> investments;

    public Grant(String name, double budget, double fond) {
        this.name = name;
        this.budget = budget;
        this.fond = fond;
    }

    public Grant() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getFond() {
        return fond;
    }

    public void setFond(double fond) {
        this.fond = fond;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    public Set<Investment> getInvestments() {
        return investments;
    }

    public void setInvestments(Set<Investment> investments) {
        this.investments = investments;
    }
}
