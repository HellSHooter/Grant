package entity;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "authors")
public class Author implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "address", nullable = false, length = 50)
    private String address;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "author")
    private List<Project> projects;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "investmentId", nullable = false)
    private Investment investment;

    public Author() {
    }

    public Author(String name, String address, Investment investment) {
        this.name = name;
        this.address = address;
        this.investment = investment;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Investment getInvestment() {
        return investment;
    }

    public void setInvestment(Investment investment) {
        this.investment = investment;
    }
}
