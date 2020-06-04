package model;

import java.util.ArrayList;
import java.util.Objects;

public class GroupRepository {

    private ArrayList<Group> groupRepository;

    public GroupRepository(ArrayList<Group> groupRepository) {
        this.groupRepository = groupRepository;
    }

    public void addGroupToList(Group group){
        if(!groupRepository.contains(group)){
            groupRepository.add(group);
        }
    }

    public void removeGroupFromList(Group group){
        if(groupRepository.contains(group)){
            groupRepository.remove(group);
        } else{
            System.out.println("--------------------");
            System.out.printf("Can't remove, group does not belong.");
            System.out.println("--------------------");
        }
    }

    public ArrayList<Group> getGroupRepository() {
        return groupRepository;
    }

    public void setGroupRepository(ArrayList<Group> groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GroupRepository)) return false;
        GroupRepository that = (GroupRepository) o;
        return Objects.equals(groupRepository, that.groupRepository);
    }

}
