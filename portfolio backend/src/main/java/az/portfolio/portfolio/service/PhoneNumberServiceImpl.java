package az.portfolio.portfolio.service;

import az.portfolio.portfolio.domain.PhoneNumber;
import az.portfolio.portfolio.repository.JpaPhoneNumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneNumberServiceImpl implements PhoneNumberService{
    @Autowired
    private JpaPhoneNumberRepository jpaPhoneNumberRepository;

    @Override
    public List<PhoneNumber> getPhoneNumbers() {
        return jpaPhoneNumberRepository.getAuthorNumbers();
    }
}
