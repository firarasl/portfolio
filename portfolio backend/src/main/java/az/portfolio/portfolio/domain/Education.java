package az.portfolio.portfolio.domain;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "education")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Author author;

    private String type;

    @OneToOne
    @JoinColumn(name = "faculty_id")
    private Faculty faculty;

    @OneToOne
    @JoinColumn(name = "facility_id")
    private Facility facility;

    private Timestamp startingDate;
    private Timestamp endingDate;

    public Timestamp getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Timestamp startingDate) {
        this.startingDate = startingDate;
    }

    public Timestamp getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(Timestamp endingDate) {
        this.endingDate = endingDate;
    }

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
