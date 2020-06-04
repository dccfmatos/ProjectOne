package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    // !!! INCOMPLETE

    @Test
    @DisplayName("Test of Equals --> 1 ")
    public void PersonConstructorTestEquals1() {

        //Arrange
        String name = "Diana";
        String birthdate = "16-09-1992";

        //Act
        Person person = new Person(name, birthdate);
        Person person2 = new Person(name, birthdate);

        //Assert
        assertEquals(person, person2);
    }

    @Test
    @DisplayName("Test of Constructor 'Person' (2 parameters) Equals --> 2 ")
    public void PersonConstructorTest1() {

        //Arrange
        String name = "Diana";
        String birthdate = "16-09-1992";

        //Act
        Person person = new Person(name, birthdate);

        //Assert
        assertEquals(name, person.getName());
        assertEquals(birthdate, person.getBirthdate());
    }

    @Test
    @DisplayName("Test of Constructor 'Person' (2 parameters) NotEquals --> 3 ")
    public void PersonConstructorTest2() {

        //Arrange
        String name = "Diana";
        String birthdate = "16-09-1992";

        //Act
        Person person = new Person(name, birthdate);
        String expectedName = "João";
        String expectedBirthdate = "24-12-1986";

        //Assert
        assertNotEquals(expectedName, person.getName());
        assertNotEquals(expectedBirthdate, person.getBirthdate());
    }


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
    @DisplayName("Test of Constructor 'Person' (all atributes) --> 5 ")
    public void PersonConstructorTest3() {

        //Arrange
        String name = "Diana";
        String birthdate = "16-09-1992";
        String adress = "Morada";
        String birthplace = "Miragaia";
        String mother = "Maria Antónia";
        String father = "António Fernando";

        //create susana and marisa to add siblings
        Person susana = new Person("Susana", "12-10-1976");
        Person marisa = new Person("Marisa", "03-11-1979");

        ArrayList<Person> siblings = new ArrayList<Person>();


        //Act
        Person person = new Person(name, adress, birthdate, birthplace, mother, father, siblings);
        Person person2 = new Person(name, adress, birthdate, birthplace, mother, father, siblings);

        //add siblings to person
        person.addSiblings(susana);
        person.addSiblings(marisa);

        //Assert
        assertEquals(person, person2);
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

}