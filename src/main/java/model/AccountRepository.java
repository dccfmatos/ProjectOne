package model;

import java.util.Objects;

public class AccountRepository {


    private Account account;
    private int id;

    //Constructors
    public static AccountRepository createAccountRepository(Account account, int id){
        return new AccountRepository(account, id);
    }

    private AccountRepository(Account account, int id) {
        this.account = account;
        this.id = id;
    }

    //Gets
    public Account getAccount() {
        return account;
    }

    public int getId() {
        return id;
    }

    //Sets
    public void setAccount(Account account) {
        this.account = account;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Override
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountRepository)) return false;
        AccountRepository that = (AccountRepository) o;
        return id == that.id &&
                Objects.equals(account, that.account);
    }

}
