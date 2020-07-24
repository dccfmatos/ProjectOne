package ControllersCLI;


import DTO.DTO_US01CheckIfSiblings;
import DTO_Assembler.DTO_Assembler_US01CheckIfSiblings;
import Services.Service_US01CheckIfSiblings;
import model.Person;
import model.PersonRepository;

import java.time.LocalDate;

public class CLI_US01CheckIfSiblings {

    public boolean controllersCLI_US01CheckIfSiblings(String personSocialNumber, String personToAnalyzeSocialNumber,
                                                      PersonRepository personRepository, Service_US01CheckIfSiblings service_us01CheckIfSiblings) {
//        Person person = personRepository.checkIfPersonExistsInRepository(personSocialNumber);
//        Person personToAnalyze = personRepository.checkIfPersonExistsInRepository(personToAnalyzeSocialNumber);

        DTO_Assembler_US01CheckIfSiblings dto_Assembler = new DTO_Assembler_US01CheckIfSiblings();
        DTO_US01CheckIfSiblings dtoFromPrimitiveTypes = dto_Assembler.createDTOFromPrimitiveTypes(personSocialNumber, personToAnalyzeSocialNumber);


        return service_us01CheckIfSiblings.controllersCLI_US01CheckIfSiblings(dtoFromPrimitiveTypes, personRepository);
    }

}
