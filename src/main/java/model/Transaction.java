package model;

import java.util.Objects;

public class Transaction {
    private Account debitMov;
    private Account creditMov;
    private Category category;
    private double amount;
    private String description;
    private String date;

    public Transaction(Account debitMov, Account creditMov, Category category, double amount, String description, String date) {
        this.debitMov = debitMov;
        this.creditMov = creditMov;
        this.category = category;
        this.amount = amount;
        this.description = description;
        this.date = date;
    }

    public Account getDebitMov() {
        return debitMov;
    }

    public void setDebitMov(Account debitMov) {
        this.debitMov = debitMov;
    }

    public Account getCreditMov() {
        return creditMov;
    }

    public void setCreditMov(Account creditMov) {
        this.creditMov = creditMov;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction)) return false;
        Transaction that = (Transaction) o;
        return Double.compare(that.amount, amount) == 0 &&
                Objects.equals(debitMov, that.debitMov) &&
                Objects.equals(creditMov, that.creditMov) &&
                Objects.equals(category, that.category) &&
                Objects.equals(description.toUpperCase(), that.description.toUpperCase()) &&
                Objects.equals(date.toUpperCase(), that.date.toUpperCase());
    }

}
