package com.example.todoapptest.courses

import org.springframework.stereotype.Service


object CourseMapper {

    fun toModel(entity: CourseEntity): CourseModel = CourseModel(
        id = entity.id,
        title = entity.title,
        description = entity.description,
        startDate = entity.startDate,
        endDate = entity.endDate
    )

    fun toEntity(model: CourseModel) = CourseEntity(
        id = model.id ?: 0,
        title = model.title,
        description = model.description,
        startDate = model.startDate,
        endDate = model.endDate
    )
}