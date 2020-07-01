package model;

import java.util.ArrayList;
import java.util.Objects;

public class PersonRepository {

    private ArrayList<Person> personRepository;
    private int socialNumber;

    //Constructors
    public static PersonRepository createPersonRepository(ArrayList<Person> personRepository){
        return new PersonRepository(personRepository);
    }

    private PersonRepository (ArrayList<Person> personRepository) {
        this.personRepository = personRepository;
    }

    //Methods
    public Person addPersonToPersonRepository(Person person) {
        if (person == null) {
            throw new NullPointerException("Person can't be null");
        } else {
            if (personRepository.contains(person)) {
                throw new IllegalArgumentException("Person already exists in PersonRepository");
            } else {
                personRepository.add(person);
            }
            return person;
        }
    }

    public Person checkIfPersonExistsInRepository(String socialNumber) {
        for (Person person : personRepository) {
            String a = person.getSocialNumber();
            if (person.getSocialNumber().equals(socialNumber)) {
                return person;
            }
        }
        return null;
    }

    public Person removePersonFromPersonRepository(Person person){
        if (person == null) {
            throw new NullPointerException("Person can't be null");
        } else {
            if(personRepository.contains(person)){
                personRepository.remove(person);
            } else{
                throw new RuntimeException("Can't remove. Person does not belong.");
            }
        }
        return person;
    }

    //Gets
    public ArrayList<Person> getPersonRepository() {
        return personRepository;
    }

    //Sets
    public void setPersonRepository(ArrayList<Person> personRepository) {
        this.personRepository = personRepository;
    }

    //Override
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonRepository)) return false;
        PersonRepository that = (PersonRepository) o;
        return Objects.equals(personRepository, that.personRepository);
    }
}

