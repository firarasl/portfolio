package az.portfolio.portfolio.repository;

import az.portfolio.portfolio.domain.Author;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaAuthorRepository extends CrudRepository<Author, Long> {

    @Query(value = "SELECT author.id, author.bio, author.email, author.surname, author.birthdate, author.name, author.country_id\n" +
            "FROM portfolio.author author JOIN portfolio.country country ON author.country_id=country.id WHERE author.id=1", nativeQuery = true)
    Author getInformation();

}
