package model;

import java.util.ArrayList;
import java.util.Objects;

public class PersonRepository {

    private ArrayList<Person> personRepository;

    public PersonRepository (ArrayList<Person> personRepository) {
        this.personRepository = personRepository;
    }

    public void addPersonToPersonRepository(Person person){
        if(!personRepository.contains(person)){
            personRepository.add(person);
        }
    }

    public void removePersonFromPersonRepository(Person person){
        if(personRepository.contains(person)){
            personRepository.remove(person);
        } else{
            System.out.println("--------------------");
            System.out.printf("Can't remove, person does not belong.");
            System.out.println("--------------------");
        }
    }

    public ArrayList<Person> getPersonRepository() {
        return personRepository;
    }

    public void setPersonRepository(ArrayList<Person> personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonRepository)) return false;
        PersonRepository that = (PersonRepository) o;
        return Objects.equals(personRepository, that.personRepository);
    }
}

