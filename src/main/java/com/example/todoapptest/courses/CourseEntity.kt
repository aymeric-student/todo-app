package com.example.todoapptest.courses

import jakarta.persistence.*
import java.time.Instant

@Entity
@Table(name = "courses")
data class CourseEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val title: String,
    val description: String? = null,
    val startDate: Instant? = null,
    val endDate: Instant? = null
)
