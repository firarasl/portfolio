package az.portfolio.portfolio.service;

import az.portfolio.portfolio.domain.Education;
import az.portfolio.portfolio.repository.JpaEducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationServiceImpl implements EducationService {

    @Autowired
    private JpaEducationRepository jpaEducationRepository;

    @Override
    public List<Education> getEducationOfAuthor() {
        return jpaEducationRepository.getEducationOfAuthor();
    }
}
