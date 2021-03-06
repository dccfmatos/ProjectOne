package model;

import mainPackage.model.GroupAccount;
import mainPackage.model.GroupAccountRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupAccountRepositoryTest {

    @Test
    @DisplayName("Verify GroupAccountRepository constructor || Equals")
    public void groupAccountRepositoryConstructorEquals() {

        // Arrange
        //Create new group account to be used to create group account repositories
        GroupAccount groupAccount = GroupAccount.createGroupAccount("groupAccount Denomination", "groupAccount description");
        int id = 123;

        // Act
        //create 2 objects groupAccountRepository
        GroupAccountRepository groupAccountRepository = GroupAccountRepository.createGroupAccountRepository(groupAccount, 123);
        GroupAccountRepository groupAccountRepository2 = GroupAccountRepository.createGroupAccountRepository(groupAccount, id);

        // Assert
        //Verify if constructor works fine and if object is the same
        assertEquals(groupAccountRepository, groupAccountRepository2);
    }

    @Test
    @DisplayName("Verify getGroupAccountId() of groupAccountRepository || Equals")
    public void accountGetAccountId() {

        // Arrange
        GroupAccount groupAccount = GroupAccount.createGroupAccount("groupAccount Denomination", "groupAccount description");
        int id = 123;

        // Act
        //create object groupAccountRepository
        GroupAccountRepository groupAccountRepository = GroupAccountRepository.createGroupAccountRepository(groupAccount, 123);

        // Assert
        //Verify getter method
        assertEquals(id, groupAccountRepository.getGroupAccountId());
    }

    @Test
    @DisplayName("Verify getGroupAccount() of groupAccountRepository || Equals")
    public void accountGetGroupAccount()  {

        // Arrange
        GroupAccount groupAccount = GroupAccount.createGroupAccount("groupAccount Denomination", "groupAccount description");
        int id = 123;

        // Act
        //create object groupAccountRepository
        GroupAccountRepository groupAccountRepository = GroupAccountRepository.createGroupAccountRepository(groupAccount, id);

        // Assert
        //Verify getter method
        assertEquals(groupAccount, groupAccountRepository.getGroupAccount());
    }

    @Test
    @DisplayName("Verify setGroupAccount() of groupAccountRepository || Equals")
    public void accountSetGroupAccount() {

        // Arrange
        //create objects groupAccount
        GroupAccount groupAccount = GroupAccount.createGroupAccount("groupAccount Denomination", "groupAccount description");
        int id = 123;

        GroupAccount groupAccount2 = GroupAccount.createGroupAccount("groupAccount Denomination2", "groupAccount description2");
        int id2 = 1234;

        // Act
        //create object groupAccountRepository
        GroupAccountRepository groupAccountRepository = GroupAccountRepository.createGroupAccountRepository(groupAccount, id);

        //change parameters for groupAccountRepository using method set()
        groupAccountRepository.setGroupAccount(groupAccount2);
        groupAccountRepository.setGroupAccountId(id2);

        // Assert
        //verify setter method
        assertEquals(groupAccount2, groupAccountRepository.getGroupAccount());
    }

    @Test
    @DisplayName("Verify setGroupAccountId() of groupAccountRepository || Equals")
    public void accountSetGroupAccountId() {

        // Arrange
        //create objects groupAccount
        GroupAccount groupAccount = GroupAccount.createGroupAccount("groupAccount Denomination", "groupAccount description");
        int id = 123;

        GroupAccount groupAccount2 = GroupAccount.createGroupAccount("groupAccount Denomination2", "groupAccount description2");
        int id2 = 1234;

        // Act
        //create object groupAccountRepository
        GroupAccountRepository groupAccountRepository = GroupAccountRepository.createGroupAccountRepository(groupAccount, id);

        //change parameters for groupAccountRepository using method set()
        groupAccountRepository.setGroupAccount(groupAccount2);
        groupAccountRepository.setGroupAccountId(id2);

        // Assert
        //verify setter method
        assertEquals(id2, groupAccountRepository.getGroupAccountId());
    }

}