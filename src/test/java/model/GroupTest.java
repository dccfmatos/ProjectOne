package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GroupTest {

    // !!! INCOMPLETE

    @Test
    @DisplayName("Verify group constructor (without members) && equals")
    public void groupConstructorEquals() {

        //Arrange
        //Create parameters for Group
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "DevTeam Group";


        //Act
        //Create Groups
        Group devTeam = new Group(dateOfCreation, denomination);
        Group devTeam2 = new Group(dateOfCreation, denomination);

        //Assert
        //Verify if constructor works fine and if object is the same
        assertEquals(devTeam, devTeam2);
    }


    @Test
    @DisplayName("Verify group constructor (with members) && NotEquals")
    public void groupConstructorWMembNEquals() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();

        Person maria = new Person("Maria", "12-10-1976");
        Person jose = new Person("Jose", "03-11-1979");
        Person diana = new Person("Diana", "15-07-1992");
        Person john = new Person("John", "22-10-1960");

        membersDevTeam.add(maria);
        membersDevTeam.add(jose);
        membersDevTeam.add(diana);
        membersDevTeam.add(john);

        peopleInChargeDT.add(john);

        //Create parameters for Group2
        LocalDate dateOfCreation2 = LocalDate.of(2020, 01, 26);
        String denomination2 = "ConsultTeam Group";
        String description2 = "Group with ConsultTeam members";
        ArrayList<Person> membersConsultTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeCT = new ArrayList<Person>();

        Person max = new Person("Max", "01/01/2017");
        Person molly = new Person("Molly", "16-08-2019");
        Person susan = new Person("Susan", "16-09-1992");

        membersConsultTeam.add(max);
        membersConsultTeam.add(molly);
        membersConsultTeam.add(susan);

        peopleInChargeCT.add(susan);

        //Act
        //Create Groups
        Group devTeam = new Group(dateOfCreation, denomination, description, membersDevTeam, peopleInChargeDT);
        Group consultTeam = new Group(dateOfCreation2, denomination2, description2, membersConsultTeam, peopleInChargeCT);

        //Assert
        //Verify if constructor works fine and if objects are not the same
        assertNotEquals(devTeam, consultTeam);
    }


    @Test
    @DisplayName("Verify removePersonFromGroup of group")
    public void groupRemPersonFromGroup() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();

        Person maria = new Person("Maria", "12-10-1976");
        Person jose = new Person("Jose", "03-11-1979");
        Person diana = new Person("Diana", "15-07-1992");
        Person john = new Person("John", "22-10-1960");

        membersDevTeam.add(maria);
        membersDevTeam.add(jose);
        membersDevTeam.add(diana);
        membersDevTeam.add(john);

        peopleInChargeDT.add(john);

        //create expected members list
        ArrayList<Person> membersExpected = new ArrayList<Person>();
        membersExpected.add(maria);
        membersExpected.add(jose);
        membersExpected.add(john);

        //Act
        //Create group
        Group devTeam = new Group(dateOfCreation, denomination, description, membersDevTeam, peopleInChargeDT);

        //remove person from group
        devTeam.removePersonFromGroup(diana);

        //Assert
        assertEquals(membersExpected, devTeam.getMembers());

    }

    @Test
    @DisplayName("Verify removePersonFromGroup of group")
    public void groupAddPersonToGroup() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();

        Person maria = new Person("Maria", "12-10-1976");
        Person jose = new Person("Jose", "03-11-1979");
        Person diana = new Person("Diana", "15-07-1992");
        Person john = new Person("John", "22-10-1960");

        membersDevTeam.add(maria);
        membersDevTeam.add(jose);
        membersDevTeam.add(john);

        peopleInChargeDT.add(john);

        //create expected members list
        ArrayList<Person> membersExpected = new ArrayList<Person>();
        membersExpected.add(maria);
        membersExpected.add(jose);
        membersExpected.add(john);
        membersExpected.add(diana);


        //Act
        //Create group
        Group devTeam = new Group(dateOfCreation, denomination, description, membersDevTeam, peopleInChargeDT);

        //add person to group
        devTeam.addPersonToGroup(diana);

        //Assert
        assertEquals(membersExpected, devTeam.getMembers());
    }

    @Test
    @DisplayName("Verify getDateOfCreation() of group")
    public void groupGetDateCreation() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();

        Person maria = new Person("Maria", "12-10-1976");
        Person jose = new Person("Jose", "03-11-1979");
        Person john = new Person("John", "22-10-1960");

        membersDevTeam.add(maria);
        membersDevTeam.add(jose);
        membersDevTeam.add(john);

        peopleInChargeDT.add(john);


        //Act
        //Create group
        Group devTeam = new Group(dateOfCreation, denomination, description, membersDevTeam, peopleInChargeDT);
        //create expected dateOfCreation
        LocalDate expectedDateOfCreation = LocalDate.of(2020, 01, 26);


        //Assert
        assertEquals(expectedDateOfCreation, devTeam.getDateOfCreation());


    }

    @Test
    @DisplayName("Verify setDateOfCreation() of group")
    public void groupSetDateCreation() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 05, 22);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();

        Person maria = new Person("Maria", "12-10-1976");
        Person jose = new Person("Jose", "03-11-1979");
        Person john = new Person("John", "22-10-1960");

        membersDevTeam.add(maria);
        membersDevTeam.add(jose);
        membersDevTeam.add(john);

        peopleInChargeDT.add(john);


        //Act
        //Create group
        Group devTeam = new Group(dateOfCreation, denomination, description, membersDevTeam, peopleInChargeDT);
        //create expected dateOfCreation
        LocalDate expectedDateOfCreation = LocalDate.of(2020, 01, 26);

        LocalDate newDateOfCreation = LocalDate.of(2020, 01, 26);

        devTeam.setDateOfCreation(newDateOfCreation);


        //Assert
        assertEquals(expectedDateOfCreation, devTeam.getDateOfCreation());

    }

    @Test
    @DisplayName("Verify getDenomination() of group")
    public void groupGetDenomination() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 05, 22);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();

        Person maria = new Person("Maria", "12-10-1976");
        Person jose = new Person("Jose", "03-11-1979");
        Person john = new Person("John", "22-10-1960");

        membersDevTeam.add(maria);
        membersDevTeam.add(jose);
        membersDevTeam.add(john);

        peopleInChargeDT.add(john);


        //Act
        //Create group
        Group devTeam = new Group(dateOfCreation, denomination, description, membersDevTeam, peopleInChargeDT);

        //create expected denomination
        String expectedDenomination = "DevTeam Group";

        //Assert
        assertEquals(expectedDenomination, devTeam.getDenomination());

    }

    @Test
    @DisplayName("Verify setDenomination() of group")
    public void groupsetDenomination() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 05, 22);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();

        Person maria = new Person("Maria", "12-10-1976");
        Person jose = new Person("Jose", "03-11-1979");
        Person john = new Person("John", "22-10-1960");

        membersDevTeam.add(maria);
        membersDevTeam.add(jose);
        membersDevTeam.add(john);

        peopleInChargeDT.add(john);


        //Act
        //Create group
        Group devTeam = new Group(dateOfCreation, denomination, description, membersDevTeam, peopleInChargeDT);

        //create expected denomination
        String expectedDenomination = "anotherTeam Group";

        //New denomination
        String newDenomination = "anotherTeam Group";

        devTeam.setDenomination(newDenomination);


        //Assert
        assertEquals(expectedDenomination, devTeam.getDenomination());


    }

    @Test
    @DisplayName("Verify getDescription() of group")
    public void groupGetDescription() {


    }

    @Test
    @DisplayName("Verify setDescription() of group")
    public void groupSetDescription() {


    }

    @Test
    @DisplayName("Verify getMembers() of group")
    public void groupGetMembers() {


    }

    @Test
    @DisplayName("Verify setMembers() of group")
    public void groupSetMembers() {


    }

    @Test
    @DisplayName("Verify getPeopleInCharge() of group")
    public void groupGetPeopleInCharge() {


    }

    @Test
    @DisplayName("Verify setPeopleInCharge() of group")
    public void groupSetPeopleInCharge() {


    }

    @Test
    @DisplayName("Verify checkIfFamily() of group")
    public void groupCheckIfFamily() {


    }



}