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

    public DTO_Group controllersCLI_US02CreateGroup(LocalDate dateOfCreation, String denomination, GroupRepository groupRepository, Service_US02CreateGroup serviceUs02CreateGroup) {

//        Group group = Group.createGroupWithoutMembers(dateOfCreation, denomination);
//        groupRepository.addGroupToGroupRepository(group);

        DTO_Assembler_US02CreateGroup dto_assembler = new DTO_Assembler_US02CreateGroup();
        DTO_US02CreateGroup dtoFromPrimitiveTypes = dto_assembler.createDTOFromPrimitiveTypes(dateOfCreation,denomination);

        DTO_Group dto_group = serviceUs02CreateGroup.controllersCLI_US02CreateGroup(dtoFromPrimitiveTypes, groupRepository);

        return dto_group;
    }
}
