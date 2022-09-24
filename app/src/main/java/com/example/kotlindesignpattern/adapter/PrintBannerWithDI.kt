package com.example.kotlindesignpattern.adapter

class PrintBannerWithDI(
    private val string: String,
) : Print {
    private val banner = Banner(string)

    override fun getWeek(): String = banner.getWithParen()


    override fun getStrong(): String = banner.getWithAster()
}