package DTO_Assembler;

import DTO.DTO_US01CheckIfSiblings;

public class DTO_Assembler_US01CheckIfSiblings {

    public DTO_US01CheckIfSiblings createDTOFromPrimitiveTypes(String personSocialNumber, String personToAnalyzeSocialNumber) {

        DTO_US01CheckIfSiblings dtoUS01 = new DTO_US01CheckIfSiblings(personSocialNumber, personToAnalyzeSocialNumber);

        return dtoUS01;
    }
}
