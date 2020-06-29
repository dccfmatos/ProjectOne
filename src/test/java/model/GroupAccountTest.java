package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class GroupAccountTest {

    @Test
    @DisplayName("Verify GroupAccount constructor && equals")
    public void groupAccountConstructorEquals() {

        // Arrange
        //Create string for group denomination and description to be used to create GroupAccount
        String accountGroupDenomination = "DevTeam";
        String accountGroupDescription = "Account for members of DevTeam";

        // Act
        //create 2 objects groupAccount
        GroupAccount devTeam = new GroupAccount(accountGroupDenomination, accountGroupDescription);
        GroupAccount devTeam2 = new GroupAccount("DevTeam", "Account for members of DevTeam");

        // Assert
        //Verify if constructor works fine and if object is the same
        assertEquals(devTeam, devTeam2);
    }

    @Test
    @DisplayName("Verify GroupAccount constructor (and group) && equals")
    public void groupAccountConstructorEqualsWGroup() {

        // Arrange
        String accountGroupDenomination = "DevTeam";
        String accountGroupDescription = "Account for members of DevTeam";
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "DevTeam";

        Group devTeamGroup = Group.createGroupWithoutMembers(dateOfCreation, denomination);
        Group devTeamGroup2 = Group.createGroupWithoutMembers(LocalDate.of(2020, 01, 26), denomination);

        // Act
        //create 2 objects groupAccount
        GroupAccount devTeam = new GroupAccount(accountGroupDenomination, accountGroupDescription, devTeamGroup);
        GroupAccount devTeam2 = new GroupAccount("DevTeam", "Account for members of DevTeam", devTeamGroup);

        // Assert
        //Verify if constructor works fine and if object is the same
        assertEquals(devTeam, devTeam2 );
    }


    @Test
    @DisplayName("Verify getAccountGroupDenomination() of GroupAccount")
    public void groupAccountGetGroupAccountDenomination() {

        //Arrange
        String accountGroupDenomination = "DevTeam";
        String accountGroupDescription = "Account for members of DevTeam";

        //Act
        //create object groupAccount
        GroupAccount devTeam = new GroupAccount(accountGroupDenomination, accountGroupDescription);

        //Assert
        //Verify getter method
        assertEquals(accountGroupDenomination, devTeam.getAccountGroupDenomination());
    }

    @Test
    @DisplayName("Verify getAccountGroupDescription() of GroupAccount")
    public void groupAccountGetGroupAccountDescription() {

        //Arrange
        String accountGroupDenomination = "DevTeam";
        String accountGroupDescription = "Account for members of DevTeam";

        //Act
        //create object groupAccount
        GroupAccount devTeam = new GroupAccount(accountGroupDenomination, accountGroupDescription);

        //Assert
        //Verify getter method
        assertEquals(accountGroupDescription, devTeam.getAccountGroupDescription());
    }

    @Test
    @DisplayName("Verify setAccountGroupDescription() of GroupAccount")
    public void groupAccountSetGroupAccountDescription() {

        //Arrange
        String accountGroupDenomination = "DevTeam";
        String accountGroupDescription = "Account for members of DevTeam";

        String accountGroupDenomination2 = "Developers Team";
        String accountGroupDescription2 = "Account for members of Developers Team";

        //Act
        //create object groupAccount
        GroupAccount account = new GroupAccount(accountGroupDenomination, accountGroupDescription);

        //change parameters for groupAccount using method set()
        account.setAccountGroupDenomination(accountGroupDenomination2);
        account.setAccountGroupDescription(accountGroupDescription2);

        //Assert
        //Verify setter method
        assertEquals(accountGroupDescription2, "Account for members of Developers Team");
    }

    @Test
    @DisplayName("Verify setAccountGroupDenomination() of GroupAccount")
    public void groupAccountSetGroupAccountDenominaton() {

        //Arrange
        String accountGroupDenomination = "DevTeam";
        String accountGroupDescription = "Account for members of DevTeam";

        String accountGroupDenomination2 = "Developers Team";
        String accountGroupDescription2 = "Account for members of Developers Team";

        //Act
        //create object groupAccount
        GroupAccount account = new GroupAccount(accountGroupDenomination, accountGroupDescription);

        //change parameters for groupAccount using method set()
        account.setAccountGroupDescription(accountGroupDescription2);
        account.setAccountGroupDenomination(accountGroupDenomination2);

        //Assert
        //Verify setter method
        assertEquals(accountGroupDenomination2, "Developers Team");
    }


}