package com.example.todoapptest.courses

import org.springframework.data.jpa.repository.JpaRepository

interface CourseEntityRepository : JpaRepository<CourseEntity, Long>
