package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    @DisplayName("Verify Account constructor || Equals")
    public void accountConstructorEquals() {

            // Arrange
            //Define variables for parameters "denomination" and "description"
        String denomination = "Scrapbooking";
        String description = "Account for Scrapbooking stuff";
            // Act
            //create two objects Account
        Account account1 = Account.createAccount(denomination, description);
        Account account2 = Account.createAccount("Scrapbooking", "Account for Scrapbooking stuff");
            // Assert
            //Verify if constructor works fine and if object is the same
        assertEquals(account1, account2);
    }

    @Test
    @DisplayName("Verify Account constructor || Both null")
    public void accountConstructorBNull() {

        // Arrange
        //Define variables for parameters "denomination" and "description"
        String denomination = "Scrapbooking";
        String description = "Account for Scrapbooking stuff";

        //Act
        Throwable thrown = assertThrows(IllegalArgumentException.class, () -> Account.createAccount(null, null));

        //Assert
        assertEquals(thrown.getMessage(), "Can't create Account, no field can be null.");
    }

    @Test
    @DisplayName("Verify Account constructor || Exception Denomination")
    public void accountConstructorDenominationNull() {

        // Arrange
        //Define variables for parameters "denomination" and "description"
        String denomination = "Scrapbooking";
        String description = "Account for Scrapbooking stuff";

        //Act
        Throwable thrown = assertThrows(IllegalArgumentException.class, () -> Account.createAccount(null, description));

        //Assert
        assertEquals(thrown.getMessage(), "Can't create Account, no field can be null.");
    }

    @Test
    @DisplayName("Verify Account constructor || Exception Description")
    public void accountConstructorDescriptionNull() {

        // Arrange
        //Define variables for parameters "denomination" and "description"
        String denomination = "Scrapbooking";
        String description = "Account for Scrapbooking stuff";

        //Act
        Throwable thrown = assertThrows(IllegalArgumentException.class, () -> Account.createAccount(denomination, null));

        //Assert
        assertEquals(thrown.getMessage(), "Can't create Account, no field can be null.");
    }

    @Test
    @DisplayName("Verify getDenomination() of Account || Equals")
    public void accountGetDenomination() {

            // Arrange
            //Define variables for parameters "denomination" and "description"
        String denomination = "Scrapbooking";
        String description = "Account for Scrapbooking stuff";
            // Act
            //create object Account
        Account account = Account.createAccount(denomination, description);
            // Assert
            //Verify getter method
        assertEquals(denomination, account.getDenomination());
    }

    @Test
    @DisplayName("Verify getDescription() of Account || Equals")
    public void accountGetDescription() {

            // Arrange
            //Define variables for parameters "denomination" and "description"
        String denomination = "Scrapbooking";
        String description = "Account for Scrapbooking stuff";
            // Act
            //create object Account
        Account account = Account.createAccount(denomination, description);
            // Assert
            //Verify getter method
        assertEquals(description, account.getDescription());
    }

    @Test
    @DisplayName("Verify setDenomination() of Account || Equals")
    public void accountSetDenomination() {

        // Arrange
        //Define variables for parameters "denomination" and "description" for 2 objects
        String denomination1 = "Scrapbooking";
        String description1 = "Account for Scrapbooking stuff";

        String denomination2 = "Doggies";
        String description2 = "Account for dogs stuff";
        // Act
        //create object Account
        Account account = Account.createAccount(denomination1, description1);
        //Change parameters of account using setter method
        account.setDenomination(denomination2);
        account.setDescription(description2);
        // Assert
        //Verify getter method
        assertEquals(denomination2, account.getDenomination());
    }

    @Test
    @DisplayName("Verify setDescription() of Account || Equals")
    public void accountSetDescription() {

            // Arrange
            //Define variables for parameters "denomination" and "description" for 2 objects
        String denomination1 = "Scrapbooking";
        String description1 = "Account for Scrapbooking stuff";

        String denomination2 = "Doggies";
        String description2 = "Account for dogs stuff";
            // Act
            //create object Account
        Account account = Account.createAccount(denomination1, description1);
            //Change parameters of account using setter method
        account.setDenomination(denomination2);
        account.setDescription(description2);
            // Assert
            //Verify getter method
        assertEquals(description2, account.getDescription());
    }

}