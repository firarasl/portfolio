package az.portfolio.portfolio.repository;

import az.portfolio.portfolio.domain.PhoneNumber;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaPhoneNumberRepository extends CrudRepository<PhoneNumber, Long> {

    @Query(value = "SELECT * " +
            "FROM portfolio.phone_number phonenumber WHERE phonenumber.author_id=1", nativeQuery = true)
    List<PhoneNumber> getAuthorNumbers();
}
