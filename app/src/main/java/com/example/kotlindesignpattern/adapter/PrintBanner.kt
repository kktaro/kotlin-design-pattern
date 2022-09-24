package com.example.kotlindesignpattern.adapter

class PrintBanner(string: String) : Banner(string), Print {
    override fun getWeek(): String = getWithParen()
    override fun getStrong(): String = getWithAster()
}