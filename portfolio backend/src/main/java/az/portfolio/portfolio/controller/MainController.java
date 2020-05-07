package az.portfolio.portfolio.controller;

import az.portfolio.portfolio.domain.Author;
import az.portfolio.portfolio.domain.Education;
import az.portfolio.portfolio.domain.Experience;
import az.portfolio.portfolio.domain.PhoneNumber;
import az.portfolio.portfolio.service.AuthorService;
import az.portfolio.portfolio.service.EducationService;
import az.portfolio.portfolio.service.ExperienceService;
import az.portfolio.portfolio.service.PhoneNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private EducationService educationService;

    @Autowired
    private ExperienceService experienceService;

    @Autowired
    private PhoneNumberService phoneNumberService;


    @GetMapping("/")
    private Author getAuthor() {
        return authorService.getAuthorInformation();
    }

    @GetMapping("/get-education")
    private List<Education> getEducationOfAuthor() {
        return educationService.getEducationOfAuthor();
    }

    @GetMapping("/get-experience")
    private List<Experience> getExperiene() {
        return experienceService.getAuthorExperience();
    }

    @GetMapping("/get-phonenumber")
    private List<PhoneNumber> getPhoneNumbers() {
        return phoneNumberService.getPhoneNumbers();
    }


    @GetMapping("/pdf-cv")
    public void downloadCV(HttpServletRequest request,
                           HttpServletResponse response) {

        Path file = Paths.get("C:\\portfolio\\portfolio backend\\src\\main\\java\\az\\portfolio\\portfolio\\file\\firangizCV.pdf");

        if (Files.exists(file)){
            response.setContentType("application/pdf");
            response.addHeader("Content-Disposition", "attachment; filename=firangizCV.pdf");

            try{
                Files.copy(file, response.getOutputStream());
                response.getOutputStream().flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }


}
