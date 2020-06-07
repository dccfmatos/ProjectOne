package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonRepositoryTest {

    @Test
    @DisplayName("Verify PersonRepository constructor && equals")
    public void personRepositoryConstructorEquals(){

        //Arrange
        //Create parameters for personRepository

        //create parameters for object Person
        String name = "Maria";
        String birthdate = "15-06-1992";

        //create object Person
        Person maria = new Person(name, birthdate);

        //create arrayList of persons
        ArrayList<Person> personsList1= new ArrayList<>();

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
        String birthdate = "15-06-1992";

        //create object Person
        Person maria = new Person(name, birthdate);

        //create arrayList of persons
        ArrayList<Person> personsList1= new ArrayList<>();


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
        String birthdate = "15-06-1992";

        //create object Person
        Person maria = new Person(name, birthdate);

        //create parameters for object Person
        String name2 = "Oreo";
        String birthdate2 = "18-06-1992";

        //create another object Person
        Person oreo = new Person(name2, birthdate2);

        //create arrayList of persons
        ArrayList<Person> personsList1= new ArrayList<>();

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
        String birthdate = "15-06-1992";

        //create object Person
        Person maria = new Person(name, birthdate);

        //create parameters for object Person
        String name2 = "Oreo";
        String birthdate2 = "18-06-1992";

        //create another object Person
        Person oreo = new Person(name2, birthdate2);

        //create arrayList of persons
        ArrayList<Person> personsList1= new ArrayList<>();

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
}