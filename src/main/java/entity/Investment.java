package entity;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "investments")
public class Investment implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "nameOrganization", nullable = false, length = 50)
    private String nameOrganization;

    @Column(name = "budget", nullable = false, length = 30)
    private double budget;

    @Column(name = "info", nullable = false, length = 300)
    private String info;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "grantId", nullable = false)
    private Grant grant1;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "investment")
    private List<Author> authors;

    public Investment() {
    }

    public Investment(String nameOrganization, double budget, String info, Grant grant1) {
        this.nameOrganization = nameOrganization;
        this.budget = budget;
        this.info = info;
        this.grant1 = grant1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameOrganization() {
        return nameOrganization;
    }

    public void setNameOrganization(String nameOrganization) {
        this.nameOrganization = nameOrganization;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Grant getGrant1() {
        return grant1;
    }

    public void setGrant1(Grant grant1) {
        this.grant1 = grant1;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
