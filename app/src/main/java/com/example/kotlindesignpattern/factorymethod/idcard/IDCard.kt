package com.example.kotlindesignpattern.factorymethod.idcard

import com.example.kotlindesignpattern.factorymethod.framework.Product

data class IDCard(
    val owner: String,
) : Product {
    override fun use(): String {
        return "Use: $owner"
    }
}
