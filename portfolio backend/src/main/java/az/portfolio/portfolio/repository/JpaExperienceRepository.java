package az.portfolio.portfolio.repository;

import az.portfolio.portfolio.domain.Experience;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaExperienceRepository extends CrudRepository<Experience, Long> {

    @Query(value = "SELECT * " +
            "FROM portfolio.experience experience WHERE experience.author_id=1;", nativeQuery = true)
    List<Experience> getAuthorExperience();

}
