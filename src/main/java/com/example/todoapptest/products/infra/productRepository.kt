package com.example.todoapptest.products.infra

import com.example.todoapptest.products.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DBProductRepository : JpaRepository<ProductEntity, String>