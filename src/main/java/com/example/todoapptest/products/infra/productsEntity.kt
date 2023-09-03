package com.example.todoapptest.products

import com.example.todoapptest.products.core.Product
import jakarta.persistence.*
import java.math.BigDecimal
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId

@Entity
@Table(name = "products")
data class ProductEntity(
    @Id
    val code: String,
    val description: String,
    val price: BigDecimal,
)



