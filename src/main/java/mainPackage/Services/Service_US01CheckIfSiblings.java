package mainPackage.Services;

import mainPackage.DTO.DTO_Boolean;
import mainPackage.DTO.DTO_US01CheckIfSiblings;
import mainPackage.DTO_Assembler.DTO_Assembler_Boolean;
import mainPackage.model.Person;
import mainPackage.model.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class Service_US01CheckIfSiblings {

    //service should return a DTO
    public DTO_Boolean controllersCLI_US01CheckIfSiblings (DTO_US01CheckIfSiblings dto, PersonRepository personRepository) {

        //to check if siblings info is needed from the DTO:
        String personSocialNumber = dto.getPersonSocialNumber();
        String personToAnalyzeSocialNumber = dto.getPersonToAnalyzeSocialNumber();

        //CheckIfSiblings
        Person person = personRepository.checkIfPersonExistsInRepository(personSocialNumber);
        Person personToAnalyze = personRepository.checkIfPersonExistsInRepository(personToAnalyzeSocialNumber);

        //result
        boolean isSibling = person.checkIfSiblings(personToAnalyze);

        //return a DTO, needed a boolean DTO type (DTO_Boolean)
        return DTO_Assembler_Boolean.createDTOFromPrimitiveTypes(isSibling);
    }
}
