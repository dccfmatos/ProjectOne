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

    //URI for testing in Postman
    @GetMapping("/persons/{personSocialNumber}")

    //API should return a person in a jSON file
    //need to replace variable "{personSocialNumber}" in path, by the needed socialnumber of person
    public ResponseEntity<Object> controllersREST_GetPerson(@PathVariable final String personSocialNumber) {

        //needs to create a DTO to send to service
        DTO_PersonSocialNumber dtoFromPrimitiveTypes = DTO_Assembler_PersonSocialNumber.createDTOFromPrimitiveTypes(personSocialNumber);

        //will receive a DTO from service
        DTO_Person dtoGetPerson = service_getPerson.service_GetPerson(dtoFromPrimitiveTypes);

        //should return an Object of type person
        //shoul return status "ok" is everything's ok
        return new ResponseEntity<>(dtoGetPerson, HttpStatus.OK);
    }


}
