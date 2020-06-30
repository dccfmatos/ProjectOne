package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    @DisplayName("(1) Verify person constructor && equals")
    public void personConstructorEquals1() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);

        //Act
        //Create persons
        Person maria = Person.createPerson(name, birthdate);
        Person diana = Person.createPerson(name, birthdate);

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
        LocalDate birthdate = LocalDate.of(1992, 06, 15);

        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);

        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);


        //create person mother and father
        Person mother = Person.createPerson(motherName, motherBirthdate);
        Person father = Person.createPerson(fatherName, fatherBirthdate);

        String mariaSocialNumber = "123456";


        //Act
        //Create persons
        Person maria = Person.createPersonWMotherAndFather(name, birthdate, mother, father, mariaSocialNumber);
        Person diana = Person.createPersonWMotherAndFather(name, birthdate, mother, father, mariaSocialNumber);

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
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        LocalDate girlSiblingBirthdate = LocalDate.of(1998, 10, 8);

        //create Person girSibling
        Person girlSibling = Person.createPerson(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        LocalDate boySiblingBirthdate = LocalDate.of(1989, 10, 8);

        //create Person boySibling
        Person boySibling = Person.createPerson(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, father, siblings);
        Person diana = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, father, siblings);

        //Assert
        //Verify if constructor works fine and if object is the same
        assertEquals(maria, diana);

    }


    @Test
    @DisplayName("Verify getsocialNumber of Person")
    public void personGetSocialNumber() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);

        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);

        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);


        //create person mother and father
        Person mother = Person.createPerson(motherName, motherBirthdate);
        Person father = Person.createPerson(fatherName, fatherBirthdate);

        String mariaSocialNumber = "123456";


        //Act
        //Create persons
        Person maria = Person.createPersonWMotherAndFather(name, birthdate, mother, father, mariaSocialNumber);

        //Assert
        //Verify if constructor works fine and if object is the same
        assertEquals("123456", maria.getSocialNumber());
    }

    @Test
    @DisplayName("Verify getName of Person")
    public void personGetNameEquals() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);

        //Act
        //Create persons
        Person maria = Person.createPerson(name, birthdate);

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
        LocalDate birthdate = LocalDate.of(1992, 06, 15);

        //Act
        //Create persons
        Person maria = Person.createPerson(name, birthdate);

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
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        LocalDate girlSiblingBirthdate = LocalDate.of(1998, 10, 8);

        //create Person girSibling
        Person girlSibling = Person.createPerson(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        LocalDate boySiblingBirthdate = LocalDate.of(1989, 10, 8);

        //create Person boySibling
        Person boySibling = Person.createPerson(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person motherExpected = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);


        Person maria = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, father, siblings);



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
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        LocalDate girlSiblingBirthdate = LocalDate.of(1998, 10, 8);

        //create Person girSibling
        Person girlSibling = Person.createPerson(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        LocalDate boySiblingBirthdate = LocalDate.of(1989, 10, 8);

        //create Person boySibling
        Person boySibling = Person.createPerson(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person fatherExpected = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        Person maria = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, father, siblings);


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
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        LocalDate girlSiblingBirthdate = LocalDate.of(1998, 10, 8);

        //create Person girSibling
        Person girlSibling = Person.createPerson(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        LocalDate boySiblingBirthdate = LocalDate.of(1989, 10, 8);

        //create Person boySibling
        Person boySibling = Person.createPerson(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, father, siblings);


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
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        LocalDate girlSiblingBirthdate = LocalDate.of(1998, 10, 8);

        //create Person girSibling
        Person girlSibling = Person.createPerson(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        LocalDate boySiblingBirthdate = LocalDate.of(1989, 10, 8);

        //create Person boySibling
        Person boySibling = Person.createPerson(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, father, siblings);


        //Assert
        //Verify getter method
        assertEquals(siblings, maria.getSiblings());
    }


    @Test
    @DisplayName("Verify setsocialNumber of Person")
    public void personSetSocialNumber() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);

        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);

        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);


        //create person mother and father
        Person mother = Person.createPerson(motherName, motherBirthdate);
        Person father = Person.createPerson(fatherName, fatherBirthdate);

        String mariaSocialNumber = "123456";


        //Act
        //Create persons
        Person maria = Person.createPersonWMotherAndFather(name, birthdate, mother, father, mariaSocialNumber);
        maria.setSocialNumber("789456");

        //Assert
        //Verify if constructor works fine and if object is the same
        assertEquals("789456", maria.getSocialNumber());
    }

    @Test
    @DisplayName("Verify setName of Person")
    public void personSetNameEquals() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        //Act
        //Create persons
        Person maria = Person.createPerson(name, birthdate);
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
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        //Act
        //Create persons
        Person maria = Person.createPerson(name, birthdate);

        LocalDate expectedBirthdate = LocalDate.of(1992, 06, 18);
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
        LocalDate birthdate = LocalDate.of(1992, 06, 15);        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        LocalDate girlSiblingBirthdate = LocalDate.of(1998, 10, 8);

        //create Person girSibling
        Person girlSibling = Person.createPerson(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        LocalDate boySiblingBirthdate = LocalDate.of(1989, 10, 8);

        //create Person boySibling
        Person boySibling = Person.createPerson(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person motherExpected = Person.createPersonWSiblings("newMother", motherAddress, motherBirthdate, motherBirthplace, null, null, null);


        Person maria = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, father, siblings);

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
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        LocalDate girlSiblingBirthdate = LocalDate.of(1998, 10, 8);

        //create Person girSibling
        Person girlSibling = Person.createPerson(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        LocalDate boySiblingBirthdate = LocalDate.of(1989, 10, 8);

        //create Person boySibling
        Person boySibling = Person.createPerson(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person fatherExpected = Person.createPersonWSiblings("newFather", fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        Person maria = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, father, siblings);

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
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        LocalDate girlSiblingBirthdate = LocalDate.of(1998, 10, 8);

        //create Person girSibling
        Person girlSibling = Person.createPerson(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        LocalDate boySiblingBirthdate = LocalDate.of(1989, 10, 8);

        //create Person boySibling
        Person boySibling = Person.createPerson(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, father, siblings);
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
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        LocalDate girlSiblingBirthdate = LocalDate.of(1998, 10, 8);

        //create Person girSibling
        Person girlSibling = Person.createPerson(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        LocalDate boySiblingBirthdate = LocalDate.of(1989, 10, 8);

        //create Person boySibling
        Person boySibling = Person.createPerson(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, father, siblings);

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
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        LocalDate girlSiblingBirthdate = LocalDate.of(1998, 10, 8);

        //create Person girSibling
        Person girlSibling = Person.createPerson(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        LocalDate boySiblingBirthdate = LocalDate.of(1989, 10, 8);

        //create Person boySibling
        Person boySibling = Person.createPerson(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, father, siblings);


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
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        LocalDate girlSiblingBirthdate = LocalDate.of(1998, 10, 8);

        //create Person girSibling
        Person girlSibling = Person.createPerson(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        LocalDate boySiblingBirthdate = LocalDate.of(1989, 10, 8);

        //create Person boySibling
        Person boySibling = Person.createPerson(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, father, siblings);

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
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        LocalDate girlSiblingBirthdate = LocalDate.of(1998, 10, 8);

        //create Person girSibling
        Person girlSibling = Person.createPerson(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        LocalDate boySiblingBirthdate = LocalDate.of(1989, 10, 8);

        //create Person boySibling
        Person boySibling = Person.createPerson(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, father, siblings);

        Person newSibling = Person.createPerson("test", LocalDate.of(1995, 8, 7));
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
    @DisplayName("Verify addSiblings of Person | Exception")
    public void personAddSiblingsException() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        LocalDate girlSiblingBirthdate = LocalDate.of(1998, 10, 8);

        //create Person girSibling
        Person girlSibling = Person.createPerson(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        LocalDate boySiblingBirthdate = LocalDate.of(1989, 10, 8);

        //create Person boySibling
        Person boySibling = Person.createPerson(boySiblingName, boySiblingBirthdate);

        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, father, siblings);

        //Act
        Throwable thrown = assertThrows(RuntimeException.class, () -> maria.addSiblings(boySibling));

        //Assert
        assertEquals(thrown.getMessage(), "Person is already defined as Sibling.");
    }


    @Test
    @DisplayName("Verify checkIfSiblings of Person || true")
    public void checkIfSiblingsTrue() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        LocalDate girlSiblingBirthdate = LocalDate.of(1998, 10, 8);

        //create Person girSibling
        Person girlSibling = Person.createPerson(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        LocalDate boySiblingBirthdate = LocalDate.of(1989, 10, 8);

        //create Person boySibling
        Person boySibling = Person.createPerson(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, father, siblings);



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
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        LocalDate girlSiblingBirthdate = LocalDate.of(1998, 10, 8);

        //create Person girSibling
        Person girlSibling = Person.createPerson(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        LocalDate boySiblingBirthdate = LocalDate.of(1989, 10, 8);

        //create Person boySibling
        Person boySibling = Person.createPerson(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, father, siblings);



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
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        LocalDate girlSiblingBirthdate = LocalDate.of(1998, 10, 8);

        //create Person girSibling
        Person girlSibling = Person.createPerson(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        LocalDate boySiblingBirthdate = LocalDate.of(1989, 10, 8);

        //create Person boySibling
        Person boySibling = Person.createPerson(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, father, siblings);
        Person anotherPerson = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, null, siblings);


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
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        LocalDate girlSiblingBirthdate = LocalDate.of(1998, 10, 8);

        //create Person girSibling
        Person girlSibling = Person.createPerson(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        LocalDate boySiblingBirthdate = LocalDate.of(1989, 10, 8);

        //create Person boySibling
        Person boySibling = Person.createPerson(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, father, siblings);
        Person anotherPerson = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, null, siblings);


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
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        LocalDate girlSiblingBirthdate = LocalDate.of(1998, 10, 8);

        //create Person girSibling
        Person girlSibling = Person.createPerson(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        LocalDate boySiblingBirthdate = LocalDate.of(1989, 10, 8);

        //create Person boySibling
        Person boySibling = Person.createPerson(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, father, siblings);
        Person anotherPerson = Person.createPersonWSiblings(name, address, birthdate, birthplace, null, father, siblings);


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
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String address = "7th Street";
        String birthplace = "Place were Maria was born";

        ArrayList<Person> siblings = new ArrayList();

        //create parameters for mother
        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //create parameters for girlSibling
        String girlSiblingName = "Lucy";
        LocalDate girlSiblingBirthdate = LocalDate.of(1998, 10, 8);

        //create Person girSibling
        Person girlSibling = Person.createPerson(girlSiblingName, girlSiblingBirthdate);

        //create parameters for boySibling
        String boySiblingName = "Bob";
        LocalDate boySiblingBirthdate = LocalDate.of(1989, 10, 8);

        //create Person boySibling
        Person boySibling = Person.createPerson(boySiblingName, boySiblingBirthdate);


        siblings.add(girlSibling);
        siblings.add(boySibling);

        //Act
        //Create persons
        Person maria = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, father, siblings);


        //Assert
        //Verify getter method
        assertFalse(maria.checkFather(mother));
    }

    @Test
    @DisplayName("Verify createPersonWMother&Father of Person || Exception SocialNumber")
    public void createPersonWMotherFatherException() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);


        //create parameters for mother
        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);

        //Act
        Throwable thrown = assertThrows(RuntimeException.class, () -> Person.createPersonWMotherAndFather(name, birthdate, mother, father, null));

        //Assert
        assertEquals(thrown.getMessage(), "Can't create Person. Invalid SocialNumber.");
    }

    @Test
    @DisplayName("Verify createPersonWMother&Father of Person || Exception Name")
    public void createPersonWMotherFatherExceptionName() {

        //Arrange
        //create parameters for person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);

        //create parameters for mother
        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherAddress = "7th Street";
        String motherBirthplace = "Place were Susan was born";

        //create Person mother
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null);

        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null);


        //Act
        Throwable thrown = assertThrows(RuntimeException.class, () -> Person.createPersonWMotherAndFather(null, birthdate, mother, father, "123456"));

        //Assert
        assertEquals(thrown.getMessage(), "Can't create Person. Invalid name.");
    }

}