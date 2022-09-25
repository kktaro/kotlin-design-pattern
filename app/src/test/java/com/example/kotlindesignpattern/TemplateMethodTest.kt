package com.example.kotlindesignpattern

import com.example.kotlindesignpattern.templatemethod.CharDisplay
import com.example.kotlindesignpattern.templatemethod.StringDisplay
import org.junit.Assert.assertEquals
import org.junit.Test

class TemplateMethodTest {
    @Test
    fun `CharDisplayテスト`() {
        val expected = "<<HHHHH>>"
        val charDisplay = CharDisplay('H')
        assertEquals(expected, charDisplay.display())
    }

    @Test
    fun `StringDisplayテスト`() {
        val inputString = "こんにちは"
        val expected = buildString {
            appendLine("+---------------+")
            appendLine("|$inputString|")
            appendLine("|$inputString|")
            appendLine("|$inputString|")
            appendLine("|$inputString|")
            appendLine("|$inputString|")
            appendLine("+---------------+")
        }
        val stringDisplay = StringDisplay(inputString)
        assertEquals(expected, stringDisplay.display())
    }
}