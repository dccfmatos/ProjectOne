package mainPackage.DTO_Assembler;

import mainPackage.DTO.DTO_CreateGroup;

import java.time.LocalDate;

//class Assembler creates DTO
public class DTO_Assembler_CreateGroup {

    public DTO_CreateGroup createDTOFromPrimitiveTypes(LocalDate dateOfCreation, String denomination){

        //create DTO from primitive types
        DTO_CreateGroup dtoCreateGroup = new DTO_CreateGroup(dateOfCreation, denomination);

        //return DTO
        return  dtoCreateGroup;

    }

}
