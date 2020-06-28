package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonRepositoryTest {

    @Test
    @DisplayName("Verify PersonRepository constructor && equals")
    public void personRepositoryConstructorEquals() {

        //Arrange
        //Create parameters for personRepository

        //create parameters for object Person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);

        //create object Person
        Person maria = new Person(name, birthdate);

        //create arrayList of persons
        ArrayList<Person> personsList1 = new ArrayList<>();

        //add() person to arraylist personsList1
        personsList1.add(maria);


        //Act
        //create personRepository with the given list
        PersonRepository personRepository = new PersonRepository(personsList1);

        //create arrayList of persons
        ArrayList<Person> personsList2 = new ArrayList<>();

        //add() person to arraylist personsList2
        personsList2.add(maria);

        //create personRepository2 with the given personsList2
        PersonRepository anotherPersonRepository = new PersonRepository(personsList2);


        //Assert
        //Verify if constructor works fine and if object is the same
        assertEquals(personRepository, anotherPersonRepository);
    }


    @Test
    @DisplayName("Verify getPersonRepository() && addPersonToPersonRepository() of personRepository")
    void personRepGetPersonRepAddPerson() {

        //Arrange
        //Create parameters for personRepository

        //create parameters for object Person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);

        //create object Person
        Person maria = new Person(name, birthdate);

        //create arrayList of persons
        ArrayList<Person> personsList1 = new ArrayList<>();


        //Act
        //create personRepository with the given list
        PersonRepository personRepository = new PersonRepository(personsList1);

        //Verify addPersonToPersonRepository
        personRepository.addPersonToPersonRepository(maria);


        //Assert
        //Verify getter method
        assertEquals(personsList1, personRepository.getPersonRepository());
    }

    @Test
    @DisplayName("Verify getPersonRepository() && removePersonFromPersonRepository() of personRepository")
    void personRepGetPersonRepRemovePerson() {

        //Arrange
        //Create parameters for personRepository

        //create parameters for object Person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);

        //create object Person
        Person maria = new Person(name, birthdate);

        //create parameters for object Person
        String name2 = "Oreo";
        LocalDate birthdate2 = LocalDate.of(1992, 06, 18);

        //create another object Person
        Person oreo = new Person(name2, birthdate2);

        //create arrayList of persons
        ArrayList<Person> personsList1 = new ArrayList<>();

        personsList1.add(maria);
        personsList1.add(oreo);


        //Act
        //create personRepository with the given list
        PersonRepository personRepository = new PersonRepository(personsList1);

        //Verify removePersonFromPersonRepository
        personRepository.removePersonFromPersonRepository(oreo);

        ArrayList<Person> expected = new ArrayList<>();
        expected.add(maria);

        //Assert
        //Verify getter method
        assertEquals(expected, personRepository.getPersonRepository());
    }


    @Test
    @DisplayName("Verify setter() && removePersonFromPersonRepository of personRepository")
    void personRepSetRemovePerson() {

        //Arrange
        //Create parameters for personRepository

        //create parameters for object Person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);

        //create object Person
        Person maria = new Person(name, birthdate);

        //create parameters for object Person
        String name2 = "Oreo";
        LocalDate birthdate2 = LocalDate.of(1992, 06, 18);

        //create another object Person
        Person oreo = new Person(name2, birthdate2);

        //create arrayList of persons
        ArrayList<Person> personsList1 = new ArrayList<>();

        personsList1.add(maria);
        personsList1.add(oreo);


        //Act
        //create personRepository with the given list
        PersonRepository personRepository = new PersonRepository(personsList1);

        ArrayList<Person> expected = new ArrayList<>();
        expected.add(maria);

        personRepository.setPersonRepository(expected);

        //Assert
        //Verify getter method
        assertEquals(expected, personRepository.getPersonRepository());
    }

    @Test
    @DisplayName("Verify checkIfPersonExistsInRepository(True) of personRepository")
    void personRepCheckIfPersonExistsInRepositoryTrue() {

        //Arrange
        //Create parameters for personRepository

        //create parameters for object Person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        int mariaSocialNumber = 123456;


        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);

        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);

        Person mother = new Person(motherName, motherBirthdate);
        Person father = new Person(fatherName, fatherBirthdate);

        //create object Person
        Person maria = new Person(name, birthdate, mother, father, mariaSocialNumber);

        //create parameters for object Person
        String name2 = "Oreo";
        LocalDate birthdate2 = LocalDate.of(1992, 06, 18);
        int oreoSocialNumber = 789456;

        //create another object Person
        Person oreo = new Person(name2, birthdate2, mother, father, oreoSocialNumber);

        //create arrayList of persons
        ArrayList<Person> personsList1 = new ArrayList<>();

        personsList1.add(maria);
        personsList1.add(oreo);


        //Act
        //create personRepository with the given list
        PersonRepository personRepository = new PersonRepository(personsList1);

        Person expected = maria;

        //Assert
        //Verify getter method
        assertEquals(expected, personRepository.checkIfPersonExistsInRepository(123456));
    }

    @Test
    @DisplayName("Verify checkIfPersonExistsInRepository(False) of personRepository")
    void personRepCheckIfPersonExistsInRepositoryFalse() {

        //Arrange
        //Create parameters for personRepository

        //create parameters for object Person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        int mariaSocialNumber = 123456;


        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);

        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);

        Person mother = new Person(motherName, motherBirthdate);
        Person father = new Person(fatherName, fatherBirthdate);

        //create object Person
        Person maria = new Person(name, birthdate, mother, father, mariaSocialNumber);

        //create parameters for object Person
        String name2 = "Oreo";
        LocalDate birthdate2 = LocalDate.of(1992, 06, 18);
        int oreoSocialNumber = 789456;

        //create another object Person
        Person oreo = new Person(name2, birthdate2, mother, father, oreoSocialNumber);

        //create arrayList of persons
        ArrayList<Person> personsList1 = new ArrayList<>();

        personsList1.add(oreo);


        //Act
        //create personRepository with the given list
        PersonRepository personRepository = new PersonRepository(personsList1);


        //Assert
        //Verify getter method
        assertEquals(null, personRepository.checkIfPersonExistsInRepository(123456));
    }


    @Test
    @DisplayName("Verify removePersonFromPersonRepository of personRepository")
    void personRepRemovePersonFromPersonRepository() {

        //Arrange
        //Create parameters for personRepository

        //create parameters for object Person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        int mariaSocialNumber = 123456;


        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);

        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);

        Person mother = new Person(motherName, motherBirthdate);
        Person father = new Person(fatherName, fatherBirthdate);

        //create object Person
        Person maria = new Person(name, birthdate, mother, father, mariaSocialNumber);

        //create parameters for object Person
        String name2 = "Oreo";
        LocalDate birthdate2 = LocalDate.of(1992, 06, 18);
        int oreoSocialNumber = 789456;

        //create another object Person
        Person oreo = new Person(name2, birthdate2, mother, father, oreoSocialNumber);

        //create arrayList of persons
        ArrayList<Person> personsList1 = new ArrayList<>();

        personsList1.add(oreo);

        PersonRepository personRepository = new PersonRepository(personsList1);

        //Act
        Throwable thrown = assertThrows(RuntimeException.class, () -> personRepository.removePersonFromPersonRepository(maria));

        //Assert
        assertEquals(thrown.getMessage(), "-------------------------------" +
                "Can't remove. Person does not belong." +
                "-------------------------------");
    }
}
