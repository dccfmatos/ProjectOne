package Services;

import DTO.DTO_US02CreateGroup;
import model.Group;
import model.GroupRepository;

import java.time.LocalDate;

public class Service_US02CreateGroup {
    public Group controllersCLI_US02CreateGroup(DTO_US02CreateGroup dtoUs02CreateGroup, GroupRepository groupRepository) {


        Group group = Group.createGroupWithoutMembers(dtoUs02CreateGroup.getDateOfCreation(), dtoUs02CreateGroup.getDenomination());
        groupRepository.addGroupToGroupRepository(group);

        return group;
    }
}
