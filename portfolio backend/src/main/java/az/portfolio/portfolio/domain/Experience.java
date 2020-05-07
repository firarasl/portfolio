package az.portfolio.portfolio.domain;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private Author author;

    private String position;
    private String company;

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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", author=" + author +
                ", position='" + position + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
