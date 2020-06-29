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
    private int socialNumber;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static Person createPerson(String name, LocalDate birthdate){
        return new Person(name, birthdate);
    }

    private Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public static Person createPersonWMotherAndFather(String name, LocalDate birthdate, Person motherP, Person fatherP, int socialNumber){
        return new Person(name, birthdate, motherP, fatherP, socialNumber);
    }

    private Person(String name, LocalDate birthdate, Person motherP, Person fatherP, int socialNumber) {
        this.name = name;
        this.birthdate = birthdate;
        this.motherP = motherP;
        this.fatherP = fatherP;
        this.socialNumber = socialNumber;
    }

    public static Person createPersonWSiblings(String name, String address, LocalDate birthdate, String birthplace, Person motherP, Person fatherP, ArrayList<Person> siblings){
        return new Person(name, address, birthdate, birthplace, motherP, fatherP, siblings);
    }

    private Person(String name, String address, LocalDate birthdate, String birthplace, Person motherP, Person fatherP, ArrayList<Person> siblings) {
        this.name = name;
        this.address = address;
        this.birthdate = birthdate;
        this.birthplace = birthplace;
        this.motherP = motherP;
        this.fatherP = fatherP;
        this.siblings = siblings;
    }

    public String getName() {
        return this.name;
    }

    public Person getFatherP() {
        return this.fatherP;
    }

    public Person getMotherP() {
        return this.motherP;
    }

    public int getSocialNumber() {
        return this.socialNumber;
    }

    public void setSocialNumber(int socialNumber) {
        this.socialNumber = socialNumber;
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
        return this.birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getBirthplace() {
        return this.birthplace;
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
        return socialNumber == person.socialNumber &&
                Objects.equals(name, person.name) &&
                Objects.equals(address, person.address) &&
                Objects.equals(birthdate, person.birthdate) &&
                Objects.equals(birthplace, person.birthplace) &&
                Objects.equals(fatherP, person.fatherP) &&
                Objects.equals(motherP, person.motherP) &&
                Objects.equals(siblings, person.siblings);
    }

}

