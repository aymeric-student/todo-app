package com.example.todoapptest.products.core

import java.math.BigDecimal

data class Product(
    val code: String,
    val description: String,
    val price: BigDecimal,
)