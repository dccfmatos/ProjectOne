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

    @PostMapping("/groups")
    public ResponseEntity<Object> controllersREST_CreateGroup(@RequestBody DTO_CreateGroup groupToCreate) {

        DTO_Assembler_CreateGroup dto_assembler = new DTO_Assembler_CreateGroup();
        DTO_CreateGroup dtoGroupToCreate = dto_assembler.createDTOFromPrimitiveTypes(
                groupToCreate.getDateOfCreation(), groupToCreate.getDenomination());

        //will receive a DTO from service
        DTO_Group dto_group = service_createGroup.controllersCLI_CreateGroup(dtoGroupToCreate);

        return new ResponseEntity<>(dto_group, HttpStatus.CREATED);
    }
}
