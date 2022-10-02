package com.example.kotlindesignpattern.prototype.framework

interface Product {
    fun use(s: String): String
    fun cloneProduct(): Product
}