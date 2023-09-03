package com.example.todoapptest.products.infra

import com.example.todoapptest.products.core.Product
import com.example.todoapptest.products.core.ProductGateway
import org.springframework.stereotype.Repository

@Repository
open class ProductRepositoryJpaImpl(private val dbProductRepository: DBProductRepository) : ProductGateway {

    override fun findByCode(code: String): Product? {
        val entity = dbProductRepository.findById(code).orElse(null)
        return entity?.toProduct()
    }

    override fun findAll(): List<Product> {
        return dbProductRepository.findAll().map { it.toProduct() }
    }

    override fun save(product: Product): Product {
        val savedEntity = dbProductRepository.save(product.toProductEntity())
        return savedEntity.toProduct()
    }

    override fun deleteByCode(code: String) {
            dbProductRepository.deleteById(code)
    }
}
