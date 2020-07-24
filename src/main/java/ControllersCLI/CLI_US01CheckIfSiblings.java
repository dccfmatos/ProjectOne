package ControllersCLI;


import Services.Service_US01CheckIfSiblings;
import model.Person;
import model.PersonRepository;

import java.time.LocalDate;

public class CLI_US01CheckIfSiblings {

    public boolean controllersCLI_US01CheckIfSiblings (String personSocialNumber, String personToAnalyzeSocialNumber, PersonRepository personRepository, Service_US01CheckIfSiblings service_us01CheckIfSiblings) {
//        Person person = personRepository.checkIfPersonExistsInRepository(personSocialNumber);
//        Person personToAnalyze = personRepository.checkIfPersonExistsInRepository(personToAnalyzeSocialNumber);

        return service_us01CheckIfSiblings.controllersCLI_US01CheckIfSiblings(personSocialNumber, personToAnalyzeSocialNumber, personRepository);
    }

}
