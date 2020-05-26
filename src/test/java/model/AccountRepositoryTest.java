package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountRepositoryTest {

    @Test
    @DisplayName("Verify AccountRepository constructor")
    public void accountConstructor() {

        // Arrange
        Account account = new Account("Scrapbooking", "Account for Scrapbooking stuff");
        int id = 1111;
        // Act
        AccountRepository accountRepository = new AccountRepository(account, id);
        AccountRepository accountRepository2 = new AccountRepository(account, 1111);
        // Assert
        assertEquals(accountRepository, accountRepository2);
    }
}