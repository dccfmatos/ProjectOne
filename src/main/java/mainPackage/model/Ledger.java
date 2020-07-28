package mainPackage.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Ledger {

    private ArrayList<Transaction> records;

    //Constructors
    public static Ledger createLedger(ArrayList<Transaction> records){
        return new Ledger(records);
    }

    private Ledger(ArrayList<Transaction> records) {
        this.records = records;
    }

    //Methods
    public Transaction addTransaction(Transaction transaction){
        if(transaction != null) {
            this.records.add(transaction);
        }
        return transaction;
    }

    public Transaction createTransaction(Account account, String movType, Category category, double amount, String description,  LocalDate date) {
        Transaction newTransaction = Transaction.createTransaction(account, movType, category, amount, description, date);
        return newTransaction;
    }

    //Gets
    public ArrayList<Transaction> getRecords() {
        return records;
    }

    //Sets
    public void setRecords(ArrayList<Transaction> records) {
        this.records = records;
    }

    //Override
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ledger)) return false;
        Ledger ledger = (Ledger) o;
        return Objects.equals(records, ledger.records);
    }

}
