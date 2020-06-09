package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Person {

    private String name;
    private String address;
    private LocalDate birthdate;
    private String birthplace;
    private Person fatherP;
    private Person motherP;
    private ArrayList<Person> siblings = new ArrayList<Person>();

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public Person(String name, LocalDate birthdate, Person motherP, Person fatherP) {
        this.name = name;
        this.birthdate = birthdate;
        this.motherP = motherP;
        this.fatherP = fatherP;
    }

    public Person(String name, String address, LocalDate birthdate, String birthplace, Person motherP, Person fatherP, ArrayList<Person> siblings) {
        this.name = name;
        this.address = address;
        this.birthdate = birthdate;
        this.birthplace = birthplace;
        this.motherP = motherP;
        this.fatherP = fatherP;
        this.siblings = siblings;
    }
    public String getName() {
        return name;
    }
    public Person getFatherP() {
        return fatherP;
    }

    public Person getMotherP() {
        return motherP;
    }

    public void setFatherP(Person fatherP) {
        this.fatherP = fatherP;
    }

    public void setMotherP(Person motherP) {
        this.motherP = motherP;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public ArrayList<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(ArrayList<Person> siblings) {
        this.siblings = siblings;
    }

    public void addSiblings(Person person) {
        if (this != person && !siblings.contains(person)) {
            siblings.add(person);
        }
    }

    public boolean checkIfSiblings(Person person) {
        if (this.getSiblings().contains(person)) {
            return true;
        } else return false;
    }

    public boolean checkMother(Person person) {
        if (this.motherP.equals(person.motherP)) {
            return true;
        } else return false;
    }

    public boolean checkFather(Person person) {
        if (this.fatherP.equals(person.fatherP)) {
            return true;
        } else return false;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(address, person.address) &&
                Objects.equals(birthdate, person.birthdate) &&
                Objects.equals(birthplace, person.birthplace) &&
                Objects.equals(fatherP, person.fatherP) &&
                Objects.equals(motherP, person.motherP) &&
                Objects.equals(siblings, person.siblings);
    }
}

