package mainPackage.ControllersREST;

import mainPackage.DTO.DTO_Group;
import mainPackage.DTO.DTO_GroupDenomination;
import mainPackage.DTO_Assembler.DTO_Assembler_Group;
import mainPackage.DTO_Assembler.DTO_Assembler_GroupDenomination;
import mainPackage.Services.Service_GetGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class REST_GetGroup {

    @Autowired
    private Service_GetGroup service_getGroup;

    //URI for testing in Postman
    @GetMapping("/groups/{groupDenomination}")

    //API should return a group in a jSON file
    //need to replace variable "{groupDenomination}" in path, by the needed groupDenomination of group
    public ResponseEntity<Object> controllersREST_GetGroup(@PathVariable final String groupDenomination) {

        //needs to create a DTO from primitive types to send to service
        DTO_GroupDenomination dtoFromPrimitiveTypes = DTO_Assembler_GroupDenomination.createDTOFromPrimitiveTypes(groupDenomination);

        //will receive a DTO from service
        DTO_Group dtoGetGroup = service_getGroup.service_GetGroup(dtoFromPrimitiveTypes);

        return new ResponseEntity<>(dtoGetGroup, HttpStatus.OK);
    }

}
