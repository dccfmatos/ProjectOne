package ControllersCLI;

import model.Group;
import model.GroupRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CLI_US02CreateGroupTest {

    @Test
    @DisplayName("Verify controller CLI_US02CreateGroup")
    void controllersCLI_US02CreateGroup() {

        //Arrange
        //Create parameters for Group
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "DevTeam Group";

        //Act
        ArrayList<Group> company = new ArrayList<>();
        GroupRepository groupRepository = GroupRepository.createGroupRepository(company);

        CLI_US02CreateGroup createGroupController = new CLI_US02CreateGroup();

        createGroupController.controllersCLI_US02CreateGroup(dateOfCreation, denomination, groupRepository);

        //Assert

    }
}