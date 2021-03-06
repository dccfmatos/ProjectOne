package model;

import mainPackage.model.Account;
import mainPackage.model.Category;
import mainPackage.model.Transaction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    @DisplayName("Verify Transaction constructor && equals")
    public void transactionConstructorEquals() {

        // Arrange
        Account account = Account.createAccount("Description", "Denomination");
        String movType = "debit";
        Category category = Category.createCategory("Pet Care");
        double amount = 124.00;
        String description = "Dog bed";
        LocalDate date = LocalDate.of(2020,02,25);

        // Act
        Transaction transaction = Transaction.createTransaction(account, movType, category, amount, description, date);
        Transaction transaction2 = Transaction.createTransaction(account, movType, category, amount, description, date);

        // Assert
        assertEquals(transaction, transaction2);
    }

    @Test
    @DisplayName("Verify get methods")
    public void transactionGetMethods() {

        // Arrange
        Account account = Account.createAccount("Description", "Denomination");
        String movType = "debit";
        Category category = Category.createCategory("Pet Care");
        double amount = 124.00;
        String description = "Dog bed";
        LocalDate date = LocalDate.of(2020,02,25);


        // Act
        Transaction transaction = Transaction.createTransaction(account, movType, category, amount, description, date);


        // Assert
        assertEquals(account, transaction.getAccount());
        assertEquals(movType, transaction.getMovType());
        assertEquals(category, transaction.getCategory());
        assertEquals(amount, transaction.getAmount());
        assertEquals(description, transaction.getDescription());
        assertEquals(date, transaction.getDate());
    }
    @Test
    @DisplayName("Verify set methods")
    public void transactionSetMethods() {

        // Arrange
        Account account = Account.createAccount("Description", "Denomination");
        String movType = "debit";
        Category category = Category.createCategory("Pet Care");
        double amount = 124.00;
        String description = "Dog bed";
        LocalDate date = LocalDate.of(2020,02,25);


        // Act
        Transaction transaction = Transaction.createTransaction(account, movType, category, amount, description, date);

        Account account2 = Account.createAccount("new description", "Denomination");
        String movType2 = "credit";
        Category category2 = Category.createCategory("Pet Care - for sleeping");
        double amount2 = 124.78;
        String description2 = "Dog bed - for sleeping";
        LocalDate date2 = LocalDate.of(2020,03,25);

        transaction.setAccount(account2);
        transaction.setMovType(movType2);
        transaction.setCategory(category2);
        transaction.setAmount(amount2);
        transaction.setDescription(description2);
        transaction.setDate(date2);

        // Assert
        assertEquals(account2, transaction.getAccount());
        assertEquals(movType2, transaction.getMovType());
        assertEquals(category2, transaction.getCategory());
        assertEquals(amount2, transaction.getAmount());
        assertEquals(description2, transaction.getDescription());
        assertEquals(date2, transaction.getDate());
    }

    @Test
    @DisplayName("Verify createTransaction || Exception account")
    public void transactionCreateTransactionExpAccount () {

        // Arrange
        Account account = Account.createAccount("Description", "Denomination");
        String movType = "debit";
        Category category = Category.createCategory("Pet Care");
        double amount = 124.00;
        String description = "Dog bed";
        LocalDate date = LocalDate.of(2020,02,25);

        //Act
        Throwable thrown = assertThrows(NullPointerException.class, () ->
                Transaction.createTransaction(null, movType, category, amount, description, date));

        //Assert
        assertEquals(thrown.getMessage(), "All fields are required.");
    }

    @Test
    @DisplayName("Verify createTransaction || Exception movType")
    public void transactionCreateTransactionExpMovType () {

        // Arrange
        Account account = Account.createAccount("Description", "Denomination");
        String movType = "debit";
        Category category = Category.createCategory("Pet Care");
        double amount = 124.00;
        String description = "Dog bed";
        LocalDate date = LocalDate.of(2020,02,25);

        //Act
        Throwable thrown = assertThrows(NullPointerException.class, () ->
                Transaction.createTransaction(account, null, category, amount, description, date));

        //Assert
        assertEquals(thrown.getMessage(), "All fields are required.");
    }

    @Test
    @DisplayName("Verify createTransaction || Exception category")
    public void transactionCreateTransactionExpCategory () {

        // Arrange
        Account account = Account.createAccount("Description", "Denomination");
        String movType = "debit";
        Category category = Category.createCategory("Pet Care");
        double amount = 124.00;
        String description = "Dog bed";
        LocalDate date = LocalDate.of(2020,02,25);

        //Act
        Throwable thrown = assertThrows(NullPointerException.class, () ->
                Transaction.createTransaction(account, movType, null, amount, description, date));

        //Assert
        assertEquals(thrown.getMessage(), "All fields are required.");
    }

    @Test
    @DisplayName("Verify createTransaction || Exception description")
    public void transactionCreateTransactionExpDescription () {

        // Arrange
        Account account = Account.createAccount("Description", "Denomination");
        String movType = "debit";
        Category category = Category.createCategory("Pet Care");
        double amount = 124.00;
        String description = "Dog bed";
        LocalDate date = LocalDate.of(2020,02,25);

        //Act
        Throwable thrown = assertThrows(NullPointerException.class, () ->
                Transaction.createTransaction(account, movType, category, amount, null, date));

        //Assert
        assertEquals(thrown.getMessage(), "All fields are required.");
    }

    @Test
    @DisplayName("Verify createTransaction || Exception date")
    public void transactionCreateTransactionExpDate () {

        // Arrange
        Account account = Account.createAccount("Description", "Denomination");
        String movType = "debit";
        Category category = Category.createCategory("Pet Care");
        double amount = 124.00;
        String description = "Dog bed";
        LocalDate date = LocalDate.of(2020,02,25);

        //Act
        Throwable thrown = assertThrows(NullPointerException.class, () ->
                Transaction.createTransaction(account, movType, category, amount, description, null));

        //Assert
        assertEquals(thrown.getMessage(), "All fields are required.");
    }
}