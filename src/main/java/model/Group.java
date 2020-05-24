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


    public Group(LocalDate dateOfCreation, String denomination) {
        this.dateOfCreation = dateOfCreation;
        this.denomination = denomination;
    }

    public Group(LocalDate dateOfCreation, String denomination, String description, ArrayList<Person> members, ArrayList<Person> peopleInCharge) {
        this.dateOfCreation = dateOfCreation;
        this.denomination = denomination;
        this.description = description;
        this.members = members;
        this.peopleInCharge = peopleInCharge;
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Person> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Person> members) {
        this.members = members;
    }

    public ArrayList<Person> getPeopleInCharge() {
        return peopleInCharge;
    }

    public void setPeopleInCharge(ArrayList<Person> peopleInCharge) {
        this.peopleInCharge = peopleInCharge;
    }



    //Add or remove members from group
    public void addPersonToGroup(Person person) {
        members.add(person);
    }

    public void removePersonFromGroup(Person person) {
        for (Person person2 : peopleInCharge) {
            if (person2.equals(person)) {

                System.out.println("-------------------------------");
                System.out.println("Can't remove. People in charge.");
                System.out.println("-------------------------------");
            }
            members.remove(person);
        }
    }

    public boolean checkIfFamily(Group group) {
        // To be family it must have: father, mother & children => more than 3 person

        //How many members on the group?

        ArrayList<Person> members = new ArrayList<Person>();
        members = this.getMembers();

        int numberOfMembers = members.size();

        //Method should return a boolean
        boolean family = true;


        // Less than 3 is not a family
        if (numberOfMembers < 3) {
            family = false;
        }

        // Who is mother?
        for (Person person : this.getMembers()) {

            if (person.checkMother(person) == true) {
                continue;
            } else {
                family = false;
            }
            if (person.checkFather(person) == true) {
                family = true;
            } else {
                family = false;
            }
        }return family;
    }

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






