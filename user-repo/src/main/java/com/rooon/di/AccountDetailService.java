package com.rooon.di;

public class AccountDetailService {

    @Inject
    private AccountRepository accountRepository;

    @Inject
    private AccountDetailRepository accountDetailRepository;

    public void updateAccountInfo() {
        accountRepository.save();
        System.out.println("accountDetailService_accountRepository" + accountRepository.toString());
        accountDetailRepository.save();
        System.out.println("accountDetailService_accountDetailRepository" + accountDetailRepository.toString());
    }
}
