package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GroupRepositoryTest {


    @Test
    @DisplayName("Verify GroupRepository constructor && equals")
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
    @DisplayName("Verify getGroupRepository() && addGroupToList() of groupRepository")
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
    @DisplayName("Verify getGroupRepository() && removeGroupFromList() of groupRepository")
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
    @DisplayName("Verify setter() && removeGroupFromList() of groupRepository")
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

    /*@Test
    @DisplayName("Verify setter() && removeGroupFromList() of groupRepository with System.out.print")
    void groupRepSetRemoveGroupSOUT() throws Exception {

        //need to throw exception to see the System.out.print defined in method()

        //Arrange
        //Create 2 groups
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "DevTeam Group";

        LocalDate dateOfCreation2 = LocalDate.of(2020, 01, 26);
        String denomination2 = "Consultants Group";

        Group devTeam = new Group(dateOfCreation, denomination);
        Group consultTeam = new Group(dateOfCreation2, denomination2);

        //define groupRepository
        ArrayList<Group> company = new ArrayList<>();
        GroupRepository companyGroupRepository = new GroupRepository(company);

        //Add groups to lists
        companyGroupRepository.addGroupToList(devTeam);
        companyGroupRepository.addGroupToList(consultTeam);


        //Act
        ArrayList<Group> anotherCompany = new ArrayList<>();
        GroupRepository anotherCompanyGroupRep = new GroupRepository(anotherCompany);

        anotherCompanyGroupRep.addGroupToList(devTeam);


        anotherCompanyGroupRepository.removeGroupFromList(consultTeam);


        //Assert
        //redirect output as in:
        // https://limzhenghong.wordpress.com/2015/03/18/junit-with-system-out-println/
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        assertEquals("Can't remove, group does not belong.", os.toString());
    }*/

}