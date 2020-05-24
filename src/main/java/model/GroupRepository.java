package model;

import java.util.ArrayList;

public class GroupRepository {

    private ArrayList<Group> groupList;

    public GroupRepository(ArrayList<Group> groupList) {
        this.groupList = groupList;
    }

    public void addGroupToList(Group group){
        if(!groupList.contains(group)){
            groupList.add(group);
        }
    }

    public void removeGroupFromList(Group group){
        if(groupList.contains(group)){
            groupList.remove(group);
        } else{
            System.out.println("--------------------");
            System.out.printf("Can't remove, group does not belong.");
            System.out.println("--------------------");
        }
    }

    public ArrayList<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(ArrayList<Group> groupList) {
        this.groupList = groupList;
    }
}
