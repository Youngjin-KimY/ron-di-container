package org.example.id;

import java.math.BigDecimal;

public record AccountDto(
        Long id, BigDecimal money
){}
