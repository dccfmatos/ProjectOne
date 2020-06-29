package ControllersCLI;

import model.Group;
import model.GroupRepository;

import java.time.LocalDate;

public class CLI_US02CreateGroup {

    public Group controllersCLI_US02CreateGroup(LocalDate dateOfCreation, String denomination, GroupRepository groupRepository) {

        Group group = Group.createGroupWithoutMembers(dateOfCreation, denomination);
        groupRepository.addGroupToGroupRepository(group);

        return group;
    }
}
