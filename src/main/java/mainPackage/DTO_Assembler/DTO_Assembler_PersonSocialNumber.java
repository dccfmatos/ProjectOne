package mainPackage.DTO_Assembler;

import mainPackage.DTO.DTO_PersonSocialNumber;

public class DTO_Assembler_PersonSocialNumber {

    //class Assembler creates DTO
    public static DTO_PersonSocialNumber createDTOFromPrimitiveTypes(String personSocialNumber) {

        //create DTO from primitive types and return it
         return new DTO_PersonSocialNumber(personSocialNumber);
    }
}
