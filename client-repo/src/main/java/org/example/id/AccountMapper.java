package org.example.id;

public class AccountMapper {

    public static AccountDto toDto(AccountDao dao) {
        return new AccountDto(dao.id(), dao.remain());
    }
}
