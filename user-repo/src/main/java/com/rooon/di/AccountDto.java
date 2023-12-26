package com.rooon.di;

import java.math.BigDecimal;

public record AccountDto(
        Long id, BigDecimal money
){}
