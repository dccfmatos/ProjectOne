package mainPackage.DTO;

import mainPackage.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class DTO_Group {

    private LocalDate dateOfCreation;
    private String denomination;
    private String description;
    private ArrayList<Person> members;
    private ArrayList<Person> peopleInCharge;

    public DTO_Group(LocalDate dateOfCreation, String denomination, String description, ArrayList<Person> members, ArrayList<Person> peopleInCharge) {
        this.dateOfCreation = dateOfCreation;
        this.denomination = denomination;
        this.description = description;
        this.members = members;
        this.peopleInCharge = peopleInCharge;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DTO_Group)) return false;
        DTO_Group dto_group = (DTO_Group) o;
        return Objects.equals(dateOfCreation, dto_group.dateOfCreation) &&
                Objects.equals(denomination, dto_group.denomination) &&
                Objects.equals(description, dto_group.description) &&
                Objects.equals(members, dto_group.members) &&
                Objects.equals(peopleInCharge, dto_group.peopleInCharge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfCreation, denomination, description, members, peopleInCharge);
    }
}