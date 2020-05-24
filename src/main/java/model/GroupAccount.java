package model;

import java.util.Objects;

public class GroupAccount {

    private String accountGroupDenomination;
    private String accountGroupDescription;
    private Group group;

    public GroupAccount(String accountGroupDenomination, String accountGroupDescription) {
        this.accountGroupDenomination = accountGroupDenomination;
        this.accountGroupDescription = accountGroupDescription;
    }

    public GroupAccount(String accountGroupDenomination, String accountGroupDescription, Group group) {
        this.accountGroupDenomination = accountGroupDenomination;
        this.accountGroupDescription = accountGroupDescription;
        this.group = group;
    }

    public String getAccountGroupDenomination() {
        return accountGroupDenomination;
    }

    public void setAccountGroupDenomination(String accountGroupDenomination) {
        this.accountGroupDenomination = accountGroupDenomination;
    }

    public String getAccountGroupDescription() {
        return accountGroupDescription;
    }

    public void setAccountGroupDescription(String accountGroupDescription) {
        this.accountGroupDescription = accountGroupDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GroupAccount)) return false;
        GroupAccount that = (GroupAccount) o;
        return Objects.equals(accountGroupDenomination, that.accountGroupDenomination) &&
                Objects.equals(accountGroupDescription, that.accountGroupDescription);
    }

}
