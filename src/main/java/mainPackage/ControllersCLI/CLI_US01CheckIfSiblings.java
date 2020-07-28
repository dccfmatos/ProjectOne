package mainPackage.ControllersCLI;

import mainPackage.DTO.DTO_Boolean;
import mainPackage.DTO.DTO_US01CheckIfSiblings;
import mainPackage.DTO_Assembler.DTO_Assembler_US01CheckIfSiblings;
import mainPackage.Services.Service_US01CheckIfSiblings;
import mainPackage.model.PersonRepository;


public class CLI_US01CheckIfSiblings {

    //for now, service needs to be a parameter
    public DTO_Boolean controllersCLI_US01CheckIfSiblings(String personSocialNumber, String personToAnalyzeSocialNumber,
                                                          PersonRepository personRepository, Service_US01CheckIfSiblings service_us01CheckIfSiblings) {

        //needs to create a DTO to send to service
        DTO_Assembler_US01CheckIfSiblings dto_Assembler = new DTO_Assembler_US01CheckIfSiblings();
        DTO_US01CheckIfSiblings dtoFromPrimitiveTypes = dto_Assembler.createDTOFromPrimitiveTypes(personSocialNumber, personToAnalyzeSocialNumber);

        //will receive a DTO from service
        DTO_Boolean dto_checkIfSiblings = service_us01CheckIfSiblings.controllersCLI_US01CheckIfSiblings(dtoFromPrimitiveTypes, personRepository);

        //return result through a DTO
        return dto_checkIfSiblings;
    }

}
