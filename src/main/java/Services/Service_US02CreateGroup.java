package Services;

import DTO.DTO_Group;
import DTO.DTO_US02CreateGroup;
import DTO_Assembler.DTO_Assembler_Group;
import model.Group;
import model.GroupRepository;

import java.time.LocalDate;

public class Service_US02CreateGroup {
    public DTO_Group controllersCLI_US02CreateGroup(DTO_US02CreateGroup dtoUs02CreateGroup, GroupRepository groupRepository) {

        //create group with info from the DTO
        Group group = Group.createGroupWithoutMembers(dtoUs02CreateGroup.getDateOfCreation(), dtoUs02CreateGroup.getDenomination());
        groupRepository.addGroupToGroupRepository(group);

        //result
        DTO_Group dtoCreatGroup = DTO_Assembler_Group.createDTOFromPrimitiveType(dtoUs02CreateGroup.getDateOfCreation(), dtoUs02CreateGroup.getDenomination());

        //return a DTO, needed a Group DTO type (DTO_Group)
        return dtoCreatGroup;
    }
}
