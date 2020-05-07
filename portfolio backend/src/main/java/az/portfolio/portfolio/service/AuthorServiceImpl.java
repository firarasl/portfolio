package az.portfolio.portfolio.service;

import az.portfolio.portfolio.domain.Author;
import az.portfolio.portfolio.repository.JpaAuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private JpaAuthorRepository jpaAuthorRepository;

    @Override
    public Author getAuthorInformation() {
        Author author= jpaAuthorRepository.getInformation();
        return author;
    }
}
