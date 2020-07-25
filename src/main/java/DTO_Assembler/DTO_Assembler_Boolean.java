package DTO_Assembler;

import DTO.DTO_Boolean;

public class DTO_Assembler_Boolean {
    public static DTO_Boolean createDTOFromPrimitiveTypes(boolean result, String msg){
        return new DTO_Boolean(result,msg);
    }
}
