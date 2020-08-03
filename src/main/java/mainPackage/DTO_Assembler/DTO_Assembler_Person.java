package mainPackage.DTO_Assembler;

import mainPackage.DTO.DTO_Person;
import mainPackage.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;

public class DTO_Assembler_Person {
    public static DTO_Person createDTOFromDomain(Person person){

        return new DTO_Person(person.getName(), person.getAddress(), person.getBirthdate(), person.getBirthplace(),
                person.getMotherP(), person.getFatherP(), person.getSiblings(), person.getSocialNumber());
    }
}
