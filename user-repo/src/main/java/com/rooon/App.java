package com.rooon;

import com.rooon.di.AccountDetailService;
import com.rooon.di.AccountService;
import com.rooon.di.ContainerService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AccountService accountService = ContainerService.getObject(AccountService.class);
        AccountDetailService accountDetailService = ContainerService.getObject(AccountDetailService.class);
        System.out.println(accountService.getAccountById(1L));
        accountService.updateAccount();
        System.out.println( "Hello World!\n" );
        accountDetailService.updateAccountInfo();
    }
}
