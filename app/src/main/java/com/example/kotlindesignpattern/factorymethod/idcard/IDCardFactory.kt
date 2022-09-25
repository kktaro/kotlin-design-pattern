package com.example.kotlindesignpattern.factorymethod.idcard

import com.example.kotlindesignpattern.factorymethod.framework.Factory
import com.example.kotlindesignpattern.factorymethod.framework.Product

class IDCardFactory : Factory() {
    val owners: MutableList<String> = mutableListOf()

    override fun createProduct(owner: String): Product {
        return IDCard(owner)
    }

    override fun registerProduct(product: Product) {
        if  (product is IDCard) owners.add(product.owner)
    }
}