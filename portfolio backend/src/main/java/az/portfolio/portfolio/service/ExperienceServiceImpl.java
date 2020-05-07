package az.portfolio.portfolio.service;

import az.portfolio.portfolio.domain.Experience;
import az.portfolio.portfolio.repository.JpaExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceServiceImpl implements ExperienceService {

    @Autowired
    private JpaExperienceRepository jpaExperienceRepository;


    @Override
    public List<Experience> getAuthorExperience() {
        return jpaExperienceRepository.getAuthorExperience();
    }
}
