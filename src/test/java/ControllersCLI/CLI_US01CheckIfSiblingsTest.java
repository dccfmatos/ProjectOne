package ControllersCLI;


import model.Person;
import model.PersonRepository;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class CLI_US01CheckIfSiblingsTest {

    @Test
    @DisplayName("Verify controllersCLI_US01CheckIfSiblings || Equals")
    void controllersCLI_US01CheckIfSiblings() {

        //Arrange
        //socialNumbers
        String mariaSocialNumber = "123456";
        String siblingSocialNumber = "789456";
        String motherSocialNumber = "365478";
        String fatherSocialNumber = "159874";


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
        Person mother = Person.createPersonWSiblings(motherName, motherAddress, motherBirthdate, motherBirthplace, null, null, null, motherSocialNumber);

        //create parameters for father
        String fatherName = "Tomas";
        LocalDate fatherBirthdate = LocalDate.of(1973, 1, 17);
        String fatherAddress = "7th Street";
        String fatherBirthplace = "Place were Tomas was born";

        //create Person father
        Person father = Person.createPersonWSiblings(fatherName, fatherAddress, fatherBirthdate, fatherBirthplace, null, null, null, fatherSocialNumber);

        //create parameters for siblings
        String siblingName = "Sibling Girl";
        LocalDate siblingBirthdate = LocalDate.of(1992, 06, 15);
        String siblingAddress = "7th Street";
        String siblingBirthplace = "Place were siblingGirl was born";


        ArrayList<Person> siblings2 = new ArrayList();
        Person siblingGirl = Person.createPersonWSiblings(siblingName, siblingAddress, siblingBirthdate, siblingBirthplace, mother, father, siblings2, siblingSocialNumber);

        Person maria = Person.createPersonWSiblings(name, address, birthdate, birthplace, mother, father, siblings, mariaSocialNumber);
        siblings.add(siblingGirl);
        siblings2.add(maria);

        ArrayList<Person> repository = new ArrayList<Person>();
        repository.add(maria);
        repository.add(siblingGirl);
        repository.add(mother);

        PersonRepository personRepository = PersonRepository.createPersonRepository(repository);


        //Act
        CLI_US01CheckIfSiblings controller = new CLI_US01CheckIfSiblings();

        boolean checkSiblings = controller.controllersCLI_US01CheckIfSiblings(mariaSocialNumber, siblingSocialNumber, personRepository);
        //Assert
        assertTrue(checkSiblings);
    }
}
