package mainPackage.DTO_Assembler;

import mainPackage.DTO.DTO_CreateGroup;

import java.time.LocalDate;

//class Assembler creates DTO
public class DTO_Assembler_CreateGroup {
    public static DTO_CreateGroup createDTOFromPrimitiveTypes(LocalDate dateOfCreation, String denomination){

        return new DTO_CreateGroup(dateOfCreation, denomination);
    }
}
