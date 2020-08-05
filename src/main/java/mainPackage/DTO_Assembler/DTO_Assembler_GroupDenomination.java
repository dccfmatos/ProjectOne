package mainPackage.DTO_Assembler;

import mainPackage.DTO.DTO_GroupDenomination;

public class DTO_Assembler_GroupDenomination {

    //class Assembler creates DTO
    public static DTO_GroupDenomination createDTOFromPrimitiveTypes(String groupDenomination){

        //create DTO from primitive types and return it
        return new DTO_GroupDenomination(groupDenomination);
    }
}
