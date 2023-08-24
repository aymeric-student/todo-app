package com.example.todoapptest.dto

import java.util.Date

data class TodoModel(
    val id: Long = 0,
    var title: String = "",
    var description: String = "",
    var progress: Boolean = false,
    val createdAt: Date? = null,
    var updatedAt: Date? = null
)
