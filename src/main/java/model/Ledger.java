package model;

import java.util.ArrayList;
import java.util.Objects;

public class Ledger {

    private ArrayList<Transaction> records;

    public Ledger(ArrayList<Transaction> records) {
        this.records = records;
    }

    public ArrayList<Transaction> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<Transaction> records) {
        this.records = records;
    }

    public void addTransaction(Transaction transaction){
        if(transaction != null) {
            this.records.add(transaction);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ledger)) return false;
        Ledger ledger = (Ledger) o;
        return Objects.equals(records, ledger.records);
    }

}
