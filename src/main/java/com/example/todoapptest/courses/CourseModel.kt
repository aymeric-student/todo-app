package com.example.todoapptest.courses

import java.time.Instant

data class CourseModel(
    val id: Long? = null,
    val title: String,
    val description: String? = null,
    val startDate: Instant?,
    val endDate: Instant?
)
