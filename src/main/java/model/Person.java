package model;

import java.util.ArrayList;
import java.util.Objects;

public class Person {
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String name;
    private String address;
    private String birthdate;
    private String birthplace;
    private String mother;
    private String father;
    private Person fatherP;
    private Person motherP;
    private ArrayList<Person> siblings = new ArrayList<Person>();

    public Person(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public Person(String name, String birthdate, Person motherP, Person fatherP) {
        this.name = name;
        this.birthdate = birthdate;
        this.motherP = motherP;
        this.fatherP = fatherP;

    }

    public Person(String name, String address, String birthdate, String birthplace, String mother, String father, ArrayList<Person>  siblings) {
        this.name = name;
        this.address = address;
        this.birthdate = birthdate;
        this.birthplace = birthplace;
        this.mother = mother;
        this.father = father;
        this.siblings = siblings;
    }

    public String getName() {
        return name;
    }

    public String getmother() {
        return mother;
    }

    public void setmother(String mother) {
        this.mother = mother;
    }

    public String getfather() {
        return father;
    }

    public void setfather(String father) {
        this.father = father;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public ArrayList<Person>  getSiblings() {
        return siblings;
    }

    public void setSiblings(ArrayList<Person> siblings) {
        this.siblings = siblings;
    }

    //TESTED
    public void addSiblings(Person person) {
        if(this != person && !siblings.contains(person)){
            siblings.add(person);
        }
    }


    public boolean checkIfSiblings(Person person){
        if(this.getSiblings().contains(person)){
            return true;
        }
        else return false;
    }


    public boolean checkMother(Person person){
        if(this.mother.equals(person.mother)){
            return true;
        }
        else return false;
    }

    public boolean checkFather(Person person){
        if(this.father.equals(person.father)){
            return true;
        }
        else return false;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(address, person.address) &&
                Objects.equals(birthdate, person.birthdate) &&
                Objects.equals(birthplace, person.birthplace) &&
                Objects.equals(mother, person.mother) &&
                Objects.equals(father, person.father) &&
                Objects.equals(siblings, person.siblings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, birthdate, birthplace, mother, father, siblings);
    }
}
