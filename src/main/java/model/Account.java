package model;

import java.util.Objects;

public class Account {


    private String denomination;
    private String description;

    public static Account createAccount(String denomination, String description) {
        if (denomination == null || description == null) {
            throw new IllegalArgumentException("Can't create Account. All arguments must be filled.");
        } else {
            return new Account(denomination, description);
        }
    }

    private Account(String denomination, String description) {
        this.denomination = denomination;
        this.description = description;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return Objects.equals(denomination, account.denomination) &&
                Objects.equals(description, account.description);
    }
}