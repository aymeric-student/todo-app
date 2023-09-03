package com.example.todoapptest.bootcamps.infra

import com.example.todoapptest.bootcamps.BootcampRequestEntity
import com.example.todoapptest.bootcamps.core.BootcampModel

fun BootcampRequestEntity.toBootcampModel() =
    BootcampModel(
        code = this.code,
        name = this.name,
        comment = this.comment,
        location = this.location,
        startDate = this.startDate,
        endDate = this.endDate,
        duration = this.duration,
        instructors = this.instructors,
        price = this.price,
        capacity = this.capacity,
        prerequisites = this.prerequisites,
        rating = this.rating,
    )

fun BootcampModel.toBootcampEntity() =
    BootcampRequestEntity(
        code = this.code ?: "",
        name = this.name,
        comment = this.comment,
        location = this.location,
        startDate = this.startDate,
        endDate = this.endDate,
        duration = this.duration,
        instructors = this.instructors,
        price = this.price,
        capacity = this.capacity,
        prerequisites = this.prerequisites,
        rating = this.rating,
    )
