package entity;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "projects")
public class Project implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "info", nullable = false, length = 200)
    private String info;

    @Column(name = "link", nullable = false, length = 50)
    private String link;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "authorId", nullable = false)
    private Author author;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "grantId", nullable = false)
    private Grant grant;

    public Project() {
    }

    public Project(Long id, String name, String info, String link, Author author, Grant grant) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.link = link;
        this.author = author;
        this.grant = grant;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Grant getGrant() {
        return grant;
    }

    public void setGrant(Grant grant) {
        this.grant = grant;
    }
}
