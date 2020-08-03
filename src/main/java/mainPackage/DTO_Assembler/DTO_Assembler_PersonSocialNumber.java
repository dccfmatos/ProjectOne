package mainPackage.DTO_Assembler;

import mainPackage.DTO.DTO_PersonSocialNumber;

public class DTO_Assembler_PersonSocialNumber {

    //class Assembler creates DTO
    public DTO_PersonSocialNumber createDTOFromPrimitiveTypes(String personSocialNumber) {

        //create DTO from primitive types
        DTO_PersonSocialNumber dtoGetPerson = new DTO_PersonSocialNumber(personSocialNumber);

        //return DTO
        return dtoGetPerson;
    }
}
