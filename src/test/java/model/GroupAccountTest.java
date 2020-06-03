package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class GroupAccountTest {

    @Test
    @DisplayName("Verify AccountGroup constructor | assertEquals")
    public void accountGroupConstructor() {

        // Arrange
        String accountGroupDenomination = "accountGroupDenomination";
        String accountGroupDescription = "accountGroupDescription";

        // Act
        GroupAccount accountGroup = new GroupAccount(accountGroupDenomination, accountGroupDescription);
        GroupAccount accountGroup2 = new GroupAccount("accountGroupDenomination", "accountGroupDescription");

        // Assert
        assertEquals(accountGroup, accountGroup2);
    }

    @Test
    @DisplayName("Verify AccountGroup constructor + group | assertEquals")
    public void accountGroupConstructorWGroup() {

        // Arrange
        String accountGroupDenomination = "accountGroupDenomination";
        String accountGroupDescription = "accountGroupDescription";
        LocalDate dateOfCreation = LocalDate.of(2020, 01, 26);
        String denomination = "Group 1";

        Group group1 = new Group(dateOfCreation, denomination);

        // Act
        GroupAccount accountGroup = new GroupAccount(accountGroupDenomination, accountGroupDescription, group1);
        GroupAccount accountGroup2 = new GroupAccount("accountGroupDenomination", "accountGroupDescription", group1);

        // Assert
        assertEquals(accountGroup, accountGroup2);
    }


    @Test
    @DisplayName("Verify AccountGroup getter | assertEquals")
    public void accountGroupGetter() {

        //Arrange
        String accountGroupDenomination = "accountGroupDenomination";
        String accountGroupDescription = "accountGroupDescription";

        //Act
        GroupAccount account = new GroupAccount("accountGroupDenomination", "accountGroupDescription");

        //Assert
        assertEquals(accountGroupDenomination, account.getAccountGroupDenomination());
    }

    @Test
    @DisplayName("Verify AccountGroup getter2 | assertEquals")
    public void accountGroupGetter2() {

        //Arrange
        String accountGroupDenomination = "accountGroupDenomination";
        String accountGroupDescription = "accountGroupDescription";

        //Act
        GroupAccount account = new GroupAccount("accountGroupDenomination", "accountGroupDescription");

        //Assert
        assertEquals(accountGroupDescription, account.getAccountGroupDescription());
    }

    @Test
    @DisplayName("Verify GroupAccount setter | assertEquals")
    public void accountGroupSetter() {

        //Arrange
        String accountGroupDenomination = "accountGroupDenomination";
        String accountGroupDescription = "accountGroupDescription";

        String accountGroupDenomination2 = "accountGroupDenomination2";
        String accountGroupDescription2 = "accountGroupDescription2";

        //Act
        GroupAccount account = new GroupAccount(accountGroupDenomination, accountGroupDescription);
        account.setAccountGroupDenomination(accountGroupDenomination2);
        account.setAccountGroupDescription(accountGroupDescription2);

        //Assert
        assertEquals(accountGroupDenomination2, "accountGroupDenomination2");
    }

    @Test
    @DisplayName("Verify GroupAccount setter2 | assertEquals")
    public void accountGroupSetter2() {

        //Arrange
        String accountGroupDenomination = "accountGroupDenomination";
        String accountGroupDescription = "accountGroupDescription";

        String accountGroupDenomination2 = "accountGroupDenomination2";
        String accountGroupDescription2 = "accountGroupDescription2";

        //Act
        GroupAccount account = new GroupAccount(accountGroupDenomination, accountGroupDescription);
        account.setAccountGroupDescription(accountGroupDescription2);
        account.setAccountGroupDenomination(accountGroupDenomination2);

        //Assert
        assertEquals(accountGroupDescription2, "accountGroupDescription2");
    }


}