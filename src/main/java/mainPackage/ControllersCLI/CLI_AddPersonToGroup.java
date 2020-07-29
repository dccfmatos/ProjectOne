package mainPackage.ControllersCLI;

import mainPackage.model.Group;
import mainPackage.model.Person;

public class CLI_AddPersonToGroup {

    public Group controllersCLI_AddPersonToGroup(Person personToAdd, Group groupAddInto) {
        groupAddInto.addPersonToGroup(personToAdd);
        return groupAddInto;
    }
}
