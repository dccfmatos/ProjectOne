package mainPackage.DTO_Assembler;

import mainPackage.DTO.DTO_Group;
import mainPackage.model.Group;
import mainPackage.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;

public class DTO_Assembler_Group {
    public static DTO_Group createDTOFromDomain(Group group){

        return new DTO_Group(group.getDateOfCreation(), group.getDenomination(), group.getDescription(), group.getMembers(), group.getPeopleInCharge());
    }
}
