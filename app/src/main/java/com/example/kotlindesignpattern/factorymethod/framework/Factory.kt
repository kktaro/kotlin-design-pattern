package com.example.kotlindesignpattern.factorymethod.framework

abstract class Factory {
    fun create(owner: String): Product {
        val product: Product = createProduct(owner)
        registerProduct(product)
        return product
    }
    protected abstract fun createProduct(owner: String): Product
    protected abstract fun registerProduct(product: Product)
}