package mainPackage.Services;

import mainPackage.DTO.DTO_Group;
import mainPackage.DTO.DTO_CreateGroup;
import mainPackage.DTO_Assembler.DTO_Assembler_Group;
import mainPackage.model.Group;
import mainPackage.model.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service_CreateGroup {

    //Dependency injection
    @Autowired
    GroupRepository groupRepository;

    public DTO_Group service_CreateGroup(DTO_CreateGroup dtoGroupToCreate) {

        //create group with info from the DTO
        Group group = Group.createGroupWithoutMembers(dtoGroupToCreate.getDateOfCreation(), dtoGroupToCreate.getDenomination());
        groupRepository.addGroupToGroupRepository(group);

        //result
        DTO_Group dtoGroupCreated = DTO_Assembler_Group.createDTOFromPrimitiveType(dtoGroupToCreate.getDateOfCreation(), dtoGroupToCreate.getDenomination());

        //return a DTO, needed a Group DTO type (DTO_Group)
        return dtoGroupCreated;
    }
}
