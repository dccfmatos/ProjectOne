package mainPackage.model;

import java.time.LocalDate;
import java.util.Objects;

public class Transaction {
    private Account account;
    private String movType;
    private Category category;
    private double amount;
    private String description;
    private LocalDate date;


    //Constructors
    public static Transaction createTransaction(Account account, String movType, Category category, double amount, String description, LocalDate date){
        return new Transaction(account, movType, category, amount, description, date);
    }

    private Transaction(Account account, String movType, Category category, double amount, String description, LocalDate date) {
        if (account == null || movType == null || category == null || description == null || date == null) {
            throw new NullPointerException("All fields are required.");
        } else {
            this.account = account;
            this.movType = movType;
            this.category = category;
            this.amount = amount;
            this.description = description;
            this.date = date;
        }
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getMovType() {
        return movType;
    }

    public void setMovType(String movType) {
        this.movType = movType;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction)) return false;
        Transaction that = (Transaction) o;
        return Double.compare(that.amount, amount) == 0 &&
                Objects.equals(account, that.account) &&
                Objects.equals(movType, that.movType) &&
                Objects.equals(category, that.category) &&
                Objects.equals(description.toUpperCase(), that.description.toUpperCase()) &&
                Objects.equals(date, that.date);
    }

}
