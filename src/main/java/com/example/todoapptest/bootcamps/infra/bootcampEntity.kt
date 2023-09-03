package com.example.todoapptest.bootcamps

import jakarta.persistence.*
import java.math.BigDecimal
import java.time.LocalDate

@Entity
@Table(name = "bootcamps")
data class BootcampRequestEntity(
    @Id
    val code: String,
    val name: String,
    val comment: String,
    val location: String,
    val startDate: LocalDate,
    val endDate: LocalDate,
    val duration: Int,
    val instructors: String,
    val price: BigDecimal,
    val capacity: Int,
    val prerequisites: String,
    val rating: BigDecimal,
)
