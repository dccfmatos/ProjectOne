package mainPackage.ControllersCLI;

import mainPackage.DTO.DTO_Group;
import mainPackage.DTO.DTO_CreateGroup;
import mainPackage.DTO_Assembler.DTO_Assembler_CreateGroup;
import mainPackage.Services.Service_CreateGroup;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

public class CLI_CreateGroup {

    //Dependency injection
    @Autowired
    Service_CreateGroup service_createGroup;

    public DTO_Group controllersCLI_CreateGroup(LocalDate dateOfCreation, String denomination) {

        //needs to create a DTO to send to service
        DTO_Assembler_CreateGroup dto_assembler = new DTO_Assembler_CreateGroup();
        DTO_CreateGroup dtoGroupToCreate = dto_assembler.createDTOFromPrimitiveTypes(dateOfCreation,denomination);

        //will receive a DTO from service
        DTO_Group dto_group = service_createGroup.service_CreateGroup(dtoGroupToCreate);

        //return result through a DTO
        return dto_group;
    }
}
