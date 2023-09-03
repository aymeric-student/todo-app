package com.example.todoapptest.bootcamps.infra

import com.example.todoapptest.bootcamps.core.BootcampModel
import com.example.todoapptest.bootcamps.core.BootcampServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/bootcamps")
class BootcampController(@Autowired private val bootcampServiceImpl: BootcampServiceImpl) {

    @GetMapping("/{code}")
    fun getBootcampByCode(@PathVariable code: String): ResponseEntity<BootcampModel> {
        val bootcamp = bootcampServiceImpl.getBootcampByCode(code)
        return if (bootcamp != null) {
            ResponseEntity.ok(bootcamp)
        } else {
            ResponseEntity.status(HttpStatus.NOT_FOUND).build()
        }
    }

    @GetMapping("/")
    fun getAllBootcamps(): ResponseEntity<List<BootcampModel>> {
        val bootcamps = bootcampServiceImpl.getAllBootcamps()
        return ResponseEntity.ok(bootcamps)
    }

    @PostMapping("/")
    fun createBootcamp(@RequestBody bootcamp: BootcampModel): ResponseEntity<BootcampModel> {
        val createdBootcamp = bootcampServiceImpl.createBootcamp(bootcamp)
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBootcamp)
    }

    @DeleteMapping("/{code}")
    fun deleteBootcampByCode(@PathVariable code: String): ResponseEntity<Void> {
            bootcampServiceImpl.deleteBootcampByCode(code)
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build()
    }
}
