package com.rooon.di;

public class AccountService {
    @Inject
    private AccountRepository accountRepository;

    public AccountDto getAccountById(Long id) {
        return AccountMapper.toDto(accountRepository.findById(id));
    }

    public void updateAccount() {
        System.out.println("accountService" + accountRepository.toString());
        accountRepository.save();
    }
}
