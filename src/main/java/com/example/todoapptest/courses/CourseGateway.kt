package com.example.todoapptest.courses

import org.springframework.http.ResponseEntity

interface CourseGateway {
    fun save(course: CourseModel): CourseModel
    fun findById(id: Long): CourseModel?
    fun findAll(): List<CourseModel>
    fun update(course: CourseModel): CourseModel
    fun delete(id: Long): ResponseEntity<Void>
}
