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
    private String socialNumber;

    //Constructors
    public static Person createPerson(String socialNumber, String name, LocalDate birthdate) {
        return new Person(socialNumber, name, birthdate);
    }


    private Person(String socialNumber, String name, LocalDate birthdate) {
        if (name == null) {
            throw new IllegalArgumentException("Can't create Person. Invalid name.");
        } else {
            this.name = name;
            this.birthdate = birthdate;
        }
    }

    public static Person createPersonWMotherAndFather(String name, LocalDate birthdate, Person motherP, Person fatherP, String socialNumber) {
        return new Person(name, birthdate, motherP, fatherP, socialNumber);
    }

    private Person(String name, LocalDate birthdate, Person motherP, Person fatherP, String socialNumber) {
        if (name == null) {
            throw new NullPointerException("Can't create Person. Invalid name.");
        } else {
            if (socialNumber == null) {
                throw new NullPointerException("Can't create Person. Invalid SocialNumber.");
            } else {
                this.name = name;
                this.birthdate = birthdate;
                this.motherP = motherP;
                this.fatherP = fatherP;
                this.socialNumber = socialNumber;
            }
        }
    }

    public static Person createPersonWSiblings(String name, String address, LocalDate birthdate, String birthplace, Person motherP, Person fatherP, ArrayList<Person> siblings, String socialNumber) {
        return new Person(name, address, birthdate, birthplace, motherP, fatherP, siblings, socialNumber);
    }

    private Person(String name, String address, LocalDate birthdate, String birthplace, Person motherP, Person fatherP, ArrayList<Person> siblings, String socialNumber) {
        this.name = name;
        this.address = address;
        this.birthdate = birthdate;
        this.birthplace = birthplace;
        this.motherP = motherP;
        this.fatherP = fatherP;
        this.siblings = siblings;
        this.socialNumber = socialNumber;
    }

    //Methods
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


    //Gets
    public String getAddress() {
        return this.address;
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

    public String getSocialNumber() {
        return this.socialNumber;
    }

    public String getBirthplace() {
        return this.birthplace;
    }

    public ArrayList<Person> getSiblings() {
        return siblings;
    }


    //Sets
    public void setSocialNumber(String socialNumber) {
        this.socialNumber = socialNumber;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public void setSiblings(ArrayList<Person> siblings) {
        this.siblings = siblings;
    }

    public ArrayList<Person> addSiblings(Person person) {
        if (this != person && !siblings.contains(person)) {
            siblings.add(person);
        } else {
            throw new IllegalArgumentException("Person is already defined as Sibling.");
        }
        return siblings;
    }

    //Override
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
                Objects.equals(siblings, person.siblings) &&
                Objects.equals(socialNumber, person.socialNumber);
    }
}
