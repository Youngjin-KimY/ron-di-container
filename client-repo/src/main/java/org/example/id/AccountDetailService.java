package org.example.id;

import com.rooon.di.inject.Inject;

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
