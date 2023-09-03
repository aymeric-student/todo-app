package com.example.todoapptest.products.core


interface ProductGateway {
    fun findByCode(code: String): Product?
    fun findAll(): List<Product>
    fun save(product: Product): Product
    fun deleteByCode(code: String)
}
