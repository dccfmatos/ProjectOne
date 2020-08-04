package mainPackage.DTO_Assembler;

import mainPackage.DTO.DTO_Group;

import java.time.LocalDate;

public class DTO_Assembler_Group {
    public static DTO_Group createDTOFromPrimitiveType(LocalDate dateOfCreation, String denomination){

        return new DTO_Group(dateOfCreation, denomination);
    }
}
