package mainPackage.ControllersREST;

import mainPackage.DTO.DTO_CreateGroup;
import mainPackage.DTO.DTO_Group;
import mainPackage.DTO_Assembler.DTO_Assembler_CreateGroup;
import mainPackage.Services.Service_CreateGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class REST_CreateGroup {

    @Autowired
    private Service_CreateGroup service_createGroup;

    //URI for testing in Postman
    @PostMapping("/groups")

    //RequestBody needed to create group to pass to service
    //API should return a group in a jSON file
    public ResponseEntity<Object> controllersREST_CreateGroup(@RequestBody DTO_CreateGroup groupToCreate) {

        //DTO used to send info to service
        DTO_CreateGroup dtoGroupToCreate = DTO_Assembler_CreateGroup.createDTOFromPrimitiveTypes(
                groupToCreate.getDateOfCreation(), groupToCreate.getDenomination());

        //will receive a DTO from service
        DTO_Group dto_group = service_createGroup.service_CreateGroup(dtoGroupToCreate);

        //should return an Object of type group by DTO_Group
        //Status should return "created" if everything's fine
        return new ResponseEntity<>(dto_group, HttpStatus.CREATED);
    }
}
