package Services;

import DTO.DTO_US01CheckIfSiblings;
import model.Person;
import model.PersonRepository;

public class Service_US01CheckIfSiblings {
    public boolean controllersCLI_US01CheckIfSiblings (DTO_US01CheckIfSiblings dto, PersonRepository personRepository) {

        String personSocialNumber = dto.getPersonSocialNumber();
        String personToAnalyzeSocialNumber = dto.getPersonToAnalyzeSocialNumber();

        Person person = personRepository.checkIfPersonExistsInRepository(personSocialNumber);
        Person personToAnalyze = personRepository.checkIfPersonExistsInRepository(personToAnalyzeSocialNumber);

        return person.checkIfSiblings(personToAnalyze);
    }
}
