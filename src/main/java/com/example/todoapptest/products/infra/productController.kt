package com.example.todoapptest.products.infra

import com.example.todoapptest.products.core.Product
import com.example.todoapptest.products.core.ProductServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/products")
class ProductController(@Autowired private val productService: ProductServiceImpl) {

    @GetMapping("/{code}")
    fun getProductByCode(@PathVariable code: String): ResponseEntity<Product> {
        val product = productService.getProductByCode(code)
        return if (product != null) {
            ResponseEntity.ok(product)
        } else {
            ResponseEntity.status(HttpStatus.NOT_FOUND).build()
        }
    }

    @GetMapping("/")
    fun getAllProducts(): ResponseEntity<List<Product>> {
        val products = productService.getAllProducts()
        return ResponseEntity.ok(products)
    }

    @PostMapping("/")
    fun createProduct(@RequestBody product: Product): ResponseEntity<Product> {
        val createdProduct = productService.createProduct(product)
        return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct)
    }

    @DeleteMapping("/{code}")
    fun deleteProductByCode(@PathVariable code: String): ResponseEntity<Void> {
            productService.deleteProductByCode(code)
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build()
    }
}
