package ControllersCLI;

import model.Group;
import model.Person;

import java.time.LocalDate;

public class CLI_US03AddPersonToGroup {

    public Group controllersCLI_US03AddPersonToGroup(Person personToAdd, Group groupAddInto) {
        groupAddInto.addPersonToGroup(personToAdd);
        return groupAddInto;
    }
}
