package mainPackage.Services;

import mainPackage.DTO.DTO_Person;
import mainPackage.DTO.DTO_PersonSocialNumber;
import mainPackage.DTO_Assembler.DTO_Assembler_Person;
import mainPackage.model.Person;
import mainPackage.model.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service_GetPerson {

    @Autowired
    PersonRepository personRepository;

    //service receives a DTO
    public DTO_Person service_GetPerson(DTO_PersonSocialNumber dto_PersonSocialNumber) {

        //Need to get socialNumber from DTO
        String personSocialNumber = dto_PersonSocialNumber.getPersonSocialNumber();

        //Service should return Person as a DTO
        Person personFromRep = personRepository.getPersonFromRep(personSocialNumber);

        //Create DTO to return
       /*
//        DTO_Person dto_personToReturn = DTO_Assembler_Person.createDTOFromDomain(personFromRep.getName(), personFromRep.getAddress(),
//                personFromRep.getBirthdate(), personFromRep.getBirthplace(),personFromRep.getMotherP(),
//                personFromRep.getFatherP(), personFromRep.getSiblings(), personFromRep.getSocialNumber());
*/
        DTO_Person dto_personToReturn = DTO_Assembler_Person.createDTOFromDomain(personFromRep);

        //return DTO_Person (is info does not exist in some of the fields, it will be "null"
        return dto_personToReturn;
    }
}

