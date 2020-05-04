package az.portfolio.portfolio.domain;


import javax.persistence.*;

@Entity
@Table(name = "education")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Author author;
    private String type;

    @OneToOne
    private Faculty faculty;
    @OneToOne
    private Facility facility;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Education{" +
                "id=" + id +
                ", author=" + author +
                ", type='" + type + '\'' +
                ", faculty=" + faculty +
                ", facility=" + facility +
                '}';
    }
}
