package model;

import java.util.ArrayList;
import java.util.Objects;

public class PersonRepository {

    private ArrayList<Person> personRepository;
    private int socialNumber;

    public PersonRepository (ArrayList<Person> personRepository) {
        this.personRepository = personRepository;
    }

    public void addPersonToPersonRepository(Person person){
        if(!personRepository.contains(person)){
            personRepository.add(person);
        }
    }

    public Person checkIfPersonExistsInRepository(int socialNumber){
        boolean exists = true;

        for (Person person: personRepository
            ) {
            int i=Integer.parseInt(person.getSocialNumber());
            if (i == socialNumber) {
                return person;
            }
            exists = false;
        }
        return null;
    }

    public void removePersonFromPersonRepository(Person person){
        if(personRepository.contains(person)){
            personRepository.remove(person);
        } else{
            throw new RuntimeException("" +
                    "-------------------------------" +
                    "Can't remove. Person does not belong." +
                    "-------------------------------");
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

