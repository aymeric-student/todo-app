package com.example.todoapptest.courses

/*
import org.springframework.stereotype.Repository

@Repository
class JpaCourseRepository(val courseRepository: CourseEntityRepository) : CourseGateway {

    override fun save(course: CourseModel): CourseModel {
        return courseRepository.save(course.toEntity()).toModel()
    }

    override fun findById(id: Long): CourseModel? {
        return courseRepository.findById(id).orElse(null)?.toModel()
    }

    override fun findAll(): List<CourseModel> {
        return courseRepository.findAll().map { it.toModel() }
    }

    override fun update(course: CourseModel): CourseModel {
        val existingCourseEntity = courseRepository.findById(course.id ?: 0L)
            .orElseThrow { IllegalArgumentException("Course with id ${course.id} not found") }

        existingCourseEntity.title = course.title
        existingCourseEntity.description = course.description
        existingCourseEntity.startDate = course.startDate?.let { Date.from(it) }
        existingCourseEntity.endDate = course.endDate?.let { Date.from(it) }

        return courseRepository.save(existingCourseEntity).toModel()
    }
}
*/
