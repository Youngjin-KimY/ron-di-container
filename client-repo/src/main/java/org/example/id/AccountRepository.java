package org.example.id;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class AccountRepository {

    private final Map<Long, AccountDao> db = new HashMap<>();

    public AccountRepository() {
        db.put(1L, new AccountDao(1L, BigDecimal.valueOf(1000)));
        db.put(2L, new AccountDao(2L, BigDecimal.valueOf(2000)));
    }

    public void save() {
        System.out.println("save account");
    }

    public AccountDao findById(Long id) {
        return db.get(id);
    }
}
