package az.portfolio.portfolio.domain;

import javax.persistence.*;

@Entity
@Table(name = "phone_number")
public class PhoneNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String value;
    @ManyToOne(cascade = CascadeType.ALL)
    private Author author;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", author=" + author +
                '}';
    }
}
