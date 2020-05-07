package az.portfolio.portfolio.repository;


import az.portfolio.portfolio.domain.Education;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaEducationRepository extends CrudRepository<Education, Long> {

    @Query(value = "SELECT * " +
            "FROM portfolio.education education JOIN portfolio.facility ON education.facility_id= facility.id\n" +
            "LEFT JOIN portfolio.faculty ON education.faculty_id=faculty.id\n" +
            "WHERE education.author_id=1", nativeQuery = true)
    List<Education> getEducationOfAuthor();
}
