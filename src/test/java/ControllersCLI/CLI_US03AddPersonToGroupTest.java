//package ControllersCLI;
//
//import mainPackage.ControllersCLI.CLI_US03AddPersonToGroup;
//import mainPackage.model.Group;
//import mainPackage.model.Person;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import java.time.LocalDate;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class CLI_US03AddPersonToGroupTest {
//
//    @Test
//    @DisplayName("Verify controller CLI_US03AddPersonToGroup")
//    void controllersCLI_US03AddPersonToGroup() {
//
//        //Arrange
//        //Create parameters for Group
//        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
//        String denomination = "DevTeam Group";
//
//        //Create Person
//        Person personToAdd = Person.createPerson("Maria", LocalDate.of(1986, 01, 25));
//
//        //Act
//        Group groupAddInto = Group.createGroupWithoutMembers(dateOfCreation, denomination);
//
//        CLI_US03AddPersonToGroup addPersonToGroupController = new CLI_US03AddPersonToGroup();
//
//        Group group = addPersonToGroupController.controllersCLI_US03AddPersonToGroup(personToAdd, groupAddInto);
//
//        Group groupExpected = Group.createGroupWithoutMembers(dateOfCreation, denomination);
//        groupExpected.addPersonToGroup(personToAdd);
//
//        //Assert
//        assertEquals(groupExpected, group);
//
//    }
//
//
//}