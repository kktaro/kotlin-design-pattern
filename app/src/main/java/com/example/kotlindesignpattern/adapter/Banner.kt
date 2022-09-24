package com.example.kotlindesignpattern.adapter

open class Banner(
    private val string: String,
) {
    fun getWithParen(): String = "($string)"
    fun getWithAster(): String = "*$string*"
}
