package mainPackage.Services;

import mainPackage.DTO.DTO_Group;
import mainPackage.DTO.DTO_GroupDenomination;
import mainPackage.DTO_Assembler.DTO_Assembler_Group;
import mainPackage.model.Group;
import mainPackage.model.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service_GetGroup {

    @Autowired
    GroupRepository groupRepository;

    //service receives a DTO
    public DTO_Group service_GetGroup(DTO_GroupDenomination dto_groupDenomination){

        //Need to get groupDenomination from DTO received
        String groupDenomination = dto_groupDenomination.getDenomination();

        //Service should return Group as a DTO
        Group groupFromRep = groupRepository.getGroupFromRep(groupDenomination);

        //return DTO_Group
        DTO_Group dto_groupToReturn = DTO_Assembler_Group.createDTOFromDomain(groupFromRep);

        return dto_groupToReturn;
    }
}
