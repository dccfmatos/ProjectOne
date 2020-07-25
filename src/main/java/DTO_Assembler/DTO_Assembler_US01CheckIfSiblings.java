package DTO_Assembler;

import DTO.DTO_US01CheckIfSiblings;

public class DTO_Assembler_US01CheckIfSiblings {

    //class Assembler creates DTO
    public DTO_US01CheckIfSiblings createDTOFromPrimitiveTypes(String personSocialNumber, String personToAnalyzeSocialNumber) {

        //create DTO from primitive types
        DTO_US01CheckIfSiblings dtoUS01 = new DTO_US01CheckIfSiblings(personSocialNumber, personToAnalyzeSocialNumber);

        //return DTO
        return dtoUS01;
    }
}
