package Services;

import DTO.DTO_Boolean;
import DTO.DTO_US01CheckIfSiblings;
import DTO_Assembler.DTO_Assembler_Boolean;
import model.Person;
import model.PersonRepository;

public class Service_US01CheckIfSiblings {
    public DTO_Boolean controllersCLI_US01CheckIfSiblings (DTO_US01CheckIfSiblings dto, PersonRepository personRepository) {

        String personSocialNumber = dto.getPersonSocialNumber();
        String personToAnalyzeSocialNumber = dto.getPersonToAnalyzeSocialNumber();

        Person person = personRepository.checkIfPersonExistsInRepository(personSocialNumber);
        Person personToAnalyze = personRepository.checkIfPersonExistsInRepository(personToAnalyzeSocialNumber);

        boolean isSibling = person.checkIfSiblings(personToAnalyze);

        return DTO_Assembler_Boolean.createDTOFromPrimitiveTypes(isSibling, "");
    }
}
