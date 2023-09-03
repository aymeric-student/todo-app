package com.example.todoapptest.bootcamps.infra

import com.example.todoapptest.bootcamps.core.bootcampGateway
import org.springframework.stereotype.Repository
import com.example.todoapptest.bootcamps.core.BootcampModel

@Repository
open class bootcampRepositoryJPA(private val DBBootcampRepository: DBBootcampRepository) : bootcampGateway {
    override fun findByCode(code: String): BootcampModel? {
        val entity = DBBootcampRepository.findById(code).orElse(null)
        return entity?.toBootcampModel()
    }

    override fun findAll(): List<BootcampModel> {
        return DBBootcampRepository.findAll().map { it.toBootcampModel() }
    }

    override fun save(bootcamp: BootcampModel): BootcampModel {
        val savedEntity = DBBootcampRepository.save(bootcamp.toBootcampEntity())
        return savedEntity.toBootcampModel()
    }

    override fun deleteByCode(code: String) {
        DBBootcampRepository.deleteById(code)
    }
}