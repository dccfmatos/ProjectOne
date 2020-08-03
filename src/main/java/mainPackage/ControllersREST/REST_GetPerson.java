package mainPackage.ControllersREST;


import mainPackage.DTO.DTO_Person;
import mainPackage.DTO.DTO_PersonSocialNumber;
import mainPackage.DTO_Assembler.DTO_Assembler_PersonSocialNumber;
import mainPackage.Services.Service_GetPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class REST_GetPerson {

    @Autowired
    private Service_GetPerson service_getPerson;

    @GetMapping("/persons/{personSocialNumber}")

    //API should return a person in a jSON file
    public ResponseEntity<Object> controllersREST_GetPerson(@PathVariable final String personSocialNumber) {

        //needs to create a DTO to send to service
        DTO_Assembler_PersonSocialNumber dto_Assembler = new DTO_Assembler_PersonSocialNumber();
        DTO_PersonSocialNumber dtoFromPrimitiveTypes = dto_Assembler.createDTOFromPrimitiveTypes(personSocialNumber);

        //will receive a DTO from service
        DTO_Person dtoGetPerson = service_getPerson.service_GetPerson(dtoFromPrimitiveTypes);

        return new ResponseEntity<>(dtoGetPerson, HttpStatus.OK);
    }


}
