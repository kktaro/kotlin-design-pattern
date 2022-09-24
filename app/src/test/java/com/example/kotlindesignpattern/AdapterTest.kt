package com.example.kotlindesignpattern

import com.example.kotlindesignpattern.adapter.PrintBanner
import com.example.kotlindesignpattern.adapter.PrintBannerWithDI
import org.junit.Assert.assertEquals
import org.junit.Test

class AdapterTest {
    @Test
    fun `実行テスト`() {
        val showString = "Hello"
        val printBanner = PrintBanner(showString)
        assertEquals(printBanner.getWeek(), "($showString)")
        assertEquals(printBanner.getStrong(), "*$showString*")

        val printBannerWithDI = PrintBannerWithDI(showString)
        assertEquals(printBannerWithDI.getWeek(), "($showString)")
        assertEquals(printBannerWithDI.getStrong(), "*$showString*")
    }
}