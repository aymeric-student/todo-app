package com.example.todoapptest.bootcamps.core

import java.math.BigDecimal
import java.time.LocalDate

data class BootcampModel(
    val code: String? = null,
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