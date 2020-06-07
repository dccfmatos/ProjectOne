package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    // !!! INCOMPLETE

    @Test
    @DisplayName("(1) Verify person constructor && equals")
    public void personConstructorEquals1() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        String birthdate = "15-06-1992";

        //Act
        //Create persons
        Person maria = new Person(name, birthdate);
        Person diana = new Person(name, birthdate);

        //Assert
        //Verify if constructor works fine and if object is the same
        assertEquals(maria, diana);
    }

    @Test
    @DisplayName("(2) Verify person constructor && equals")
    public void personConstructorEquals2() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        String birthdate = "15-06-1992";

        String motherName = "Susan";
        String motherBirthdate = "08-10-1975";

        String fatherName = "Tomas";
        String fatherBirthdate = "17-01-1973";


        //create person mother and father
        Person mother = new Person(motherName, motherBirthdate);
        Person father = new Person(fatherName, fatherBirthdate);


        //Act
        //Create persons
        Person maria = new Person(name, birthdate, mother, father);
        Person diana = new Person(name, birthdate, mother, father);

        //Assert
        //Verify if constructor works fine and if object is the same
        assertEquals(maria, diana);
    }


    @Test
    @DisplayName("(3) Verify person constructor && equals")
    public void personConstructorEquals3() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        String birthdate = "15-06-1992";
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        String motherBirthdate = "08-10-1975";
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = new Person(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        String fatherBirthdate = "17-01-1973";
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = new Person(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        String girlSiblingBirthdate = "08-10-1998";

        //create Person girSibling
        Person girlSibling = new Person(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        String boySiblingBirthdate = "08-10-1989";

        //create Person boySibling
        Person boySibling = new Person(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = new Person(name, address, birthdate, birthplace, mother, father, siblings);
        Person diana = new Person(name, address, birthdate, birthplace, mother, father, siblings);

        //Assert
        //Verify if constructor works fine and if object is the same
        assertEquals(maria, diana);

    }

    @Test
    @DisplayName("Verify getName of Person")
    public void personGetNameEquals() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        String birthdate = "15-06-1992";

        //Act
        //Create persons
        Person maria = new Person(name, birthdate);

        //Assert
        //Verify getter method
        assertEquals(name, maria.getName());
    }

    @Test
    @DisplayName("Verify getBirthdate of Person")
    public void personGetBirthdateEquals() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        String birthdate = "15-06-1992";

        //Act
        //Create persons
        Person maria = new Person(name, birthdate);

        //Assert
        //Verify getter method
        assertEquals(birthdate, maria.getBirthdate());
    }


    @Test
    @DisplayName("Verify getMother of Person")
    public void personGetMotherEquals() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        String birthdate = "15-06-1992";
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        String motherBirthdate = "08-10-1975";
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = new Person(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        String fatherBirthdate = "17-01-1973";
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = new Person(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        String girlSiblingBirthdate = "08-10-1998";

        //create Person girSibling
        Person girlSibling = new Person(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        String boySiblingBirthdate = "08-10-1989";

        //create Person boySibling
        Person boySibling = new Person(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person motherExpected = new Person(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);


        Person maria = new Person(name, address, birthdate, birthplace, mother, father, siblings);



        //Assert
        //Verify getter method
        assertEquals(motherExpected, maria.getMotherP());
    }

    @Test
    @DisplayName("Verify getFather of Person")
    public void personGetFatherEquals() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        String birthdate = "15-06-1992";
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        String motherBirthdate = "08-10-1975";
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = new Person(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        String fatherBirthdate = "17-01-1973";
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = new Person(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        String girlSiblingBirthdate = "08-10-1998";

        //create Person girSibling
        Person girlSibling = new Person(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        String boySiblingBirthdate = "08-10-1989";

        //create Person boySibling
        Person boySibling = new Person(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person fatherExpected = new Person(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        Person maria = new Person(name, address, birthdate, birthplace, mother, father, siblings);


        //Assert
        //Verify getter method
        assertEquals(fatherExpected, maria.getFatherP());
    }

    @Test
    @DisplayName("Verify getBirthplace of Person")
    public void personGetBirthplaceEquals() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        String birthdate = "15-06-1992";
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        String motherBirthdate = "08-10-1975";
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = new Person(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        String fatherBirthdate = "17-01-1973";
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = new Person(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        String girlSiblingBirthdate = "08-10-1998";

        //create Person girSibling
        Person girlSibling = new Person(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        String boySiblingBirthdate = "08-10-1989";

        //create Person boySibling
        Person boySibling = new Person(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = new Person(name, address, birthdate, birthplace, mother, father, siblings);


        //Assert
        //Verify getter method
        assertEquals(birthplace, maria.getBirthplace());
    }

    @Test
    @DisplayName("Verify getSiblings of Person")
    public void personGetSiblingsEquals() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        String birthdate = "15-06-1992";
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        String motherBirthdate = "08-10-1975";
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = new Person(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        String fatherBirthdate = "17-01-1973";
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = new Person(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        String girlSiblingBirthdate = "08-10-1998";

        //create Person girSibling
        Person girlSibling = new Person(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        String boySiblingBirthdate = "08-10-1989";

        //create Person boySibling
        Person boySibling = new Person(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = new Person(name, address, birthdate, birthplace, mother, father, siblings);


        //Assert
        //Verify getter method
        assertEquals(siblings, maria.getSiblings());
    }

    @Test
    @DisplayName("Verify setName of Person")
    public void personSetNameEquals() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        String birthdate = "15-06-1992";

        //Act
        //Create persons
        Person maria = new Person(name, birthdate);
        String newName = "Zoey";
        maria.setName(newName);

        //Assert
        //Verify getter method
        assertEquals(newName, maria.getName());
    }

    @Test
    @DisplayName("Verify setBirthdate of Person")
    public void personSetBirthdateEquals() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        String birthdate = "15-06-1992";

        //Act
        //Create persons
        Person maria = new Person(name, birthdate);

        String expectedBirthdate = "18-06-1992";
        maria.setBirthdate(expectedBirthdate);

        //Assert
        //Verify getter method
        assertEquals(expectedBirthdate, maria.getBirthdate());
    }


    @Test
    @DisplayName("Verify setMother of Person")
    public void personSetMotherEquals() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        String birthdate = "15-06-1992";
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        String motherBirthdate = "08-10-1975";
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = new Person(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        String fatherBirthdate = "17-01-1973";
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = new Person(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        String girlSiblingBirthdate = "08-10-1998";

        //create Person girSibling
        Person girlSibling = new Person(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        String boySiblingBirthdate = "08-10-1989";

        //create Person boySibling
        Person boySibling = new Person(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person motherExpected = new Person("newMother", motherAddress, motherBirthdate, motherBirthplace, null, null, null);


        Person maria = new Person(name, address, birthdate, birthplace, mother, father, siblings);

        maria.setMotherP(motherExpected);


        //Assert
        //Verify getter method
        assertEquals(motherExpected, maria.getMotherP());
    }

    @Test
    @DisplayName("Verify setFather of Person")
    public void personSetFatherEquals() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        String birthdate = "15-06-1992";
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        String motherBirthdate = "08-10-1975";
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = new Person(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        String fatherBirthdate = "17-01-1973";
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = new Person(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        String girlSiblingBirthdate = "08-10-1998";

        //create Person girSibling
        Person girlSibling = new Person(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        String boySiblingBirthdate = "08-10-1989";

        //create Person boySibling
        Person boySibling = new Person(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person fatherExpected = new Person("newFather", fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        Person maria = new Person(name, address, birthdate, birthplace, mother, father, siblings);

        maria.setFatherP(fatherExpected);


        //Assert
        //Verify getter method
        assertEquals(fatherExpected, maria.getFatherP());
    }

    @Test
    @DisplayName("Verify setBirthplace of Person")
    public void personSetBirthplaceEquals() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        String birthdate = "15-06-1992";
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        String motherBirthdate = "08-10-1975";
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = new Person(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        String fatherBirthdate = "17-01-1973";
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = new Person(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        String girlSiblingBirthdate = "08-10-1998";

        //create Person girSibling
        Person girlSibling = new Person(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        String boySiblingBirthdate = "08-10-1989";

        //create Person boySibling
        Person boySibling = new Person(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = new Person(name, address, birthdate, birthplace, mother, father, siblings);
        String expectedBirthplace = "Place were Susan was born";
        maria.setBirthplace(expectedBirthplace);


        //Assert
        //Verify getter method
        assertEquals(expectedBirthplace, maria.getBirthplace());
    }

    @Test
    @DisplayName("Verify setSiblings of Person")
    public void personSetSiblingsEquals() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        String birthdate = "15-06-1992";
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        String motherBirthdate = "08-10-1975";
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = new Person(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        String fatherBirthdate = "17-01-1973";
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = new Person(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        String girlSiblingBirthdate = "08-10-1998";

        //create Person girSibling
        Person girlSibling = new Person(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        String boySiblingBirthdate = "08-10-1989";

        //create Person boySibling
        Person boySibling = new Person(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = new Person(name, address, birthdate, birthplace, mother, father, siblings);

        ArrayList<Person> expectedSiblings = new ArrayList();

        maria.setSiblings(expectedSiblings);


        //Assert
        //Verify getter method
        assertEquals(expectedSiblings, maria.getSiblings());
    }

    @Test
    @DisplayName("Verify getAddress of Person")
    public void personGetAddressEquals() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        String birthdate = "15-06-1992";
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        String motherBirthdate = "08-10-1975";
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = new Person(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        String fatherBirthdate = "17-01-1973";
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = new Person(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        String girlSiblingBirthdate = "08-10-1998";

        //create Person girSibling
        Person girlSibling = new Person(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        String boySiblingBirthdate = "08-10-1989";

        //create Person boySibling
        Person boySibling = new Person(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = new Person(name, address, birthdate, birthplace, mother, father, siblings);


        //Assert
        //Verify getter method
        assertEquals(address, maria.getAddress());
    }

    @Test
    @DisplayName("Verify setAddress of Person")
    public void personSetAddressEquals() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        String birthdate = "15-06-1992";
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        String motherBirthdate = "08-10-1975";
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = new Person(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        String fatherBirthdate = "17-01-1973";
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = new Person(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        String girlSiblingBirthdate = "08-10-1998";

        //create Person girSibling
        Person girlSibling = new Person(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        String boySiblingBirthdate = "08-10-1989";

        //create Person boySibling
        Person boySibling = new Person(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = new Person(name, address, birthdate, birthplace, mother, father, siblings);

        String expectedAddress = "8th Street";
        maria.setAddress(expectedAddress);


        //Assert
        //Verify getter method
        assertEquals(expectedAddress, maria.getAddress());
    }

    @Test
    @DisplayName("Verify addSiblings of Person")
    public void personAddSiblingsEquals() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        String birthdate = "15-06-1992";
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        String motherBirthdate = "08-10-1975";
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = new Person(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        String fatherBirthdate = "17-01-1973";
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = new Person(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        String girlSiblingBirthdate = "08-10-1998";

        //create Person girSibling
        Person girlSibling = new Person(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        String boySiblingBirthdate = "08-10-1989";

        //create Person boySibling
        Person boySibling = new Person(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = new Person(name, address, birthdate, birthplace, mother, father, siblings);

        Person newSibling = new Person("test", "16/07/2002");
        maria.addSiblings(newSibling);

        ArrayList<Person> expectedSiblings = new ArrayList();
        expectedSiblings.add(girlSibling);
        expectedSiblings.add(boySibling);
        expectedSiblings.add(newSibling);

        //Assert
        //Verify getter method
        assertEquals(expectedSiblings, maria.getSiblings());
    }

    @Test
    @DisplayName("Verify checkIfSiblings of Person || true")
    public void checkIfSiblingsTrue() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        String birthdate = "15-06-1992";
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        String motherBirthdate = "08-10-1975";
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = new Person(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        String fatherBirthdate = "17-01-1973";
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = new Person(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        String girlSiblingBirthdate = "08-10-1998";

        //create Person girSibling
        Person girlSibling = new Person(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        String boySiblingBirthdate = "08-10-1989";

        //create Person boySibling
        Person boySibling = new Person(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = new Person(name, address, birthdate, birthplace, mother, father, siblings);



        //Assert
        //Verify getter method
        assertTrue(maria.checkIfSiblings(girlSibling));
    }

    @Test
    @DisplayName("Verify checkIfSiblings of Person || false")
    public void checkIfSiblingsFalse() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        String birthdate = "15-06-1992";
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        String motherBirthdate = "08-10-1975";
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = new Person(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        String fatherBirthdate = "17-01-1973";
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = new Person(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        String girlSiblingBirthdate = "08-10-1998";

        //create Person girSibling
        Person girlSibling = new Person(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        String boySiblingBirthdate = "08-10-1989";

        //create Person boySibling
        Person boySibling = new Person(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = new Person(name, address, birthdate, birthplace, mother, father, siblings);



        //Assert
        //Verify getter method
        assertFalse(maria.checkIfSiblings(father));
    }

    @Test
    @DisplayName("Verify checkMother of Person || true")
    public void checkMotherTrue() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        String birthdate = "15-06-1992";
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        String motherBirthdate = "08-10-1975";
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = new Person(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        String fatherBirthdate = "17-01-1973";
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = new Person(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        String girlSiblingBirthdate = "08-10-1998";

        //create Person girSibling
        Person girlSibling = new Person(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        String boySiblingBirthdate = "08-10-1989";

        //create Person boySibling
        Person boySibling = new Person(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = new Person(name, address, birthdate, birthplace, mother, father, siblings);
        Person anotherPerson = new Person(name, address, birthdate, birthplace, mother, null, siblings);


        //Assert
        //Verify getter method
        assertTrue(maria.checkMother(anotherPerson));
    }

    @Test
    @DisplayName("Verify checkMother of Person || False")
    public void checkMotherFalse() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        String birthdate = "15-06-1992";
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        String motherBirthdate = "08-10-1975";
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = new Person(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        String fatherBirthdate = "17-01-1973";
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = new Person(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        String girlSiblingBirthdate = "08-10-1998";

        //create Person girSibling
        Person girlSibling = new Person(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        String boySiblingBirthdate = "08-10-1989";

        //create Person boySibling
        Person boySibling = new Person(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = new Person(name, address, birthdate, birthplace, mother, father, siblings);
        Person anotherPerson = new Person(name, address, birthdate, birthplace, mother, null, siblings);


        //Assert
        //Verify getter method
        assertFalse(maria.checkMother(father));
    }

    @Test
    @DisplayName("Verify checkFather of Person || true")
    public void checkFatherTrue() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        String birthdate = "15-06-1992";
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        String motherBirthdate = "08-10-1975";
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = new Person(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        String fatherBirthdate = "17-01-1973";
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = new Person(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        String girlSiblingBirthdate = "08-10-1998";

        //create Person girSibling
        Person girlSibling = new Person(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        String boySiblingBirthdate = "08-10-1989";

        //create Person boySibling
        Person boySibling = new Person(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = new Person(name, address, birthdate, birthplace, mother, father, siblings);
        Person anotherPerson = new Person(name, address, birthdate, birthplace, null, father, siblings);


        //Assert
        //Verify getter method
        assertTrue(maria.checkFather(anotherPerson));
    }

    @Test
    @DisplayName("Verify checkFather of Person || False")
    public void checkFatherFalse() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        String birthdate = "15-06-1992";
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        String motherBirthdate = "08-10-1975";
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = new Person(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        String fatherBirthdate = "17-01-1973";
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = new Person(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        String girlSiblingBirthdate = "08-10-1998";

        //create Person girSibling
        Person girlSibling = new Person(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        String boySiblingBirthdate = "08-10-1989";

        //create Person boySibling
        Person boySibling = new Person(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = new Person(name, address, birthdate, birthplace, mother, father, siblings);
        Person anotherPerson = new Person(name, address, birthdate, birthplace, null, father, siblings);


        //Assert
        //Verify getter method
        assertFalse(maria.checkFather(mother));
    }



/*

    @Test
    @DisplayName("Test of Constructor 'Person' --> 4 ")
    public void PersonConstructorTestEquals2() {

        //Arrange
        String name = "Diana";
        String birthdate = "16-09-1992";

        String name2 = "João";
        String birthdate2 = "24-12-1986";


        //Act
        Person person = new Person(name, birthdate);
        Person person2 = new Person(name2, birthdate2);

        //Assert
        assertNotEquals(person, person2);
    }

    @Test
    @DisplayName("Test of Constructor 'Person' (all atributes) AssertEquals --> 6 ")
    public void PersonConstructorTest4() {

        //Arrange
        String name = "Diana";
        String adress = "Morada";
        String birthdate = "16-09-1992";
        String birthplace = "Miragaia";
        String mother = "Maria Antónia";
        String father = "António Fernando";
        Person susana = new Person("Susana", "12-10-1976");
        Person marisa = new Person("Marisa", "03-11-1979");

        ArrayList<Person> siblings = new ArrayList<Person>();

        //Act
        //create person
        Person person = new Person(name, adress, birthdate, birthplace, mother, father, siblings);

        //add siblings to person
        person.addSiblings(susana);
        person.addSiblings(marisa);

        //Assert
        assertEquals(name, person.getName());
        assertEquals(adress, person.getAddress());
        assertEquals(birthdate, person.getBirthdate());
        assertEquals(birthplace, person.getBirthplace());
        assertEquals(mother, person.getmother());
        assertEquals(father, person.getfather());
        assertEquals(siblings, person.getSiblings());
    }


    @Test
    @DisplayName("Test add Siblings -->  7")
    public void PersonConstructorTest5() {

        //Arrange
        String name = "Diana";
        String adress = "Morada";
        String birthdate = "16-09-1992";
        String birthplace = "Miragaia";
        String mother = "Maria Antónia";
        String father = "António Fernando";

        Person susana = new Person("Susana", "12-10-1976");
        Person marisa = new Person("Marisa", "03-11-1979");


        //Act
        //siblings Diana
        ArrayList<Person> siblingsD = new ArrayList<Person>();

        Person personDiana = new Person(name, adress, birthdate, birthplace, mother, father, siblingsD);
        personDiana.addSiblings(susana);
        personDiana.addSiblings(marisa);
        //Assert
        assertEquals(siblingsD, personDiana.getSiblings());
    }

    @Test
    @DisplayName("Test if siblings -->  8")
    public void PersonConstructorTest6(){

        //Arrange
        String name = "Diana";
        String adress = "Morada";
        String birthdate = "16-09-1992";
        String birthplace = "Miragaia";
        String mother = "Maria Antónia";
        String father = "António Fernando";

        Person susana = new Person("Susana", "12-10-1976");

        String nameM = "Marisa";
        String adressM = "Morada";
        String birthdateM = "03-11-1979";
        String birthplaceM = "Massarelos";
        String motherM = "Maria Antónia";
        String fatherM = "António Fernando";


        //Act


        //siblings Diana
        ArrayList<Person> siblingsD = new ArrayList<Person>();
        ArrayList<Person> siblingsM = new ArrayList<Person>();

        Person diana = new Person(name, adress, birthdate, birthplace, mother, father, siblingsD);
        Person marisa = new Person(nameM, adressM, birthdateM, birthplaceM, motherM, fatherM, siblingsM);

        diana.addSiblings(marisa);
        diana.addSiblings(susana);
        marisa.addSiblings(susana);
        marisa.addSiblings(diana);

        //Assert
        boolean result = diana.checkIfSiblings(marisa);
        assertTrue(result);
    }

    @Test
    @DisplayName("Test if siblings -->  9")
    public void PersonConstructorTest7(){

        //Arrange
        String name = "Diana";
        String adress = "Morada";
        String birthdate = "16-09-1992";
        String birthplace = "Miragaia";
        String mother = "Maria Antónia";
        String father = "António Fernando";

        Person susana = new Person("Susana", "12-10-1976");

        String nameM = "Marisa";
        String adressM = "Morada";
        String birthdateM = "03-11-1979";
        String birthplaceM = "Massarelos";
        String motherM = "Maria Antónia";
        String fatherM = "António Fernando";


        //Act

        //siblings Diana
        ArrayList<Person> siblingsD = new ArrayList<Person>();
        ArrayList<Person> siblingsM = new ArrayList<Person>();

        Person diana = new Person(name, adress, birthdate, birthplace, mother, father, siblingsD);
        Person marisa = new Person(nameM, adressM, birthdateM, birthplaceM, motherM, fatherM, siblingsM);

        diana.addSiblings(susana);
        marisa.addSiblings(susana);
        marisa.addSiblings(diana);

        //Assert
        boolean result = diana.checkIfSiblings(marisa);
        assertFalse(result);
    }

    @Test
    @DisplayName("Test if same Mother -->  10")
    public void PersonConstructorTest8(){

        //Arrange
        String name = "Diana";
        String adress = "Morada";
        String birthdate = "16-09-1992";
        String birthplace = "Miragaia";
        String mother = "Maria Antónia";
        String father = "António Fernando";

        ArrayList <Person> siblingsD = new ArrayList<Person>();


        String nameM = "Marisa";
        String adressM = "Morada";
        String birthdateM = "03-11-1979";
        String birthplaceM = "Massarelos";
        String motherM = "Maria Antónia";
        String fatherM = "António Fernando";

        ArrayList <Person> siblingsM = new ArrayList<Person>();



        //Act

        Person diana = new Person(name, adress, birthdate, birthplace, mother, father, siblingsD);
        Person marisa = new Person(nameM, adressM, birthdateM, birthplaceM, motherM, fatherM, siblingsM);

        //Assert
        boolean result = diana.checkMother(marisa);
        assertTrue(result);
    }

    @Test
    @DisplayName("Test if same Mother (false) -->  11")
    public void PersonConstructorTest9(){

        //Arrange
        String name = "Diana";
        String adress = "Morada";
        String birthdate = "16-09-1992";
        String birthplace = "Miragaia";
        String mother = "Maria Antónia";
        String father = "António Fernando";

        ArrayList <Person> siblings = new ArrayList<Person>();

        String nameJ = "João";
        String adressJ = "Morada";
        String birthdateJ = "24-12-1986";
        String birthplaceJ = "Massarelos";
        String motherJ = "Rosa Maria";
        String fatherJ = "Tomás Matos";

        ArrayList <Person> siblingsJ = new ArrayList<Person>();

        //Act

        Person diana = new Person(name, adress, birthdate, birthplace, mother, father, siblings);
        Person joao = new Person(nameJ, adressJ, birthdateJ, birthplaceJ, motherJ, fatherJ, siblingsJ);

        //Assert
        boolean result = diana.checkMother(joao);
        assertFalse(result);
    }
    @Test
    @DisplayName("Test if same Father -->  12")
    public void PersonConstructorTest10(){

        //Arrange
        String name = "Diana";
        String adress = "Morada";
        String birthdate = "16-09-1992";
        String birthplace = "Miragaia";
        String mother = "Maria Antónia";
        String father = "António Fernando";

        ArrayList <Person> siblingsD = new ArrayList<Person>();


        String nameM = "Marisa";
        String adressM = "Morada";
        String birthdateM = "03-11-1979";
        String birthplaceM = "Massarelos";
        String motherM = "Maria Antónia";
        String fatherM = "António Fernando";

        ArrayList <Person> siblingsM = new ArrayList<Person>();



        //Act

        Person diana = new Person(name, adress, birthdate, birthplace, mother, father, siblingsD);
        Person marisa = new Person(nameM, adressM, birthdateM, birthplaceM, motherM, fatherM, siblingsM);

        //Assert
        boolean result = diana.checkFather(marisa);
        assertTrue(result);
    }

    @Test
    @DisplayName("Test if same Father (false) -->  13")
    public void PersonConstructorTest11(){

        //Arrange
        String name = "Diana";
        String adress = "Morada";
        String birthdate = "16-09-1992";
        String birthplace = "Miragaia";
        String mother = "Maria Antónia";
        String father = "António Fernando";

        ArrayList <Person> siblings = new ArrayList<Person>();

        String nameJ = "João";
        String adressJ = "Morada";
        String birthdateJ = "24-12-1986";
        String birthplaceJ = "Massarelos";
        String motherJ = "Rosa Maria";
        String fatherJ = "Tomás Matos";

        ArrayList <Person> siblingsJ = new ArrayList<Person>();

        //Act

        Person diana = new Person(name, adress, birthdate, birthplace, mother, father, siblings);
        Person joao = new Person(nameJ, adressJ, birthdateJ, birthplaceJ, motherJ, fatherJ, siblingsJ);

        //Assert
        boolean result = diana.checkFather(joao);
        assertFalse(result);
    }

    @Test
    @DisplayName("Test if same Mother&Father -->  14")
    public void PersonConstructorTest12(){

        //Arrange
        String name = "Diana";
        String adress = "Morada";
        String birthdate = "16-09-1992";
        String birthplace = "Miragaia";
        String mother = "Maria Antónia";
        String father = "António Fernando";

        ArrayList <Person> siblingsD = new ArrayList<Person>();


        String nameM = "Marisa";
        String adressM = "Morada";
        String birthdateM = "03-11-1979";
        String birthplaceM = "Massarelos";
        String motherM = "Maria Antónia";
        String fatherM = "António Fernando";

        ArrayList <Person> siblingsM = new ArrayList<Person>();

        //Act

        Person diana = new Person(name, adress, birthdate, birthplace, mother, father, siblingsD);
        Person marisa = new Person(nameM, adressM, birthdateM, birthplaceM, motherM, fatherM, siblingsM);

        //Assert
        boolean result = diana.checkFather(marisa)&diana.checkMother(marisa);
        assertTrue(result);
    }

    @Test
    @DisplayName("Test if same Mother&Father (false) -->  15")
    public void PersonConstructorTest13() {

        //Arrange
        String name = "Diana";
        String adress = "Morada";
        String birthdate = "16-09-1992";
        String birthplace = "Miragaia";
        String mother = "Maria Antónia";
        String father = "António Fernando";
        ArrayList<Person> siblings = new ArrayList<Person>();

        String nameJ = "João";
        String adressJ = "Morada";
        String birthdateJ = "24-12-1986";
        String birthplaceJ = "Massarelos";
        String motherJ = "Rosa Maria";
        String fatherJ = "Tomás Matos";
        ArrayList<Person> siblingsJ = new ArrayList<Person>();

        String nameM = "Marisa";
        String adressM = "Morada";
        String birthdateM = "03-11-1979";
        String birthplaceM = "Massarelos";
        String motherM = "Maria Antónia";
        String fatherM = "António Fernando";
        ArrayList<Person> siblingsM = new ArrayList<Person>();

        //Act

        Person diana = new Person(name, adress, birthdate, birthplace, mother, father, siblings);
        Person joao = new Person(nameJ, adressJ, birthdateJ, birthplaceJ, motherJ, fatherJ, siblingsJ);
        Person marisa = new Person(nameM, adressM, birthdateM, birthplaceM, motherM, fatherM, siblingsM);

        //Assert
        boolean result = diana.checkFather(joao) && diana.checkMother(marisa);
        assertFalse(result);

    }

    @Test
    @DisplayName("Test if same Mother&Father (false) -->  16")
    public void PersonConstructorTest14(){

        //Arrange
        String name = "Diana";
        String adress = "Morada";
        String birthdate = "16-09-1992";
        String birthplace = "Miragaia";
        String mother = "Maria Antónia";
        String father = "António Fernando";
        ArrayList <Person> siblings = new ArrayList<Person>();

        String nameM = "Marisa";
        String adressM = "Morada";
        String birthdateM = "03-11-1979";
        String birthplaceM = "Massarelos";
        String motherM = "Maria Antónia";
        String fatherM = "António Fernando";
        ArrayList <Person> siblingsM = new ArrayList<Person>();

        //Act

        Person diana = new Person(name, adress, birthdate, birthplace, mother, father, siblings);
        Person marisa = new Person(nameM, adressM, birthdateM, birthplaceM, motherM, fatherM, siblingsM);

        diana.setName(nameM);
        diana.setAddress(adressM);
        diana.setBirthdate(birthdateM);
        diana.setBirthplace(birthplaceM);
        diana.setfather(fatherM);
        diana.setmother(motherM);
        diana.setSiblings(siblingsM);

        //Assert
        assertEquals(diana.getName(),nameM);
        assertEquals(diana.getBirthdate(), birthdateM);
        assertEquals(diana.getBirthplace(), birthplaceM);
        assertEquals(diana.getAddress(), adressM);
        assertEquals(diana.getfather(), fatherM);
        assertEquals(diana.getmother(), motherM);
        assertEquals(diana.getSiblings(), siblingsM);
    }
*/

}