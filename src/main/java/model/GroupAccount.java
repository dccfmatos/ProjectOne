package model;

import java.util.Objects;

public class GroupAccount {

    private String accountGroupDenomination;
    private String accountGroupDescription;
    private Group group;

    public static GroupAccount createGroupAccount(String accountGroupDenomination, String accountGroupDescription){
        return new GroupAccount(accountGroupDenomination, accountGroupDescription);
    }

    private GroupAccount(String accountGroupDenomination, String accountGroupDescription) {
        if (accountGroupDenomination == null) {
            throw new NullPointerException("Group not created. Denomination can't be Null");
        } else {
            this.accountGroupDenomination = accountGroupDenomination;
            this.accountGroupDescription = accountGroupDescription;
        }
    }

    public static GroupAccount createGroupAccountWGroup(String accountGroupDenomination, String accountGroupDescription, Group group){
        return new GroupAccount(accountGroupDenomination, accountGroupDescription, group);
    }

    private GroupAccount(String accountGroupDenomination, String accountGroupDescription, Group group) {
        if (accountGroupDenomination == null) {
            throw new NullPointerException("Group not created. Denomination can't be Null");
        } else {
            this.accountGroupDenomination = accountGroupDenomination;
            this.accountGroupDescription = accountGroupDescription;
            this.group = group;
        }
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
