package mainPackage.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Objects;

@Repository
public class GroupRepository {

    private ArrayList<Group> groupRepository;

    //Constructors
    public static GroupRepository createGroupRepository (ArrayList<Group> groupRepository){
        return new GroupRepository(groupRepository);
    }

    private GroupRepository(ArrayList<Group> groupRepository) {
        this.groupRepository = groupRepository;
    }

    //Methods
    public ArrayList<Group> addGroupToGroupRepository(Group group){
        if(!groupRepository.contains(group)){
            groupRepository.add(group);
        }
        else{
            throw new IllegalArgumentException("Group already belongs to GroupRepository.");
        }
        return groupRepository;
    }

    public boolean groupDoesBelong(Group group){
        if(groupRepository.contains(group)){
            return true;
        }
        return false;
    }

    public ArrayList<Group> removeGroupFromGroupRepository(Group group) {
        if (groupRepository.contains(group)) {
            groupRepository.remove(group);
        } else {
            throw new IllegalArgumentException("Can't remove, group already belongs to groupRepository");
        }
        return groupRepository;
    }

    //Gets
    public ArrayList<Group> getGroupRepository() {
        return groupRepository;
    }

    //Sets
    public void setGroupRepository(ArrayList<Group> groupRepository) {
        this.groupRepository = groupRepository;
    }

    //Override
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GroupRepository)) return false;
        GroupRepository that = (GroupRepository) o;
        return Objects.equals(groupRepository, that.groupRepository);
    }

}
