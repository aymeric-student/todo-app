package com.example.todoapptest.products.core

import com.example.todoapptest.products.infra.ProductRepositoryJpaImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl(@Autowired private var productGateway: ProductGateway)  {

     fun getProductByCode(code: String): Product? {
        return productGateway.findByCode(code)
    }

     fun getAllProducts(): List<Product> {
        return productGateway.findAll()
    }

     fun createProduct(product: Product): Product {
        return productGateway.save(product)
    }

     fun deleteProductByCode(code: String) {
        return productGateway.deleteByCode(code)
    }
}
