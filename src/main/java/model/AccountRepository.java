package model;

import java.util.Objects;

public class AccountRepository {


    private Account account;
    private int id;

    public AccountRepository(Account account, int id) {
        this.account = account;
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountRepository)) return false;
        AccountRepository that = (AccountRepository) o;
        return id == that.id &&
                Objects.equals(account, that.account);
    }

}
