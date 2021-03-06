package model;

import mainPackage.model.Account;
import mainPackage.model.Category;
import mainPackage.model.Ledger;
import mainPackage.model.Transaction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LedgerTest {

    @Test
    @DisplayName("Verify Ledger constructor || Equals")
    public void ledgerConstructorEquals() {

        // Arrange
        Account account = Account.createAccount("Description", "Denomination");
        String movType = "debit";
        Category category = Category.createCategory("Pet Care");
        double amount = 124.00;
        String description = "Dog bed";
        LocalDate date = LocalDate.of(2020, 02, 25);

        ArrayList<Transaction> records = new ArrayList<>();


        // Act
        Transaction transaction = Transaction.createTransaction(account, movType, category, amount, description, date);
        Transaction transaction2 = Transaction.createTransaction(account, movType, category, amount, description, date);

        records.add(transaction);
        records.add(transaction2);

        ArrayList<Transaction> records2 = new ArrayList<>();


        Ledger ledger = Ledger.createLedger(records);
        Ledger ledger2 = Ledger.createLedger(records);


        // Assert
        assertEquals(ledger, ledger2);
    }

    @Test
    @DisplayName("Verify getRecords || Equals")
    public void ledgerGetRecordsEquals() {

        // Arrange
        Account account = Account.createAccount("Description", "Denomination");
        String movType = "debit";
        Category category = Category.createCategory("Pet Care");
        double amount = 124.00;
        String description = "Dog bed";
        LocalDate date = LocalDate.of(2020, 02, 25);

        ArrayList<Transaction> records = new ArrayList<>();


        // Act
        Transaction transaction = Transaction.createTransaction(account, movType, category, amount, description, date);
        Transaction transaction2 = Transaction.createTransaction(account, movType, category, amount, description, date);

        records.add(transaction);
        records.add(transaction2);

        Ledger ledger = Ledger.createLedger(records);


        // Assert
        assertEquals(records, ledger.getRecords());
    }

    @Test
    @DisplayName("Verify setRecords || Equals")
    public void ledgerSetRecordsEquals() {

        // Arrange
        Account account = Account.createAccount("Description", "Denomination");
        String movType = "debit";
        Category category = Category.createCategory("Pet Care");
        double amount = 124.00;
        String description = "Dog bed";
        LocalDate date = LocalDate.of(2020, 02, 25);

        ArrayList<Transaction> records = new ArrayList<>();


        // Act
        Transaction transaction = Transaction.createTransaction(account, movType, category, amount, description, date);
        Transaction transaction2 = Transaction.createTransaction(account, movType, category, amount, description, date);

        records.add(transaction);
        records.add(transaction2);

        ArrayList<Transaction> records2 = new ArrayList<>();


        Ledger ledger = Ledger.createLedger(records);

        ledger.setRecords(records2);



        // Assert
        assertEquals(records2, ledger.getRecords());
    }

    @Test
    @DisplayName("Verify addTransaction || Equals")
    public void ledgerAddTransactionEquals() {

        // Arrange
        Account account = Account.createAccount("Description", "Denomination");
        String movType = "debit";
        Category category = Category.createCategory("Pet Care");
        double amount = 124.00;
        String description = "Dog bed";
        LocalDate date = LocalDate.of(2020, 02, 25);

        ArrayList<Transaction> records = new ArrayList<>();


        // Act
        Transaction transaction = Transaction.createTransaction(account, movType, category, amount, description, date);
        Transaction transaction2 = Transaction.createTransaction(account, movType, category, amount, description, date);

        records.add(transaction);


        Ledger ledger = Ledger.createLedger(records);
        ledger.addTransaction(transaction2);

        ArrayList<Transaction> records2 = new ArrayList<>();
        records2.add(transaction);
        records2.add(transaction2);

        // Assert
        assertEquals(records2, ledger.getRecords());
    }

    @Test
    @DisplayName("Verify createTransaction constructor || Equals")
    public void ledgerCreateTransactionEquals() {


        // Arrange
        Account account = Account.createAccount("Description", "Denomination");
        String movType = "debit";
        Category category = Category.createCategory("Pet Care");
        double amount = 124.00;
        String description = "Dog bed";
        LocalDate date = LocalDate.of(2020, 02, 25);

        ArrayList<Transaction> records = new ArrayList<>();


        // Act
        Transaction transaction = Transaction.createTransaction(account, movType, category, amount, description, date);
        Transaction transaction2 = Transaction.createTransaction(account, movType, category, amount, description, date);

        records.add(transaction);
        records.add(transaction2);


        Ledger ledger = Ledger.createLedger(records);

        //create transaction thru ledger
        Transaction ledgerTransaction = ledger.createTransaction(account, movType, category, amount, description, date);

        Transaction ledgerTransaction2 = Transaction.createTransaction(account, movType, category, amount, description, date);


        // Assert
        assertEquals(ledgerTransaction2, ledgerTransaction);
    }


}