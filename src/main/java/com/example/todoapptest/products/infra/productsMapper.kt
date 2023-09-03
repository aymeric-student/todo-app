package com.example.todoapptest.products.infra

import com.example.todoapptest.products.ProductEntity
import com.example.todoapptest.products.core.Product

fun ProductEntity.toProduct() =
    Product(
        code = this.code,
        description = this.description,
        price = this.price,
    )

fun Product.toProductEntity() =
    ProductEntity(
        code =  this.code,
        description = this.description,
        price = this.price,
    )
