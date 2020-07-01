package model;

import java.util.Objects;

public class GroupAccountRepository {

    private GroupAccount groupAccount;
    private int groupAccountId;

    //Constructors
    public static GroupAccountRepository createGroupAccountRepository(GroupAccount groupAccount, int groupAccountId){
        return new GroupAccountRepository(groupAccount, groupAccountId);
    }

    private GroupAccountRepository(GroupAccount groupAccount, int groupAccountId) {
        this.groupAccount = groupAccount;
        this.groupAccountId = groupAccountId;
    }

    //Gets
    public GroupAccount getGroupAccount() {
        return groupAccount;
    }

    public int getGroupAccountId() {
        return groupAccountId;
    }

    //Sets
    public void setGroupAccount(GroupAccount groupAccount) {
        this.groupAccount = groupAccount;
    }

    public void setGroupAccountId(int groupAccountId) {
        this.groupAccountId = groupAccountId;
    }

    //Override
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GroupAccountRepository)) return false;
        GroupAccountRepository that = (GroupAccountRepository) o;
        return groupAccountId == that.groupAccountId &&
                Objects.equals(groupAccount, that.groupAccount);
    }

}

