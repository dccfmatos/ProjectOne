package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    @DisplayName("Verify Transaction constructor && equals")
    public void transactionConstructorEquals() {

        // Arrange
        Account debitMov = new Account ("Description", "Denomination");
        Account creditMov = new Account("Description", "Denomination");
        Category category = new Category("Pet Care");
        double amount = 124.00;
        String description = "Dog bed";
        String date = "25.02.2020";


        // Act
        Transaction transaction = new Transaction(debitMov, creditMov, category, amount, description, date);
        Transaction transaction2 = new Transaction(debitMov, creditMov, category, amount, description, date);

        // Assert
        assertEquals(transaction, transaction2);
    }

    @Test
    @DisplayName("Verify get methods")
    public void transactionGetMethods() {

        // Arrange
        Account debitMov = new Account ("Description", "Denomination");
        Account creditMov = new Account("Description", "Denomination");
        Category category = new Category("Pet Care");
        double amount = 124.00;
        String description = "Dog bed";
        String date = "25.02.2020";


        // Act
        Transaction transaction = new Transaction(debitMov, creditMov, category, amount, description, date);


        // Assert
        assertEquals(debitMov, transaction.getDebitMov());
        assertEquals(creditMov, transaction.getCreditMov());
        assertEquals(category, transaction.getCategory());
        assertEquals(amount, transaction.getAmount());
        assertEquals(description, transaction.getDescription());
        assertEquals(date, transaction.getDate());
    }
    @Test
    @DisplayName("Verify set methods")
    public void transactionSetMethods() {

        // Arrange
        Account debitMov = new Account ("Description", "Denomination");
        Account creditMov = new Account("Description", "Denomination");
        Category category = new Category("Pet Care");
        double amount = 124.00;
        String description = "Dog bed";
        String date = "25.02.2020";


        // Act
        Transaction transaction = new Transaction(debitMov, creditMov, category, amount, description, date);

        Account debitMov2 = new Account ("new description", "Denomination");
        Account creditMov2 = new Account("new description", "Denomination");
        Category category2 = new Category("Pet Care - for sleeping");
        double amount2 = 124.78;
        String description2 = "Dog bed - for sleeping";
        String date2 = "25.04.2020";

        transaction.setDebitMov(debitMov2);
        transaction.setCreditMov(creditMov2);
        transaction.setCategory(category2);
        transaction.setAmount(amount2);
        transaction.setDescription(description2);
        transaction.setDate(date2);

        // Assert
        assertEquals(debitMov2, transaction.getDebitMov());
        assertEquals(creditMov2, transaction.getCreditMov());
        assertEquals(category2, transaction.getCategory());
        assertEquals(amount2, transaction.getAmount());
        assertEquals(description2, transaction.getDescription());
        assertEquals(date2, transaction.getDate());
    }


}