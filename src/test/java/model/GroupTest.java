package model;

import mainPackage.model.Group;
import mainPackage.model.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GroupTest {


    @Test
    @DisplayName("Verify group constructor (without members) || Equals")
    public void groupConstructorEquals() {

        //Arrange
        //Create parameters for Group
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "DevTeam Group";


        //Act
        //Create Groups
        Group devTeam = Group.createGroupWithoutMembers(dateOfCreation, denomination);
        Group devTeam2 = Group.createGroupWithoutMembers(dateOfCreation, denomination);

        //Assert
        //Verify if constructor works fine and if object is the same
        assertEquals(devTeam, devTeam2);
    }

    @Test
    @DisplayName("Verify group constructor (without members) || NotEquals")
    public void groupConstructorNotEquals() {

        //Arrange
        //Create parameters for Group
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "DevTeam Group";

        //Act & Assert
        try {
            Group devTeam = Group.createGroupWithoutMembers(dateOfCreation, null);
            assertTrue(false, "Group not created. Denomination can't be Null");
        } catch (Exception e) {
        }
    }


    @Test
    @DisplayName("Verify group constructor (with members) || NotEquals")
    public void groupConstructorWMembNEquals() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();
        String mariaSocialNumber = "123456";
        String joseSocialNumber = "789456";
        String dianaSocialNumber = "784648";
        String johnSocialNumber = "854125";

        Person maria = Person.createPerson(mariaSocialNumber, "Maria", LocalDate.of(1976, 10, 12));
        Person jose = Person.createPerson(joseSocialNumber, "Jose", LocalDate.of(1979, 11, 3));
        Person diana = Person.createPerson(dianaSocialNumber, "Diana", LocalDate.of(1992, 7, 15));
        Person john = Person.createPerson(johnSocialNumber, "John", LocalDate.of(1960, 10, 22));

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

        String maxSocialNumber = "12346";
        String mollySocialNumber = "98756";
        String susanSocialNumber = "15478";

        Person max = Person.createPerson(maxSocialNumber, "Max", LocalDate.of(2017, 1, 1));
        Person molly = Person.createPerson(mollySocialNumber, "Molly", LocalDate.of(2019, 8, 16));
        Person susan = Person.createPerson(susanSocialNumber, "Susan", LocalDate.of(1992, 9, 16));

        membersConsultTeam.add(max);
        membersConsultTeam.add(molly);
        membersConsultTeam.add(susan);

        peopleInChargeCT.add(susan);

        //Act
        //Create Groups
        Group devTeam = Group.createGroupWithMembersAndPersonInCharge(dateOfCreation, denomination, description, membersDevTeam, peopleInChargeDT);
        Group consultTeam = Group.createGroupWithMembersAndPersonInCharge(dateOfCreation2, denomination2, description2, membersConsultTeam, peopleInChargeCT);

        //Assert
        //Verify if constructor works fine and if objects are not the same
        assertNotEquals(devTeam, consultTeam);
    }

    @Test
    @DisplayName("Verify group constructor (with members) || Equals")
    public void groupConstructorWMembEquals() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();
        String mariaSocialNumber = "123456";
        String joseSocialNumber = "789456";
        String dianaSocialNumber = "784648";
        String johnSocialNumber = "854125";

        Person maria = Person.createPerson(mariaSocialNumber, "Maria", LocalDate.of(1976, 10, 12));
        Person jose = Person.createPerson(joseSocialNumber, "Jose", LocalDate.of(1979, 11, 3));
        Person diana = Person.createPerson(dianaSocialNumber, "Diana", LocalDate.of(1992, 7, 15));
        Person john = Person.createPerson(johnSocialNumber, "John", LocalDate.of(1960, 10, 22));

        membersDevTeam.add(maria);
        membersDevTeam.add(jose);
        membersDevTeam.add(diana);
        membersDevTeam.add(john);

        peopleInChargeDT.add(john);


        //Act
        //Create Groups
        Group devTeam = Group.createGroupWithMembersAndPersonInCharge(dateOfCreation, denomination, description, membersDevTeam, peopleInChargeDT);
        Group devTeam2 = Group.createGroupWithMembersAndPersonInCharge
                (LocalDate.of(2020, 01, 26), "DevTeam Group", "Group with devTeam members",
                        membersDevTeam, peopleInChargeDT);

        //Assert
        //Verify if constructor works fine and if objects are the same
        assertEquals(devTeam, devTeam2);
    }

    @Test
    @DisplayName("Verify group constructor (with members) || Exception")
    public void groupConstructorWMembException() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();

        String mariaSocialNumber = "123456";
        String joseSocialNumber = "789456";
        String dianaSocialNumber = "784648";
        String johnSocialNumber = "854125";

        Person maria = Person.createPerson(mariaSocialNumber, "Maria", LocalDate.of(1976, 10, 12));
        Person jose = Person.createPerson(joseSocialNumber, "Jose", LocalDate.of(1979, 11, 3));
        Person diana = Person.createPerson(dianaSocialNumber, "Diana", LocalDate.of(1992, 7, 15));
        Person john = Person.createPerson(johnSocialNumber, "John", LocalDate.of(1960, 10, 22));

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

        String maxSocialNumber = "12346";
        String mollySocialNumber = "98756";
        String susanSocialNumber = "15478";

        Person max = Person.createPerson(maxSocialNumber, "Max", LocalDate.of(2017, 1, 1));
        Person molly = Person.createPerson(mollySocialNumber, "Molly", LocalDate.of(2019, 8, 16));
        Person susan = Person.createPerson(susanSocialNumber, "Susan", LocalDate.of(1992, 9, 16));

        membersConsultTeam.add(max);
        membersConsultTeam.add(molly);
        membersConsultTeam.add(susan);

        peopleInChargeCT.add(susan);

        //Act
        Throwable thrown = assertThrows(NullPointerException.class, ()
                -> Group.createGroupWithMembersAndPersonInCharge
                (dateOfCreation, null, description, membersDevTeam, peopleInChargeDT));

        //Assert
        assertEquals(thrown.getMessage(), "Group not created. Denomination can't be Null");
    }

    @Test
    @DisplayName("Verify removePersonFromGroup of group || Equals")
    public void groupRemPersonFromGroup() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();

        String mariaSocialNumber = "123456";
        String joseSocialNumber = "789456";
        String dianaSocialNumber = "784648";
        String johnSocialNumber = "854125";

        Person maria = Person.createPerson(mariaSocialNumber, "Maria", LocalDate.of(1976, 10, 12));
        Person jose = Person.createPerson(joseSocialNumber, "Jose", LocalDate.of(1979, 11, 3));
        Person diana = Person.createPerson(dianaSocialNumber, "Diana", LocalDate.of(1992, 7, 15));
        Person john = Person.createPerson(johnSocialNumber, "John", LocalDate.of(1960, 10, 22));

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
        Group devTeam = Group.createGroupWithMembersAndPersonInCharge(dateOfCreation, denomination, description, membersDevTeam, peopleInChargeDT);

        //remove person from group
        devTeam.removePersonFromGroup(diana);

        //Assert
        assertEquals(membersExpected, devTeam.getMembers());
    }

    @Test
    @DisplayName("Verify removePersonFromGroup of group || Exception")
    public void groupRemPersonFromGroupExcep() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();

        String mariaSocialNumber = "123456";
        String joseSocialNumber = "789456";
        String dianaSocialNumber = "784648";
        String johnSocialNumber = "854125";

        Person maria = Person.createPerson(mariaSocialNumber, "Maria", LocalDate.of(1976, 10, 12));
        Person jose = Person.createPerson(joseSocialNumber, "Jose", LocalDate.of(1979, 11, 3));
        Person diana = Person.createPerson(dianaSocialNumber, "Diana", LocalDate.of(1992, 7, 15));
        Person john = Person.createPerson(johnSocialNumber, "John", LocalDate.of(1960, 10, 22));

        membersDevTeam.add(maria);
        membersDevTeam.add(jose);
        membersDevTeam.add(john);
        peopleInChargeDT.add(john);

        //Act
        //Create group
        Group devTeam = Group.createGroupWithMembersAndPersonInCharge(dateOfCreation, denomination, description, membersDevTeam, peopleInChargeDT);

        //remove person from group
        Throwable thrown = assertThrows(IllegalArgumentException.class, () -> devTeam.removePersonFromGroup(diana));

        //Assert
        assertEquals(thrown.getMessage(), "Can't remove. Person does not belong in Group.");

    }

    @Test
    @DisplayName("Verify addPersonToGroup of group || Exception")
    public void groupAddPersonToGroupException() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();

        String mariaSocialNumber = "123456";
        String joseSocialNumber = "789456";
        String dianaSocialNumber = "784648";
        String johnSocialNumber = "854125";

        Person maria = Person.createPerson(mariaSocialNumber, "Maria", LocalDate.of(1976, 10, 12));
        Person jose = Person.createPerson(joseSocialNumber, "Jose", LocalDate.of(1979, 11, 3));
        Person diana = Person.createPerson(dianaSocialNumber, "Diana", LocalDate.of(1992, 7, 15));
        Person john = Person.createPerson(johnSocialNumber, "John", LocalDate.of(1960, 10, 22));

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
        Group group = Group.createGroupWithMembersAndPersonInCharge(dateOfCreation, denomination, description, membersDevTeam, peopleInChargeDT);
        Throwable thrown = assertThrows(IllegalArgumentException.class, () ->
                group.addPersonToGroup(john));

        //Assert
        assertEquals(thrown.getMessage(), "Person already belong into Group members.");
    }

    @Test
    @DisplayName("Verify addPersonToGroup of group || Equals")
    public void groupAddPersonToGroup() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();

        String mariaSocialNumber = "123456";
        String joseSocialNumber = "789456";
        String dianaSocialNumber = "784648";
        String johnSocialNumber = "854125";

        Person maria = Person.createPerson(mariaSocialNumber, "Maria", LocalDate.of(1976, 10, 12));
        Person jose = Person.createPerson(joseSocialNumber, "Jose", LocalDate.of(1979, 11, 3));
        Person diana = Person.createPerson(dianaSocialNumber, "Diana", LocalDate.of(1992, 7, 15));
        Person john = Person.createPerson(johnSocialNumber, "John", LocalDate.of(1960, 10, 22));

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
        Group devTeam = Group.createGroupWithMembersAndPersonInCharge(dateOfCreation, denomination, description, membersDevTeam, peopleInChargeDT);

        //add person to group
        devTeam.addPersonToGroup(diana);

        //Assert
        assertEquals(membersExpected, devTeam.getMembers());
    }

    @Test
    @DisplayName("Verify getDateOfCreation() of group || Equals")
    public void groupGetDateCreation() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();

        String mariaSocialNumber = "123456";
        String joseSocialNumber = "789456";
        String johnSocialNumber = "854125";

        Person maria = Person.createPerson(mariaSocialNumber, "Maria", LocalDate.of(1976, 10, 12));
        Person jose = Person.createPerson(joseSocialNumber, "Jose", LocalDate.of(1979, 11, 3));
        Person john = Person.createPerson(johnSocialNumber, "John", LocalDate.of(1960, 10, 22));

        membersDevTeam.add(maria);
        membersDevTeam.add(jose);
        membersDevTeam.add(john);

        peopleInChargeDT.add(john);


        //Act
        //Create group
        Group devTeam = Group.createGroupWithMembersAndPersonInCharge(dateOfCreation, denomination, description, membersDevTeam, peopleInChargeDT);
        //create expected dateOfCreation
        LocalDate expectedDateOfCreation = LocalDate.of(2020, 01, 26);


        //Assert
        assertEquals(expectedDateOfCreation, devTeam.getDateOfCreation());


    }

    @Test
    @DisplayName("Verify setDateOfCreation() of group || Equals")
    public void groupSetDateCreation() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 05, 22);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();

        String mariaSocialNumber = "123456";
        String joseSocialNumber = "789456";
        String johnSocialNumber = "854125";

        Person maria = Person.createPerson(mariaSocialNumber, "Maria", LocalDate.of(1976, 10, 12));
        Person jose = Person.createPerson(joseSocialNumber, "Jose", LocalDate.of(1979, 11, 3));
        Person john = Person.createPerson(johnSocialNumber, "John", LocalDate.of(1960, 10, 22));

        membersDevTeam.add(maria);
        membersDevTeam.add(jose);
        membersDevTeam.add(john);

        peopleInChargeDT.add(john);


        //Act
        //Create group
        Group devTeam = Group.createGroupWithMembersAndPersonInCharge(dateOfCreation, denomination, description, membersDevTeam, peopleInChargeDT);
        //create expected dateOfCreation
        LocalDate expectedDateOfCreation = LocalDate.of(2020, 01, 26);

        LocalDate newDateOfCreation = LocalDate.of(2020, 01, 26);

        devTeam.setDateOfCreation(newDateOfCreation);


        //Assert
        assertEquals(expectedDateOfCreation, devTeam.getDateOfCreation());

    }

    @Test
    @DisplayName("Verify getDenomination() of group || Equals")
    public void groupGetDenomination() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 05, 22);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();

        String mariaSocialNumber = "123456";
        String joseSocialNumber = "789456";
        String johnSocialNumber = "854125";

        Person maria = Person.createPerson(mariaSocialNumber, "Maria", LocalDate.of(1976, 10, 12));
        Person jose = Person.createPerson(joseSocialNumber, "Jose", LocalDate.of(1979, 11, 3));
        Person john = Person.createPerson(johnSocialNumber, "John", LocalDate.of(1960, 10, 22));

        membersDevTeam.add(maria);
        membersDevTeam.add(jose);
        membersDevTeam.add(john);

        peopleInChargeDT.add(john);


        //Act
        //Create group
        Group devTeam = Group.createGroupWithMembersAndPersonInCharge(dateOfCreation, denomination, description, membersDevTeam, peopleInChargeDT);

        //create expected denomination
        String expectedDenomination = "DevTeam Group";

        //Assert
        assertEquals(expectedDenomination, devTeam.getDenomination());

    }

    @Test
    @DisplayName("Verify setDenomination() of group || Equals")
    public void groupsetDenomination() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 05, 22);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();

        String mariaSocialNumber = "123456";
        String joseSocialNumber = "789456";
        String johnSocialNumber = "854125";

        Person maria = Person.createPerson(mariaSocialNumber, "Maria", LocalDate.of(1976, 10, 12));
        Person jose = Person.createPerson(joseSocialNumber, "Jose", LocalDate.of(1979, 11, 3));
        Person john = Person.createPerson(johnSocialNumber, "John", LocalDate.of(1960, 10, 22));

        membersDevTeam.add(maria);
        membersDevTeam.add(jose);
        membersDevTeam.add(john);

        peopleInChargeDT.add(john);


        //Act
        //Create group
        Group devTeam = Group.createGroupWithMembersAndPersonInCharge(dateOfCreation, denomination, description, membersDevTeam, peopleInChargeDT);

        //create expected denomination
        String expectedDenomination = "anotherTeam Group";

        //New denomination
        String newDenomination = "anotherTeam Group";

        devTeam.setDenomination(newDenomination);


        //Assert
        assertEquals(expectedDenomination, devTeam.getDenomination());


    }

    @Test
    @DisplayName("Verify getDescription() of group || Equals")
    public void groupGetDescription() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 05, 22);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();

        String mariaSocialNumber = "123456";
        String joseSocialNumber = "789456";
        String johnSocialNumber = "854125";

        Person maria = Person.createPerson(mariaSocialNumber, "Maria", LocalDate.of(1976, 10, 12));
        Person jose = Person.createPerson(joseSocialNumber, "Jose", LocalDate.of(1979, 11, 3));
        Person john = Person.createPerson(johnSocialNumber, "John", LocalDate.of(1960, 10, 22));

        membersDevTeam.add(maria);
        membersDevTeam.add(jose);
        membersDevTeam.add(john);

        peopleInChargeDT.add(john);


        //Act
        //Create group
        Group devTeam = Group.createGroupWithMembersAndPersonInCharge(dateOfCreation, denomination, description, membersDevTeam, peopleInChargeDT);

        //create expected description
        String expectedDescription = "Group with consultTeam members";

        //New description
        String newDescription = "Group with consultTeam members";

        devTeam.setDescription(newDescription);


        //Assert
        assertEquals(expectedDescription, devTeam.getDescription());

    }

    @Test
    @DisplayName("Verify setDescription() of group || Equals")
    public void groupSetDescription() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 05, 22);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();

        String mariaSocialNumber = "123456";
        String joseSocialNumber = "789456";
        String johnSocialNumber = "854125";

        Person maria = Person.createPerson(mariaSocialNumber, "Maria", LocalDate.of(1976, 10, 12));
        Person jose = Person.createPerson(joseSocialNumber, "Jose", LocalDate.of(1979, 11, 3));
        Person john = Person.createPerson(johnSocialNumber, "John", LocalDate.of(1960, 10, 22));

        membersDevTeam.add(maria);
        membersDevTeam.add(jose);
        membersDevTeam.add(john);

        peopleInChargeDT.add(john);


        //Act
        //Create group
        Group devTeam = Group.createGroupWithMembersAndPersonInCharge(dateOfCreation, denomination, description, membersDevTeam, peopleInChargeDT);

        //create expected description
        String expectedDescription = "Group with consultTeam members";

        //New escription
        String newDescription = "Group with consultTeam members";

        devTeam.setDescription(newDescription);

        //Assert
        assertEquals(expectedDescription, devTeam.getDescription());

    }

    @Test
    @DisplayName("Verify getMembers() of group || Equals")
    public void groupGetMembers() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 05, 22);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();

        String mariaSocialNumber = "123456";
        String joseSocialNumber = "789456";
        String johnSocialNumber = "854125";

        Person maria = Person.createPerson(mariaSocialNumber, "Maria", LocalDate.of(1976, 10, 12));
        Person jose = Person.createPerson(joseSocialNumber, "Jose", LocalDate.of(1979, 11, 3));
        Person john = Person.createPerson(johnSocialNumber, "John", LocalDate.of(1960, 10, 22));

        membersDevTeam.add(maria);
        membersDevTeam.add(jose);
        membersDevTeam.add(john);

        peopleInChargeDT.add(john);


        //Act
        //Create group
        Group devTeam = Group.createGroupWithMembersAndPersonInCharge(dateOfCreation, denomination, description, membersDevTeam, peopleInChargeDT);


        //Assert
        assertEquals(membersDevTeam, devTeam.getMembers());
    }

    @Test
    @DisplayName("Verify setMembers() of group || Equals")
    public void groupSetMembers() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 05, 22);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();

        String mariaSocialNumber = "123456";
        String joseSocialNumber = "789456";
        String johnSocialNumber = "854125";

        Person maria = Person.createPerson(mariaSocialNumber, "Maria", LocalDate.of(1976, 10, 12));
        Person jose = Person.createPerson(joseSocialNumber, "Jose", LocalDate.of(1979, 11, 3));
        Person john = Person.createPerson(johnSocialNumber, "John", LocalDate.of(1960, 10, 22));

        membersDevTeam.add(maria);
        membersDevTeam.add(jose);
        membersDevTeam.add(john);

        peopleInChargeDT.add(john);


        //Act
        //Create group
        Group devTeam = Group.createGroupWithMembersAndPersonInCharge(dateOfCreation, denomination, description, membersDevTeam, peopleInChargeDT);

        ArrayList<Person> expectedMembersDevTeam = new ArrayList<Person>();
        expectedMembersDevTeam.add(maria);
        expectedMembersDevTeam.add(jose);

        devTeam.setMembers(expectedMembersDevTeam);

        //Assert
        assertEquals(expectedMembersDevTeam, devTeam.getMembers());
    }

    @Test
    @DisplayName("Verify getPeopleInCharge() of group || Equals")
    public void groupGetPeopleInCharge() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 05, 22);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();

        String mariaSocialNumber = "123456";
        String joseSocialNumber = "789456";
        String johnSocialNumber = "854125";

        Person maria = Person.createPerson(mariaSocialNumber, "Maria", LocalDate.of(1976, 10, 12));
        Person jose = Person.createPerson(joseSocialNumber, "Jose", LocalDate.of(1979, 11, 3));
        Person john = Person.createPerson(johnSocialNumber, "John", LocalDate.of(1960, 10, 22));

        membersDevTeam.add(maria);
        membersDevTeam.add(jose);
        membersDevTeam.add(john);

        peopleInChargeDT.add(john);


        //Act
        //Create group
        Group devTeam = Group.createGroupWithMembersAndPersonInCharge(dateOfCreation, denomination, description, membersDevTeam, peopleInChargeDT);

        ArrayList<Person> expectedPeopleInChargeDT = new ArrayList<Person>();
        expectedPeopleInChargeDT.add(john);

        //Assert
        assertEquals(expectedPeopleInChargeDT, devTeam.getPeopleInCharge());

    }

    @Test
    @DisplayName("Verify setPeopleInCharge() of group || Equals")
    public void groupSetPeopleInCharge() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 05, 22);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();

        String mariaSocialNumber = "123456";
        String joseSocialNumber = "789456";
        String johnSocialNumber = "854125";

        Person maria = Person.createPerson(mariaSocialNumber, "Maria", LocalDate.of(1976, 10, 12));
        Person jose = Person.createPerson(joseSocialNumber, "Jose", LocalDate.of(1979, 11, 3));
        Person john = Person.createPerson(johnSocialNumber, "John", LocalDate.of(1960, 10, 22));

        membersDevTeam.add(maria);
        membersDevTeam.add(jose);
        membersDevTeam.add(john);

        peopleInChargeDT.add(john);


        //Act
        //Create group
        Group devTeam = Group.createGroupWithMembersAndPersonInCharge(dateOfCreation, denomination, description, membersDevTeam, peopleInChargeDT);

        ArrayList<Person> expectedPeopleInChargeDT = new ArrayList<Person>();
        expectedPeopleInChargeDT.add(maria);

        devTeam.setPeopleInCharge(expectedPeopleInChargeDT);

        //Assert
        assertEquals(expectedPeopleInChargeDT, devTeam.getPeopleInCharge());


    }

    @Test
    @DisplayName("Verify removePersonFromGroup() of group || personInCharge")
    public void removePeopleInChargeFromGroup() {

        //Arrange
        //Create parameters for Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 05, 22);
        String denomination = "DevTeam Group";
        String description = "Group with devTeam members";
        ArrayList<Person> membersDevTeam = new ArrayList<Person>();
        ArrayList<Person> peopleInChargeDT = new ArrayList<Person>();

        String mariaSocialNumber = "123456";
        String joseSocialNumber = "789456";
        String johnSocialNumber = "854125";

        Person maria = Person.createPerson(mariaSocialNumber, "Maria", LocalDate.of(1976, 10, 12));
        Person jose = Person.createPerson(joseSocialNumber, "Jose", LocalDate.of(1979, 11, 3));
        Person john = Person.createPerson(johnSocialNumber, "John", LocalDate.of(1960, 10, 22));

        membersDevTeam.add(maria);
        membersDevTeam.add(jose);
        membersDevTeam.add(john);

        peopleInChargeDT.add(john);


        //Act
        //Create group
        Group devTeam = Group.createGroupWithMembersAndPersonInCharge(dateOfCreation, denomination, description, membersDevTeam, peopleInChargeDT);
        Throwable thrown = assertThrows(IllegalArgumentException.class, () -> devTeam.removePersonFromGroup(john));

        //Assert
        assertEquals(thrown.getMessage(), "Can't remove. People in charge.");

    }

    @Test
    @DisplayName("Verify checkIfFamily() of group || True (3 members)")
    public void groupCheckIfFamily() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblingsMaria = new ArrayList();


        //create parameters for mother
        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null, null);

        //Create persons
        Person maria = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, father, siblingsMaria, null);


        //Act
        //Create group
        Group familyGroup = Group.createGroupWithoutMembers(LocalDate.of(2020, 06, 9), "Family Group");
        familyGroup.addPersonToGroup(maria);
        familyGroup.addPersonToGroup(mother);
        familyGroup.addPersonToGroup(father);

        boolean family = familyGroup.checkIfFamily(familyGroup);

        //Assert
        assertTrue(familyGroup.checkIfFamily(familyGroup));
    }

    @Test
    @DisplayName("(2) Verify checkIfFamily() of group || False (no Father)")
    public void groupCheckIfFamily2() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblingsMaria = new ArrayList();


        //create parameters for mother
        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null, null);

        //Create persons
        Person maria = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, null, siblingsMaria, null);


        //Act
        //Create group
        Group familyGroup = Group.createGroupWithoutMembers(LocalDate.of(2020, 06, 9), "Family Group");
        familyGroup.addPersonToGroup(maria);
        familyGroup.addPersonToGroup(mother);

        boolean family = familyGroup.checkIfFamily(familyGroup);

        //Assert
        assertFalse(familyGroup.checkIfFamily(familyGroup));
    }

    @Test
    @DisplayName("(3) Verify checkIfFamily() of group || False (no Mother)")
    public void groupCheckIfFamily3() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblingsMaria = new ArrayList();


        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null, null);

        //Create persons
        Person maria = Person.createPersonWSiblings(name, address, birthdate, birthplace, null, father, siblingsMaria, null);


        //Act
        //Create group
        Group familyGroup = Group.createGroupWithoutMembers(LocalDate.of(2020, 06, 9), "Family Group");
        familyGroup.addPersonToGroup(maria);
        familyGroup.addPersonToGroup(father);

        boolean family = familyGroup.checkIfFamily(familyGroup);

        //Assert
        assertFalse(familyGroup.checkIfFamily(familyGroup));
    }

    @Test
    @DisplayName("(4) Verify checkIfFamily() of group || False (4 members)")
    public void groupCheckIfFamily4() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblingsMaria = new ArrayList();

        //create parameters for person
        String nameS = "Sibling";
        LocalDate birthdateS = LocalDate.of(1992, 06, 15);
        String addressS = "7th Street";
        String birthplaceS = "Place were Sibling was born";

        ArrayList<Person> siblingsSibling = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null, null);

        //Create person Maria
        Person maria = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, father, siblingsMaria, null);
        //create Person Sibling
        Person sibling = Person.createPersonWSiblings(nameS, addressS, birthdateS, birthplaceS, null, null, siblingsSibling, null);

        siblingsMaria.add(sibling);
        siblingsSibling.add(maria);

        //Act
        //Create group
        Group familyGroup = Group.createGroupWithoutMembers(LocalDate.of(2020, 06, 9), "Family Group");
        familyGroup.addPersonToGroup(maria);
        familyGroup.addPersonToGroup(mother);
        familyGroup.addPersonToGroup(father);
        familyGroup.addPersonToGroup(sibling);

        boolean family = familyGroup.checkIfFamily(familyGroup);

        //Assert
        assertFalse(familyGroup.checkIfFamily(familyGroup));

    }

}