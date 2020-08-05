package mainPackage;

import mainPackage.model.Group;
import mainPackage.model.GroupRepository;
import mainPackage.model.Person;
import mainPackage.model.PersonRepository;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bootstrapping {

    public static void loadData(PersonRepository personRepository, GroupRepository groupRepository) {

        /*
        Person -> Rick (123456789)
          |
          |--Mother ->      Monica
          |--Father ->      Joey
          |--Siblings ->    Will
          |--Accounts ->    Company / Bank Account
          |--Categories ->  Salary
          |--Transactions
                |-> 2020-01-21 / CREDIT / Salary / Company -> Bank Account / 1500
         */

//        Arrange Rick
        String rickName= "Rick";
        String rickAddress= "Third street";
        String rickSocialNumber= "123456789";
        LocalDate rickBirthdate= LocalDate.of(1975,1,15);
        String rickBirthplace= "Far away";

//       Rick Mother - Monica
        String monicaName = "Monica";
        LocalDate monicaBirthdate= LocalDate.of(1945,4,25);
        String monicaSocialNumber= "123026789";
        Person personMonica = Person.createPerson(monicaSocialNumber, monicaName, monicaBirthdate);

//      Add Monica to repository
        personRepository.addPersonToPersonRepository(personMonica);

//       Rick Father
        String joeyName = "Joey";
        LocalDate joeyBirthdate= LocalDate.of(1947,10,21);
        String joeySocialNumber= "123454589";
        Person personJoey = Person.createPerson(joeySocialNumber, joeyName, joeyBirthdate);

//      Add Joey to repository
        personRepository.addPersonToPersonRepository(personJoey);

//        Arrange Will
        String willName= "Will";
        String willAddress= "Second street";
        String willSocialNumber= "987654321";
        LocalDate willBirthdate= LocalDate.of(1978,10,7);
        String willBirthplace= "Far away";
        Person personWill = Person.createPerson(willSocialNumber, willName, willBirthdate);

//      Add Will to repository
        personRepository.addPersonToPersonRepository(personWill);

//        Add siblings to Rick
        ArrayList<Person> rickSiblings = new ArrayList<>();
        rickSiblings.add(personWill);

        Person personRick = Person.createPersonWSiblings(rickName, rickAddress, rickBirthdate, rickBirthplace, personMonica, personJoey, rickSiblings, rickSocialNumber);

//      Add Rick to repository
        personRepository.addPersonToPersonRepository(personRick);


        //Array Of members
        ArrayList<Person> groupMembers = new ArrayList<>();

        ArrayList<Person> groupPIC = new ArrayList<>();

        //Create Group
        Group groupOne = Group.createGroupWithMembersAndPersonInCharge(LocalDate.of(2020, 01, 26), "GroupOne",
                    "first group", groupMembers, groupPIC);

        //Array Of groups
        ArrayList<Group> groupList = new ArrayList<>();

        groupRepository.addGroupToGroupRepository(groupOne);

        groupOne.addPersonToGroup(personRick);
        groupOne.addPersonToGroup(personMonica);

        groupPIC.add(personMonica);

    }

}
