package com.example.todoapptest.bootcamps.core

import com.example.todoapptest.products.infra.ProductRepositoryJpaImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BootcampServiceImpl(@Autowired private var bootcampGateway: bootcampGateway)  {
         fun getBootcampByCode(code: String): BootcampModel? {
            return bootcampGateway.findByCode(code)
        }

         fun getAllBootcamps(): List<BootcampModel> {
            return bootcampGateway.findAll()
        }

         fun createBootcamp(bootcamp: BootcampModel): BootcampModel {
            return bootcampGateway.save(bootcamp)
        }

         fun deleteBootcampByCode(code: String) {
            return bootcampGateway.deleteByCode(code)
        }
}
