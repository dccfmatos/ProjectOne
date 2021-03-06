package model;

import mainPackage.model.Person;
import mainPackage.model.PersonRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonRepositoryTest {

    @Test
    @DisplayName("Verify PersonRepository constructor || Equals")
    public void personRepositoryConstructorEquals() {

        //Arrange
        //Create parameters for personRepository

        //create parameters for object Person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String mariaSocialNumber = "123456";

        //create object Person
        Person maria = Person.createPerson(mariaSocialNumber, name, birthdate);

        //create arrayList of persons
        ArrayList<Person> personsList1 = new ArrayList<>();

        //add() person to arraylist personsList1
        personsList1.add(maria);


        //Act
        //create personRepository with the given list
        PersonRepository personRepository = PersonRepository.createPersonRepository(personsList1);

        //create arrayList of persons
        ArrayList<Person> personsList2 = new ArrayList<>();

        //add() person to arraylist personsList2
        personsList2.add(maria);

        //create personRepository2 with the given personsList2
        PersonRepository anotherPersonRepository = PersonRepository.createPersonRepository(personsList2);


        //Assert
        //Verify if constructor works fine and if object is the same
        assertEquals(personRepository, anotherPersonRepository);
    }

    @Test
    @DisplayName("Verify getPersonRepository() && addPersonToPersonRepository() of personRepository || Equals")
    void personRepGetPersonRepAddPerson() {

        //Arrange
        //Create parameters for personRepository

        //create parameters for object Person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String mariaSocialNumber = "123456";

        //create object Person
        Person maria = Person.createPerson(mariaSocialNumber, name, birthdate);

        //create arrayList of persons
        ArrayList<Person> personsList1 = new ArrayList<>();


        //Act
        //create personRepository with the given list
        PersonRepository personRepository = PersonRepository.createPersonRepository(personsList1);

        //Verify addPersonToPersonRepository
        personRepository.addPersonToPersonRepository(maria);


        //Assert
        //Verify getter method
        assertEquals(personsList1, personRepository.getPersonRepository());
    }

    @Test
    @DisplayName("Verify addPersonToPersonRepository() of personRepository || Null")
    void personRepGetPersonRepAddPersonNull() {

        //Arrange
        //Create parameters for personRepository

        //create parameters for object Person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String mariaSocialNumber = "123456";

        //create object Person
        Person maria = Person.createPerson(mariaSocialNumber, name, birthdate);

        //create arrayList of persons
        ArrayList<Person> personsList1 = new ArrayList<>();


        //Act
        //create personRepository with the given list
        PersonRepository personRepository = PersonRepository.createPersonRepository(personsList1);

        Throwable thrown = assertThrows(RuntimeException.class, () -> personRepository.addPersonToPersonRepository(null));

        //Assert
        assertEquals(thrown.getMessage(), "Person can't be null");
    }

    @Test
    @DisplayName("Verify addPersonToPersonRepository() of personRepository || Already Exists")
    void personRepGetPersonRepAddPersonAExists() {

        //Arrange
        //Create parameters for personRepository

        //create parameters for object Person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String mariaSocialNumber = "123456";

        //create object Person
        Person maria = Person.createPerson(mariaSocialNumber, name, birthdate);

        //create arrayList of persons
        ArrayList<Person> personsList1 = new ArrayList<>();
        personsList1.add(maria);
        //Act
        //create personRepository with the given list
        PersonRepository personRepository = PersonRepository.createPersonRepository(personsList1);

        Throwable thrown = assertThrows(RuntimeException.class, () -> personRepository.addPersonToPersonRepository(maria));

        //Assert
        assertEquals(thrown.getMessage(), "Person already exists in PersonRepository");
    }

    @Test
    @DisplayName("Verify getPersonRepository() && removePersonFromPersonRepository() of personRepository || Equals")
    void personRepGetPersonRepAndRemovePerson() {

        //Arrange
        //Create parameters for personRepository

        //create parameters for object Person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String mariaSocialNumber = "123456";

        //create object Person
        Person maria = Person.createPerson(mariaSocialNumber, name, birthdate);

        //create parameters for object Person
        String name2 = "Oreo";
        LocalDate birthdate2 = LocalDate.of(1992, 06, 18);
        String oreoSocialNumber = "7894648";

        //create another object Person
        Person oreo = Person.createPerson(oreoSocialNumber, name2, birthdate2);

        //create arrayList of persons
        ArrayList<Person> personsList1 = new ArrayList<>();

        personsList1.add(maria);
        personsList1.add(oreo);


        //Act
        //create personRepository with the given list
        PersonRepository personRepository = PersonRepository.createPersonRepository(personsList1);

        //Verify removePersonFromPersonRepository
        personRepository.removePersonFromPersonRepository(oreo);

        ArrayList<Person> expected = new ArrayList<>();
        expected.add(maria);

        //Assert
        //Verify getter method
        assertEquals(expected, personRepository.getPersonRepository());
    }

    @Test
    @DisplayName("Verify setter() && removePersonFromPersonRepository of personRepository || Equals")
    void personRepSetRemovePerson() {

        //Arrange
        //Create parameters for personRepository

        //create parameters for object Person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String mariaSocialNumber = "123456";

        //create object Person
        Person maria = Person.createPerson(mariaSocialNumber, name, birthdate);

        //create parameters for object Person
        String name2 = "Oreo";
        LocalDate birthdate2 = LocalDate.of(1992, 06, 18);
        String oreoSocialNumber = "784687";

        //create another object Person
        Person oreo = Person.createPerson(oreoSocialNumber, name2, birthdate2);

        //create arrayList of persons
        ArrayList<Person> personsList1 = new ArrayList<>();

        personsList1.add(maria);
        personsList1.add(oreo);


        //Act
        //create personRepository with the given list
        PersonRepository personRepository = PersonRepository.createPersonRepository(personsList1);

        ArrayList<Person> expected = new ArrayList<>();
        expected.add(maria);

        personRepository.setPersonRepository(expected);

        //Assert
        //Verify getter method
        assertEquals(expected, personRepository.getPersonRepository());
    }

    @Test
    @DisplayName("Verify checkIfPersonExistsInRepository(True) of personRepository")
    void personRepCheckIfPersonExistsTrue() {

        //Arrange
        //Create parameters for personRepository

        //create parameters for object Person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String mariaSocialNumber = "123456";

        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherSocialNumber = "7894688";

        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherSocialNumber = "1597863";

        Person mother = Person.createPerson(motherSocialNumber, motherName, motherBirthdate);
        Person father = Person.createPerson(fatherSocialNumber, fatherName, fatherBirthdate);

        //create object Person
        Person maria = Person.createPersonWMotherAndFather(name, birthdate, mother, father, mariaSocialNumber);

        //create parameters for object Person
        String name2 = "Oreo";
        LocalDate birthdate2 = LocalDate.of(1992, 06, 18);
        String oreoSocialNumber = "789456";

        //create another object Person
        Person oreo = Person.createPersonWMotherAndFather(name2, birthdate2, mother, father, oreoSocialNumber);

        //create arrayList of persons
        ArrayList<Person> personsList1 = new ArrayList<>();

        personsList1.add(maria);
        personsList1.add(oreo);


        //Act
        //create personRepository with the given list
        PersonRepository personRepository = PersonRepository.createPersonRepository(personsList1);

        Person expected = maria;
        Person marias = personRepository.checkIfPersonExistsInRepository("123456");
        //Assert
        //Verify getter method
        assertEquals(expected,marias);
    }

    @Test
    @DisplayName("Verify checkIfPersonExistsInRepository(False) of personRepository || False")
    void personRepCheckIfPersonExistsFalse() {

        //Arrange
        //Create parameters for personRepository

        //create parameters for object Person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String mariaSocialNumber = "123456";


        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherSocialNumber = "78468";

        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherSocialNumber = "159487";

        Person mother = Person.createPerson(motherSocialNumber, motherName, motherBirthdate);
        Person father = Person.createPerson(fatherSocialNumber, fatherName, fatherBirthdate);

        //create object Person
        Person maria = Person.createPersonWMotherAndFather(name, birthdate, mother, father, mariaSocialNumber);

        //create parameters for object Person
        String name2 = "Oreo";
        LocalDate birthdate2 = LocalDate.of(1992, 06, 18);
        String oreoSocialNumber = "789456";

        //create another object Person
        Person oreo = Person.createPersonWMotherAndFather(name2, birthdate2, mother, father, oreoSocialNumber);

        //create arrayList of persons
        ArrayList<Person> personsList1 = new ArrayList<>();

        personsList1.add(oreo);


        //Act
        //create personRepository with the given list
        PersonRepository personRepository = PersonRepository.createPersonRepository(personsList1);


        //Assert
        //Verify getter method
        assertEquals(null, personRepository.checkIfPersonExistsInRepository("123456"));
    }

    @Test
    @DisplayName("Verify removePersonFromPersonRepository of personRepository || Person does not belong")
    void personRepRemovePersonDontBelong() {

        //Arrange
        //Create parameters for personRepository

        //create parameters for object Person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String mariaSocialNumber = "123456";


        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherSocialNumber = "7833378";

        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherSocialNumber = "1596738";

        Person mother = Person.createPerson(motherSocialNumber, motherName, motherBirthdate);
        Person father = Person.createPerson(fatherSocialNumber, fatherName, fatherBirthdate);

        //create object Person
        Person maria = Person.createPersonWMotherAndFather(name, birthdate, mother, father, mariaSocialNumber);

        //create parameters for object Person
        String name2 = "Oreo";
        LocalDate birthdate2 = LocalDate.of(1992, 06, 18);
        String oreoSocialNumber = "789456";

        //create another object Person
        Person oreo = Person.createPersonWMotherAndFather(name2, birthdate2, mother, father, oreoSocialNumber);

        //create arrayList of persons
        ArrayList<Person> personsList1 = new ArrayList<>();

        personsList1.add(oreo);

        PersonRepository personRepository = PersonRepository.createPersonRepository(personsList1);

        //Act
        Throwable thrown = assertThrows(RuntimeException.class, () -> personRepository.removePersonFromPersonRepository(maria));

        //Assert
        assertEquals(thrown.getMessage(), "Can't remove. Person does not belong.");
    }

    @Test
    @DisplayName("Verify removePersonFromPersonRepository of personRepository || Null")
    void personRepRemovePersonNull() {

        //Arrange
        //Create parameters for personRepository

        //create parameters for object Person
        String name = "Maria";
        LocalDate birthdate = LocalDate.of(1992, 06, 15);
        String mariaSocialNumber = "123456";


        String motherName = "Susan";
        LocalDate motherBirthdate = LocalDate.of(1975, 10, 8);
        String motherSocialNumber = "7849468";

        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherSocialNumber = "1594868";

        Person mother = Person.createPerson(motherSocialNumber, motherName, motherBirthdate);
        Person father = Person.createPerson(fatherSocialNumber, fatherName, fatherBirthdate);

        //create object Person
        Person maria = Person.createPersonWMotherAndFather(name, birthdate, mother, father, mariaSocialNumber);

        //create parameters for object Person
        String name2 = "Oreo";
        LocalDate birthdate2 = LocalDate.of(1992, 06, 18);
        String oreoSocialNumber = "789456";

        //create another object Person
        Person oreo = Person.createPersonWMotherAndFather(name2, birthdate2, mother, father, oreoSocialNumber);

        //create arrayList of persons
        ArrayList<Person> personsList1 = new ArrayList<>();

        personsList1.add(oreo);

        PersonRepository personRepository = PersonRepository.createPersonRepository(personsList1);

        //Act
        Throwable thrown = assertThrows(RuntimeException.class, () -> personRepository.removePersonFromPersonRepository(null));

        //Assert
        assertEquals(thrown.getMessage(), "Person can't be null");
    }
}
