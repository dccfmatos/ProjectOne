package DTO_Assembler;

import DTO.DTO_US02CreateGroup;

import java.time.LocalDate;

public class DTO_Assembler_US02CreateGroup {

    public DTO_US02CreateGroup createDTOFromPrimitiveTypes(LocalDate dateOfCreation, String denomination){

        DTO_US02CreateGroup dtoUS02 = new DTO_US02CreateGroup(dateOfCreation, denomination);
        return  dtoUS02;

    }

}
