package mainPackage.ControllersCLI;

import mainPackage.model.Group;
import mainPackage.model.Person;

public class CLI_US03AddPersonToGroup {

    public Group controllersCLI_US03AddPersonToGroup(Person personToAdd, Group groupAddInto) {
        groupAddInto.addPersonToGroup(personToAdd);
        return groupAddInto;
    }
}
