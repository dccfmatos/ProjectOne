package ControllersCLI;


import model.Person;
import model.PersonRepository;

import java.time.LocalDate;

public class CLI_US01CheckIfSiblings {

    public boolean controllersCLI_US01CheckIfSiblings (String personSocialNumber, String personToAnalyzeSocialNumber, PersonRepository personRepository) {

        Person person = personRepository.checkIfPersonExistsInRepository(personSocialNumber);
        Person personToAnalyze = personRepository.checkIfPersonExistsInRepository(personToAnalyzeSocialNumber);

        return person.checkIfSiblings(personToAnalyze);
    }

}
