package org.example.id;

import com.rooon.di.inject.ContainerService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountServiceTest {

    @Test
    public void diTest() {
        AccountService accountService = ContainerService.getObject(AccountService.class);
        AccountDetailService accountDetailService = ContainerService.getObject(AccountDetailService.class);
        System.out.println(accountService.getAccountById(1L));
        accountService.updateAccount();
        System.out.println( "Hello World!\n" );
        accountDetailService.updateAccountInfo();
    }

}