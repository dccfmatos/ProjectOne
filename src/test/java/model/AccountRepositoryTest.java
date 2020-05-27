package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountRepositoryTest {

    @Test
    @DisplayName("Verify AccountRepository constructor && equals")
    public void accountRepConstructorEquals() {

        // Arrange
        //Create an account object and an ID so that object accountRepository can be created
        Account account = new Account("Scrapbooking", "Account for Scrapbooking stuff");
        int id = 1111;
        // Act
        //create 2 accountRepositories that can be compared
        AccountRepository accountRep1 = new AccountRepository(account, id);
        AccountRepository accountRep2 = new AccountRepository(account, 1111);
        // Assert
        //Verify if constructor works fine and if object is the same
        assertEquals(accountRep1, accountRep2);
    }

    @Test
    @DisplayName("Verify getId() of AccountRepository")
    public void accountRepGetId() {

        // Arrange
        //Create an account object and an ID so that object accountRepository can be created
        Account account = new Account("Scrapbooking", "Account for Scrapbooking stuff");
        int id = 1111;
        // Act
        //Create one accountRepository with the previously defined parameters
        AccountRepository accountRep1 = new AccountRepository(account, id);
        // Assert
        //verify getter method
        assertEquals(id, accountRep1.getId());
    }

    @Test
    @DisplayName("Verify getAccount() of AccountRepository")
    public void accountRepGetAccount() {

        // Arrange
        //Create an account object and an ID so that object accountRepository can be created
        Account account = new Account("Scrapbooking", "Account for Scrapbooking stuff");
        int id = 1111;
        // Act
        //Create one accountRepository with the previously defined parameters
        AccountRepository accountRep1 = new AccountRepository(account, id);
        // Assert
        //verify getter method
        assertEquals(account, accountRep1.getAccount());
    }

    @Test
    @DisplayName("Verify setAccount() of AccountRepository")
    public void accountRepSetAccount() {

        // Arrange
        //Create two account objects and an ID so that objects accountRepository can be created
        Account account1 = new Account("Scrapbooking", "Account for Scrapbooking stuff");
        int id1 = 1111;

        Account account2 = new Account("Doggies", "Account for dogs stuff");
        int id2 = 2222;

        //Create one accountRepository with the previously defined parameters
        AccountRepository accountRep = new AccountRepository(account1, id1);
        //Change parameters of accountRep using setter method
        accountRep.setAccount(account2);
        accountRep.setId(id2);

        // Assert
        //Verify if account of accountRep changed after setAccount()
        assertEquals(account2, accountRep.getAccount());
    }
    @Test
    @DisplayName("Verify setId() of AccountRepository")
    public void accountRepSetId() {

        // Arrange
        //Create two account objects and an ID so that objects accountRepository can be created
        Account account1 = new Account("Scrapbooking", "Account for Scrapbooking stuff");
        int id1 = 1111;

        Account account2 = new Account("Doggies", "Account for dogs stuff");
        int id2 = 2222;

        //Create one accountRepository with the previously defined parameters
        AccountRepository accountRep = new AccountRepository(account1, id1);
        //Change parameters of accountRep using setter method
        accountRep.setAccount(account2);
        accountRep.setId(id2);

        // Assert
        //Verify if id of accountRep changed after setId()
        assertEquals(id2, accountRep.getId());
    }
}