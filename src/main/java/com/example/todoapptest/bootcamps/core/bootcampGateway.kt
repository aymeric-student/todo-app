package com.example.todoapptest.bootcamps.core

interface bootcampGateway {
    fun findByCode(code: String): BootcampModel?
    fun findAll(): List<BootcampModel>
    fun save(bootcamp: BootcampModel): BootcampModel
    fun deleteByCode(code: String)
}