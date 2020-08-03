package mainPackage.ControllersCLI;

import mainPackage.DTO.DTO_Person;
import mainPackage.DTO.DTO_PersonSocialNumber;
import mainPackage.DTO_Assembler.DTO_Assembler_PersonSocialNumber;
import mainPackage.Services.Service_GetPerson;
import org.springframework.beans.factory.annotation.Autowired;


public class CLI_GetPerson {

    @Autowired
    Service_GetPerson service_getPerson;

    public DTO_Person controllersCLI_GetPerson(String personSocialNumber) {

        //needs to create a DTO to send to service
        DTO_Assembler_PersonSocialNumber dto_Assembler = new DTO_Assembler_PersonSocialNumber();
        DTO_PersonSocialNumber dtoFromPrimitiveTypes = dto_Assembler.createDTOFromPrimitiveTypes(personSocialNumber);

        //will receive a DTO from service
        DTO_Person dtoGetPerson = service_getPerson.service_GetPerson(dtoFromPrimitiveTypes);

        //return result through a DTO
        return dtoGetPerson;
    }
}

