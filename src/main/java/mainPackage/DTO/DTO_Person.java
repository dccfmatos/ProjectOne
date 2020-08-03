package mainPackage.DTO;

import mainPackage.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class DTO_Person {
    
    private String name;
    private String address;
    private LocalDate birthdate;
    private String birthplace;
    private Person fatherP;
    private Person motherP;
    private ArrayList<Person> siblings = new ArrayList<Person>();
    private String socialNumber;

    public DTO_Person(String name, String address, LocalDate birthdate, String birthplace, Person motherP, Person fatherP, ArrayList<Person> siblings, String socialNumber) {
        this.name = name;
        this.address = address;
        this.birthdate = birthdate;
        this.birthplace = birthplace;
        this.motherP = motherP;
        this.fatherP = fatherP;
        this.siblings = siblings;
        this.socialNumber = socialNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public Person getFatherP() {
        return fatherP;
    }

    public Person getMotherP() {
        return motherP;
    }

    public ArrayList<Person> getSiblings() {
        return siblings;
    }

    public String getSocialNumber() {
        return socialNumber;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public void setFatherP(Person fatherP) {
        this.fatherP = fatherP;
    }

    public void setMotherP(Person motherP) {
        this.motherP = motherP;
    }

    public void setSiblings(ArrayList<Person> siblings) {
        this.siblings = siblings;
    }

    public void setSocialNumber(String socialNumber) {
        this.socialNumber = socialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DTO_Person)) return false;
        DTO_Person that = (DTO_Person) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(address, that.address) &&
                Objects.equals(birthdate, that.birthdate) &&
                Objects.equals(birthplace, that.birthplace) &&
                Objects.equals(fatherP, that.fatherP) &&
                Objects.equals(motherP, that.motherP) &&
                Objects.equals(siblings, that.siblings) &&
                Objects.equals(socialNumber, that.socialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, birthdate, birthplace, fatherP, motherP, siblings, socialNumber);
    }
}
