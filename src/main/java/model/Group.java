package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Group {

    private LocalDate dateOfCreation;
    private String denomination;
    private String description;
    private ArrayList<Person> members = new ArrayList<Person>();
    private ArrayList<Person> peopleInCharge = new ArrayList<Person>();
    private ArrayList<Transaction> groupRecords = new ArrayList<Transaction>();

    //constructors
    public static Group createGroupWithoutMembers(LocalDate dateOfCreation, String denomination) {
        return new Group(dateOfCreation, denomination);
    }

    private Group(LocalDate dateOfCreation, String denomination) {
        if (denomination == null) {
            throw new NullPointerException("Group not created. Denomination can't be Null");
        } else {
            this.dateOfCreation = dateOfCreation;
            this.denomination = denomination;
        }
    }

    public static Group createGroupWithMembersAndPersonInCharge(LocalDate dateOfCreation, String denomination, String description, ArrayList<Person> members, ArrayList<Person> peopleInCharge){
        return new Group(dateOfCreation, denomination, description, members, peopleInCharge);
    }

    private Group(LocalDate dateOfCreation, String denomination, String description, ArrayList<Person> members, ArrayList<Person> peopleInCharge) {
        if (denomination == null) {
            throw new NullPointerException("Group not created. Denomination can't be Null");
        } else {
            this.dateOfCreation = dateOfCreation;
            this.denomination = denomination;
            this.description = description;
            this.members = members;
            this.peopleInCharge = peopleInCharge;
        }
    }

    //Methods
    public boolean checkIfFamily(Group group) {
        // To be family it must have: father, mother & children => more than 3 person

        //How many members on the group?
        ArrayList<Person> members = new ArrayList<Person>();
        members = this.getMembers();

        int numberOfMembers = members.size();

        ArrayList<Person> membersTemp = new ArrayList<Person>();

        //Method should return a boolean
        boolean family = true;
        boolean isFather, isMother;

        Person father = null;
        Person mother = null;


        //---- Less than 3 is not a family
        if (numberOfMembers < 3) {
            family = false;
        }

        //---- Check mother and father
        //---- Find father
        for (int i = 0; i < members.size(); i++) {
            for (int j = 0; j < members.size(); j++) {
                if ((i != j) && members.get(i).equals(members.get(j).getFatherP())) {
                    if (father == null) {
                        father = members.get(i);
                    } else {
                        family = false;
                    }
                }
            }
        }

        if (father == null) {
            family = false;
        } else {
            for (Person person : members) {
                if (!person.equals(father)) {
                    membersTemp.add(person);
                }
            }
            members = membersTemp;
            membersTemp = new ArrayList<Person>();
        }

        // Find Mother
        for (int i = 0; i < members.size(); i++) {
            for (int j = 0; j < members.size(); j++) {
                if (i != j && members.get(i).equals(members.get(j).getMotherP())) {
                    if (mother == null) {
                        mother = members.get(i);
                    } else {
                        family = false;
                    }
                }
            }
        }
        if (mother == null) {
            family = false;
        } else {
            for (Person person : members) {
                if (!person.equals(mother)) {
                    membersTemp.add(person);
                }
            }
            members = membersTemp;
        }

        // Find Kids
        for (Person person : members) {
            isFather = false;
            isMother = false;
            if (person.getFatherP() != null) {
                isFather = person.getFatherP().equals(father);
            }
            if (person.getMotherP() != null) {
                isMother = person.getMotherP().equals(mother);
            }
            if (!isFather && !isMother) {
                family = false;
            }
        }
        return  family;
    }

        //Add or remove members from group
    public ArrayList<Person> addPersonToGroup(Person person) {
        if(members.contains(person)){
            throw new IllegalArgumentException("Person already belong into Group members.");
            } else {
                members.add(person);
        return members;
     }
    }

    public ArrayList<Person> removePersonFromGroup(Person person) {
        for (Person person2 : peopleInCharge) {
            if (person2.equals(person)) {
                throw new IllegalArgumentException("Can't remove. People in charge.");
            }
            if(members.contains(person)) {
                members.remove(person);
            }
            else{
                throw new IllegalArgumentException("Can't remove. Person does not belong in Group.");
            }
        }
        return members;
    }

    //Gets
    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public String getDenomination() {
        return denomination;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Person> getMembers() {
        return members;
    }

    public ArrayList<Person> getPeopleInCharge() {
        return peopleInCharge;
    }

    //Sets
    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMembers(ArrayList<Person> members) {
        this.members = members;
    }

    public void setPeopleInCharge(ArrayList<Person> peopleInCharge) {
        this.peopleInCharge = peopleInCharge;
    }

    //Override
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        Group group = (Group) o;
        return Objects.equals(dateOfCreation, group.dateOfCreation) &&
                Objects.equals(denomination, group.denomination) &&
                Objects.equals(description, group.description) &&
                Objects.equals(members, group.members) &&
                Objects.equals(peopleInCharge, group.peopleInCharge) &&
                Objects.equals(groupRecords, group.groupRecords);
    }

}






