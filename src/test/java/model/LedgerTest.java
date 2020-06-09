package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LedgerTest {

    @Test
    @DisplayName("Verify Ledger constructor && equals")
    public void ledgerConstructorEquals() {

        // Arrange
        Account account = new Account ("Description", "Denomination");
        String movType = "debit";
        Category category = new Category("Pet Care");
        double amount = 124.00;
        String description = "Dog bed";
        LocalDate date = LocalDate.of(2020, 02, 25);

        ArrayList<Transaction> records = new ArrayList<>();


        // Act
        Transaction transaction = new Transaction(account, movType, category, amount, description, date);
        Transaction transaction2 = new Transaction(account, movType, category, amount, description, date);

        records.add(transaction);
        records.add(transaction2);

        ArrayList<Transaction> records2 = new ArrayList<>();


        Ledger ledger = new Ledger(records);
        Ledger ledger2 = new Ledger(records);


        // Assert
        assertEquals(ledger, ledger2);
    }

    @Test
    @DisplayName("Verify getRecords && equals")
    public void ledgerGetRecordsEquals() {

        // Arrange
        Account account = new Account ("Description", "Denomination");
        String movType = "debit";
        Category category = new Category("Pet Care");
        double amount = 124.00;
        String description = "Dog bed";
        LocalDate date = LocalDate.of(2020, 02, 25);

        ArrayList<Transaction> records = new ArrayList<>();


        // Act
        Transaction transaction = new Transaction(account, movType, category, amount, description, date);
        Transaction transaction2 = new Transaction(account, movType, category, amount, description, date);

        records.add(transaction);
        records.add(transaction2);

        Ledger ledger = new Ledger(records);


        // Assert
        assertEquals(records, ledger.getRecords());
    }

    @Test
    @DisplayName("Verify setRecords && equals")
    public void ledgerSetRecordsEquals() {

        // Arrange
        Account account = new Account ("Description", "Denomination");
        String movType = "debit";
        Category category = new Category("Pet Care");
        double amount = 124.00;
        String description = "Dog bed";
        LocalDate date = LocalDate.of(2020, 02, 25);

        ArrayList<Transaction> records = new ArrayList<>();


        // Act
        Transaction transaction = new Transaction(account, movType, category, amount, description, date);
        Transaction transaction2 = new Transaction(account, movType, category, amount, description, date);

        records.add(transaction);
        records.add(transaction2);

        ArrayList<Transaction> records2 = new ArrayList<>();


        Ledger ledger = new Ledger(records);

        ledger.setRecords(records2);



        // Assert
        assertEquals(records2, ledger.getRecords());
    }

    @Test
    @DisplayName("Verify addTransaction && equals")
    public void ledgerAddTransactionEquals() {

        // Arrange
        Account account = new Account ("Description", "Denomination");
        String movType = "debit";
        Category category = new Category("Pet Care");
        double amount = 124.00;
        String description = "Dog bed";
        LocalDate date = LocalDate.of(2020, 02, 25);

        ArrayList<Transaction> records = new ArrayList<>();


        // Act
        Transaction transaction = new Transaction(account, movType, category, amount, description, date);
        Transaction transaction2 = new Transaction(account, movType, category, amount, description, date);

        records.add(transaction);


        Ledger ledger = new Ledger(records);
        ledger.addTransaction(transaction2);

        ArrayList<Transaction> records2 = new ArrayList<>();
        records2.add(transaction);
        records2.add(transaction2);

        // Assert
        assertEquals(records2, ledger.getRecords());
    }


    @Test
    @DisplayName("Verify createTransaction constructor && equals")
    public void ledgerCreateTransactionEquals() {


        // Arrange
        Account account = new Account ("Description", "Denomination");
        String movType = "debit";
        Category category = new Category("Pet Care");
        double amount = 124.00;
        String description = "Dog bed";
        LocalDate date = LocalDate.of(2020, 02, 25);

        ArrayList<Transaction> records = new ArrayList<>();


        // Act
        Transaction transaction = new Transaction(account, movType, category, amount, description, date);
        Transaction transaction2 = new Transaction(account, movType, category, amount, description, date);

        records.add(transaction);
        records.add(transaction2);


        Ledger ledger = new Ledger(records);

        //create transaction thru ledger
        Transaction ledgerTransaction = ledger.createTransaction(account, movType, category, amount, description, date);

        Transaction ledgerTransaction2 = new Transaction(account, movType, category, amount, description, date);


        // Assert
        assertEquals(ledgerTransaction2, ledgerTransaction);
    }


}