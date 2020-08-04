package mainPackage.DTO_Assembler;

import mainPackage.DTO.DTO_Boolean;

public class DTO_Assembler_Boolean {
    public static DTO_Boolean createDTOFromPrimitiveTypes(boolean result){

        return new DTO_Boolean(result);
    }
}
