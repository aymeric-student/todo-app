package com.example.todoapptest.courses

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class CourseService(private val courseRepository: CourseEntityRepository) : CourseGateway {

    override fun save(course: CourseModel): CourseModel {
        val savedEntity = courseRepository.save(CourseMapper.toEntity(course))
        return CourseMapper.toModel(savedEntity)
    }

    override fun findById(id: Long): CourseModel? {
        val courseEntity = courseRepository.findById(id).orElse(null)
        return courseEntity?.let { CourseMapper.toModel(it) }
    }

    override fun findAll(): List<CourseModel> {
        val courses = courseRepository.findAll()
        return courses.map { CourseMapper.toModel(it) }
    }

    override fun update(course: CourseModel): CourseModel {
        if (course.id == null) {
            throw IllegalArgumentException("Course ID cannot be null for update.")
        }
        val existingEntity = courseRepository.findById(course.id).orElse(null)
            ?: throw IllegalArgumentException("Course with ID ${course.id} not found.")

        val updatedEntity = courseRepository.save(CourseMapper.toEntity(course))
        return CourseMapper.toModel(updatedEntity)
    }

    override fun delete(id: Long): ResponseEntity<Void> {
        if (courseRepository.existsById(id)) {
            courseRepository.deleteById(id)
            return ResponseEntity(HttpStatus.NO_CONTENT)
        }
        return ResponseEntity(HttpStatus.NOT_FOUND)
    }
}
