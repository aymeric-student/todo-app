package com.example.todoapptest.bootcamps.infra

import com.example.todoapptest.bootcamps.BootcampRequestEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DBBootcampRepository : JpaRepository<BootcampRequestEntity, String>