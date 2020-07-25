package ControllersCLI;

import DTO.DTO_Group;
import DTO.DTO_US02CreateGroup;
import DTO_Assembler.DTO_Assembler_US02CreateGroup;
import Services.Service_US01CheckIfSiblings;
import Services.Service_US02CreateGroup;
import model.Group;
import model.GroupRepository;

import java.time.LocalDate;

public class CLI_US02CreateGroup {

    //for now, service needs to be a parameter
    public DTO_Group controllersCLI_US02CreateGroup(LocalDate dateOfCreation, String denomination, GroupRepository groupRepository, Service_US02CreateGroup serviceUs02CreateGroup) {

        //needs to create a DTO to send to service
        DTO_Assembler_US02CreateGroup dto_assembler = new DTO_Assembler_US02CreateGroup();
        DTO_US02CreateGroup dtoFromPrimitiveTypes = dto_assembler.createDTOFromPrimitiveTypes(dateOfCreation,denomination);

        //will receive a DTO from service
        DTO_Group dto_group = serviceUs02CreateGroup.controllersCLI_US02CreateGroup(dtoFromPrimitiveTypes, groupRepository);

        //return result through a DTO
        return dto_group;
    }
}
