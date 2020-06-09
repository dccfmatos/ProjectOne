package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void Main(String[] args) {

        //Arrange
        //Group1
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "Group 1";
        String description = "Group of friends";
        ArrayList<Person> members = new ArrayList<Person>();
        ArrayList<Person> membersTest = new ArrayList<Person>();
        ArrayList<Person> membersTest2 = new ArrayList<Person>();
        ArrayList<Person> peopleInCharge = new ArrayList<Person>();

        Person Manuel = new Person("Manuel",  LocalDate.of(1976, 10, 12));
        Person João = new Person("João",  LocalDate.of(1979, 11, 03));
        Person Diana = new Person("Diana",  LocalDate.of(1992, 01, 26));
        Person Maria = new Person("Maria",  LocalDate.of(1960, 10, 22));

        members.add(Manuel);
        members.add(João);
        members.add(Diana);
        members.add(Maria);

        membersTest.add(João);
        membersTest.add(Diana);
        membersTest.add(Maria);

        membersTest2.add(Manuel);
        membersTest2.add(João);
        membersTest2.add(Diana);
        membersTest2.add(Maria);

        peopleInCharge.add(Maria);


        //Act
        Group group1 = new Group(dateOfCreation, denomination, description, members,peopleInCharge);

        group1.removePersonFromGroup(Maria);

    }

    }