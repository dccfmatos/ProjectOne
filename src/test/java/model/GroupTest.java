package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GroupTest {

    // !!! INCOMPLETE

    @Test
    @DisplayName("Test of Constructor 'Group' --> 1 ")
    public void GroupConstructorTest1() {

        //Arrange
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "Group 1";


        //Act
        Group group1 = new Group(dateOfCreation, denomination);
        Group group2 = new Group(dateOfCreation, denomination);

        //Assert
        assertEquals(group1, group2);
    }

    @Test
    @DisplayName("Test of Constructor 'Group' --> 2 ")
    public void GroupConstructorTest2() {

        //Arrange
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "Group 1";

        LocalDate dateOfCreation2 = LocalDate.of(2020, 01, 26);
        String denomination2 = "Group 2";


        //Act
        Group group1 = new Group(dateOfCreation, denomination);
        Group group2 = new Group(dateOfCreation2, denomination2);

        //Assert
        assertNotEquals(group1, group2);
    }

    @Test
    @DisplayName("Test of Constructor 'Group' (with members) --> 3 ")
    public void GroupConstructorTest3() {

        //Arrange
        //Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "Group 1";
        String description = "Grupo das filhas";
        ArrayList<Person> members = new ArrayList<Person>();
        ArrayList<Person> peopleInCharge = new ArrayList<Person>();

        Person Susana = new Person("Susana", "12-10-1976");
        Person Marisa = new Person("Marisa", "03-11-1979");
        Person Diana = new Person("Diana", "16-09-1992");
        Person Pai = new Person("Pai", "22-10-1960");

        members.add(Susana);
        members.add(Marisa);
        members.add(Diana);
        members.add(Pai);

        peopleInCharge.add(Pai);

        //Group2
        LocalDate dateOfCreation2 = LocalDate.of(2020, 01, 26);
        String denomination2 = "Group 2";
        String description2 = "Grupo M&M";
        ArrayList<Person> members2 = new ArrayList<Person>();
        ArrayList<Person> peopleInCharge2 = new ArrayList<Person>();

        Person Max = new Person("Max", "01/01/2017");
        Person Molly = new Person("Molly", "16-08-2019");
        Person DianaM = new Person("DianaM", "16-09-1992");

        members2.add(Max);
        members2.add(Molly);
        members2.add(DianaM);

        peopleInCharge.add(DianaM);

        //Act
        Group group1 = new Group(dateOfCreation, denomination, description, members, peopleInCharge);
        Group group2 = new Group(dateOfCreation2, denomination2, description2, members2, peopleInCharge2);

        //Assert
        assertNotEquals(group1, group2);
    }


    @Test
    @DisplayName("Test of Remove members from group --> 4 ")
    public void GroupConstructorTest4() {

        //Arrange
        //Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "Group 1";
        String description = "Grupo das filhas";
        ArrayList<Person> members = new ArrayList<Person>();
        ArrayList<Person> membersTest = new ArrayList<Person>();
        ArrayList<Person> peopleInCharge = new ArrayList<Person>();

        Person Susana = new Person("Susana", "12-10-1976");
        Person Marisa = new Person("Marisa", "03-11-1979");
        Person Diana = new Person("Diana", "16-09-1992");
        Person Pai = new Person("Pai", "22-10-1960");

        members.add(Marisa);
        members.add(Diana);
        members.add(Pai);

        membersTest.add(Marisa);
        membersTest.add(Diana);
        membersTest.add(Pai);
        peopleInCharge.add(Diana);


        //Act
        Group group1 = new Group(dateOfCreation, denomination, description, members, peopleInCharge);

        group1.removePersonFromGroup(Pai);


        //Assert
        assertNotEquals(membersTest, group1.getMembers());

    }

    @Test
    @DisplayName("Test of Add person to group --> 5 ")
    public void GroupConstructorTest5() {

        //Arrange
        //Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "Group 1";
        String description = "Grupo das filhas";
        ArrayList<Person> members = new ArrayList<Person>();
        ArrayList<Person> members2 = new ArrayList<Person>();
        ArrayList<Person> peopleInCharge = new ArrayList<Person>();

        Person Susana = new Person("Susana", "12-10-1976");
        Person Marisa = new Person("Marisa", "03-11-1979");
        Person Diana = new Person("Diana", "16-09-1992");
        Person Pai = new Person("Pai", "22-10-1960");

        //Act
        members2.add(Susana);
        members2.add(Marisa);
        members2.add(Diana);
        members2.add(Pai);

        peopleInCharge.add(Pai);

        Group group1 = new Group(dateOfCreation, denomination, description, members, peopleInCharge);

        group1.addPersonToGroup(Susana);
        group1.addPersonToGroup(Marisa);
        group1.addPersonToGroup(Diana);
        group1.addPersonToGroup(Pai);

        //Assert
        //assertEquals(membersTest, group1.getMembers());
        assertEquals(members2, group1.getMembers());
    }

    @Test
    @DisplayName("Test of Constructor 'Group' --> 6 ")
    public void GroupConstructorTest6() {

        //Arrange
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "Group 1";

        //Act
        Group group1 = new Group(dateOfCreation, denomination);

        //Assert
        assertEquals(group1.getDateOfCreation(), dateOfCreation);
        assertEquals(group1.getDenomination(), denomination);
    }

    @Test
    @DisplayName("Test of Constructor 'Group' (with members) --> 7 ")
    public void GroupConstructorTest7() {

        //Arrange
        //Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "Group 1";
        String description = "Grupo das filhas";
        ArrayList<Person> members = new ArrayList<Person>();
        ArrayList<Person> peopleInCharge = new ArrayList<Person>();

        Person Susana = new Person("Susana", "12-10-1976");
        Person Marisa = new Person("Marisa", "03-11-1979");
        Person Diana = new Person("Diana", "16-09-1992");
        Person Pai = new Person("Pai", "22-10-1960");

        members.add(Susana);
        members.add(Marisa);
        members.add(Diana);
        members.add(Pai);

        peopleInCharge.add(Pai);

        //Group2
        LocalDate dateOfCreation2 = LocalDate.of(2020, 01, 26);
        String denomination2 = "Group 2";
        String description2 = "Grupo M&M";
        ArrayList<Person> members2 = new ArrayList<Person>();
        ArrayList<Person> peopleInCharge2 = new ArrayList<Person>();

        Person Max = new Person("Max", "01/01/2017");
        Person Molly = new Person("Molly", "16-08-2019");
        Person DianaM = new Person("DianaM", "16-09-1992");

        members2.add(Max);
        members2.add(Molly);
        members2.add(DianaM);

        peopleInCharge.add(DianaM);

        //Act
        Group group1 = new Group(dateOfCreation, denomination, description, members, peopleInCharge);
        Group group2 = new Group(dateOfCreation2, denomination2, description2, members2, peopleInCharge2);

        //Assert
        assertEquals(group1.getDenomination(), denomination);
        assertEquals(group1.getDateOfCreation(), dateOfCreation);
        assertEquals(group1.getMembers(), members);
        assertEquals(group1.getDescription(), description);
        assertEquals(group1.getPeopleInCharge(), peopleInCharge);
    }

    @Test
    @DisplayName("Test of Constructor 'Group' (with members) --> 8 ")
    public void GroupConstructorTest8() {

        //Arrange
        //Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "Group 1";
        String description = "Grupo das filhas";
        ArrayList<Person> members = new ArrayList<Person>();
        ArrayList<Person> peopleInCharge = new ArrayList<Person>();

        Person Susana = new Person("Susana", "12-10-1976");
        Person Marisa = new Person("Marisa", "03-11-1979");
        Person Diana = new Person("Diana", "16-09-1992");
        Person Pai = new Person("Pai", "22-10-1960");

        members.add(Susana);
        members.add(Marisa);
        members.add(Diana);
        members.add(Pai);

        peopleInCharge.add(Pai);

        //Group2
        LocalDate dateOfCreation2 = LocalDate.of(2020, 01, 26);
        String denomination2 = "Group 2";
        String description2 = "Grupo M&M";
        ArrayList<Person> members2 = new ArrayList<Person>();
        ArrayList<Person> peopleInCharge2 = new ArrayList<Person>();

        Group group2 = new Group(dateOfCreation2, denomination2, description2, members2, peopleInCharge2);

        Person Max = new Person("Max", "01/01/2017");
        Person Molly = new Person("Molly", "16-08-2019");
        Person DianaM = new Person("DianaM", "16-09-1992");

        group2.setDateOfCreation(dateOfCreation);
        group2.setMembers(members);
        group2.setPeopleInCharge(peopleInCharge);
        group2.setDescription(description);
        group2.setDenomination(denomination);

        members2.add(Max);
        members2.add(Molly);
        members2.add(DianaM);

        peopleInCharge.add(DianaM);

        //Act
        Group group1 = new Group(dateOfCreation, denomination, description, members, peopleInCharge);

        //Assert
        assertEquals(group2.getDenomination(), denomination);
        assertEquals(group2.getDateOfCreation(), dateOfCreation);
        assertEquals(group2.getMembers(), members);
        assertEquals(group2.getDescription(), description);
        assertEquals(group2.getPeopleInCharge(), peopleInCharge);
    }

    @Test
    @DisplayName("Test of Remove members from group --> 9 ")
    public void GroupConstructorTest9() {

        //Arrange
        //Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "Group 1";
        String description = "Grupo das filhas";
        ArrayList<Person> members = new ArrayList<Person>();
        ArrayList<Person> membersTest = new ArrayList<Person>();
        ArrayList<Person> peopleInCharge = new ArrayList<Person>();

        Person Susana = new Person("Susana", "12-10-1976");
        Person Marisa = new Person("Marisa", "03-11-1979");
        Person Diana = new Person("Diana", "16-09-1992");
        Person Pai = new Person("Pai", "22-10-1960");

        members.add(Marisa);
        members.add(Diana);
        members.add(Pai);

        membersTest.add(Marisa);
        membersTest.add(Diana);
        membersTest.add(Pai);
        peopleInCharge.add(Diana);


        //Act
        Group group1 = new Group(dateOfCreation, denomination, description, members, peopleInCharge);

        group1.removePersonFromGroup(Diana);


        //Assert
        assertEquals(members, group1.getMembers());

    }

//    @Test
//    @DisplayName("Verify family ")
//    public void GroupCheckIfFamily() {
//
//        //Arrange
//        //Group1
//        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
//        String denomination = "Group 1";
//        String description = "Grupo das filhas";
//        ArrayList<Person> members = new ArrayList<Person>();
//        ArrayList<Person> peopleInCharge = new ArrayList<Person>();
//
//        Person Pai = new Person("Pai", "22-10-1960");
//        Person Mae = new Person("Mae", "18-03-1962");
//        Person Susana = new Person("Susana", "12-10-1976", Mae, Pai);
//        Person Marisa = new Person("Marisa", "03-11-1979", Mae, Pai);
//        Person Diana = new Person("Diana", "16-09-1992", Mae, Pai);
//
//
//        members.add(Susana);
//        members.add(Marisa);
//        members.add(Diana);
//        members.add(Pai);
//        members.add(Mae);
//
//        peopleInCharge.add(Pai);
//
//
//        //Act
//        Group group1 = new Group(dateOfCreation, denomination, description, members, peopleInCharge);
//
//        boolean family = group1.checkIfFamily(group1);
//
//        //Assert
//        assertTrue(family);
//    }


}