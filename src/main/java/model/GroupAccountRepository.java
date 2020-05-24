package model;

import java.util.Objects;

public class GroupAccountRepository {

    private GroupAccount groupAccount;
    private int groupAccountId;

    public GroupAccountRepository(GroupAccount groupAccount, int groupAccountId) {
        this.groupAccount = groupAccount;
        this.groupAccountId = groupAccountId;
    }

    public GroupAccount getGroupAccount() {
        return groupAccount;
    }

    public void setGroupAccount(GroupAccount groupAccount) {
        this.groupAccount = groupAccount;
    }

    public int getGroupAccountId() {
        return groupAccountId;
    }

    public void setGroupAccountId(int groupAccountId) {
        this.groupAccountId = groupAccountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GroupAccountRepository)) return false;
        GroupAccountRepository that = (GroupAccountRepository) o;
        return groupAccountId == that.groupAccountId &&
                Objects.equals(groupAccount, that.groupAccount);
    }

}

