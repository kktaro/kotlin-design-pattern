package com.example.kotlindesignpattern.builder

interface Builder {
    fun makeTitle(title: String)
    fun makeString(str: String)
    fun makeItems(items: List<String>)
    fun close()
    fun getResult(): String
}