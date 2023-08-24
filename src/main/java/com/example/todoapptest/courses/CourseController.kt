package com.example.todoapptest.courses

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/courses")
class CourseController(private val courseService: CourseService) {

    @GetMapping("/{id}")
    fun getCourseById(@PathVariable("id") id: Long): ResponseEntity<CourseModel> {
        val course = courseService.findById(id)
        return course?.let {
            ResponseEntity.ok(it)
        } ?: ResponseEntity(HttpStatus.NOT_FOUND)
    }

    @GetMapping
    fun getAllCourses(): ResponseEntity<List<CourseModel>> {
        val courses = courseService.findAll()
        return ResponseEntity.ok(courses)
    }

    @PostMapping
    fun createCourse(@RequestBody courseModel: CourseModel): ResponseEntity<CourseModel> {
        val savedCourse = courseService.save(courseModel)
        return ResponseEntity(savedCourse, HttpStatus.CREATED)
    }

    @PutMapping("/{id}")
    fun updateCourse(@PathVariable id: Long, @RequestBody courseModel: CourseModel): ResponseEntity<CourseModel> {
        if (courseService.findById(id) == null) {
            return ResponseEntity(HttpStatus.NOT_FOUND)
        }
        val updatedCourse = courseService.save(courseModel.copy(id = id))
        return ResponseEntity(updatedCourse, HttpStatus.OK)
    }

    @DeleteMapping("/{id}")
    fun deleteCourse(@PathVariable id: Long): ResponseEntity<Void> {
        val course = courseService.findById(id) ?: return ResponseEntity(HttpStatus.NOT_FOUND)
        courseService.save(course.copy(description = null, endDate = null, startDate = null, title = ""))
        return ResponseEntity(HttpStatus.NO_CONTENT)
    }
}
