package model;

import mainPackage.model.Group;
import mainPackage.model.GroupRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GroupRepositoryTest {


    @Test
    @DisplayName("Verify GroupRepository constructor ||Equals")
    public void groupRepositoryConstructorEquals(){

        //Arrange
        //Create parameters for groupRepository

            //create parameters for object Group
            LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
            String denomination = "DevTeam Group";

            //create object Group
            Group devTeam = Group.createGroupWithoutMembers(dateOfCreation, denomination);

        //create arrayList of groups
        ArrayList<Group> company = new ArrayList<>();

        //add() group to arraylist list1
        company.add(devTeam);



        //Act
        //create groupRepository with the given list
        GroupRepository companyGroupRepository = GroupRepository.createGroupRepository(company);

        //create arrayList of groups
        ArrayList<Group> anotherCompany = new ArrayList<>();

        //add() group to arraylist list2
        anotherCompany.add(devTeam);

        //create groupRepository2 with the given list2
        GroupRepository anotherCompanyGroupRep = GroupRepository.createGroupRepository(anotherCompany);


        //Assert
        //Verify if constructor works fine and if object is the same
        assertEquals(companyGroupRepository, anotherCompanyGroupRep);
    }


    @Test
    @DisplayName("Verify getGroupRepository() && addGroupToList() of groupRepository || Equals")
    void groupRepGetGroupRepAddGroup() {

        //Arrange
        //create parameters for object Group
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "DevTeam Group";


        //create object Group
        Group devTeam = Group.createGroupWithoutMembers(dateOfCreation, denomination);

        //create arrayList of groups
        ArrayList<Group> company = new ArrayList<>();

        //create groupRepository with the given list
        GroupRepository companyGroupRepository = GroupRepository.createGroupRepository(company);

        //Act
        //verify addGroupToList()
        companyGroupRepository.addGroupToGroupRepository(devTeam);


        //Assert
        //Verify getter method
        assertEquals(company, companyGroupRepository.getGroupRepository());
    }

    @Test
    @DisplayName("Verify addGroupToList() of groupRepository || Exception")
    void groupRepAddGroupException() {

        //Arrange
        //create parameters for object Group
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "DevTeam Group";


        //create object Group
        Group devTeam = Group.createGroupWithoutMembers(dateOfCreation, denomination);

        //create arrayList of groups
        ArrayList<Group> company = new ArrayList<>();

        //create groupRepository with the given list
        GroupRepository companyGroupRepository = GroupRepository.createGroupRepository(company);
        company.add(devTeam);

        //Act
        Throwable thrown = assertThrows(IllegalArgumentException.class, ()
                -> companyGroupRepository.addGroupToGroupRepository(devTeam));

        //Assert
        assertEquals(thrown.getMessage(), "Group already belongs to GroupRepository.");
    }

    @Test
    @DisplayName("Verify removeGroupToList() of groupRepository || Exception")
    void groupRepremoveGroupException() {

        //Arrange
        //create parameters for object Group
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "DevTeam Group";


        //create object Group
        Group devTeam = Group.createGroupWithoutMembers(dateOfCreation, denomination);

        //create arrayList of groups
        ArrayList<Group> company = new ArrayList<>();

        //create groupRepository with the given list
        GroupRepository companyGroupRepository = GroupRepository.createGroupRepository(company);

        //Act
        Throwable thrown = assertThrows(IllegalArgumentException.class, ()
                -> companyGroupRepository.removeGroupFromGroupRepository(devTeam));

        //Assert
        assertEquals(thrown.getMessage(), "Can't remove, group already belongs to groupRepository");
    }

    @Test
    @DisplayName("Verify getGroupRepository() && removeGroupFromList() of groupRepository || Equals")
    void groupRepGetGroupRepRemoveGroup() {

        //Arrange
        //create parameters for object Group
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "DevTeam Group";

        LocalDate dateOfCreation2 = LocalDate.of(2020, 01, 26);
        String denomination2 = "Consultants Group";

        //create objects Group
        Group devTeam = Group.createGroupWithoutMembers(dateOfCreation, denomination);
        Group consultTeam = Group.createGroupWithoutMembers(dateOfCreation2, denomination2);


        //create arrayList of groups
        ArrayList<Group> company = new ArrayList<>();

        //create groupRepository with the given list
        GroupRepository companyGroupRepository = GroupRepository.createGroupRepository(company);

        companyGroupRepository.addGroupToGroupRepository(devTeam);
        companyGroupRepository.addGroupToGroupRepository(consultTeam);

        //Act
        //remove group from groupRepository
        companyGroupRepository.removeGroupFromGroupRepository(consultTeam);
        ArrayList<Group> expected = new ArrayList<>();
        expected.add(devTeam);


        //Assert
        //Verify removeGroupFromGroupRep()
        assertEquals(expected, companyGroupRepository.getGroupRepository());
    }


    @Test
    @DisplayName("Verify setter() && removeGroupFromList() of groupRepository || Equals")
    void groupRepSetRemoveGroup() {

        //Arrange
        //Create 2 groups
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "DevTeam Group";

        LocalDate dateOfCreation2 = LocalDate.of(2020, 01, 26);
        String denomination2 = "Consultants Group";

        Group devTeam = Group.createGroupWithoutMembers(dateOfCreation, denomination);
        Group consultTeam = Group.createGroupWithoutMembers(dateOfCreation2, denomination2);

        //define groupRepository
        ArrayList<Group> company = new ArrayList<>();
        GroupRepository companyGroupRepository = GroupRepository.createGroupRepository(company);

        //Add groups to lists
        companyGroupRepository.addGroupToGroupRepository(devTeam);
        companyGroupRepository.addGroupToGroupRepository(consultTeam);

        companyGroupRepository.removeGroupFromGroupRepository(consultTeam);

        //Act
        ArrayList<Group> anotherCompany = new ArrayList<>();
        GroupRepository anotherCompanyGroupRep = GroupRepository.createGroupRepository(company);
        anotherCompanyGroupRep.setGroupRepository(anotherCompany);

        anotherCompanyGroupRep.addGroupToGroupRepository(devTeam);

        assertEquals(anotherCompanyGroupRep.getGroupRepository(), companyGroupRepository.getGroupRepository());
    }

}