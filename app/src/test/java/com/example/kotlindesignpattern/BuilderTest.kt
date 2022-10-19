package com.example.kotlindesignpattern

import com.example.kotlindesignpattern.builder.Builder
import com.example.kotlindesignpattern.builder.Director
import com.example.kotlindesignpattern.builder.MarkDownBuilder
import com.example.kotlindesignpattern.builder.TextBuilder
import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Test

class BuilderTest {
    lateinit var director: Director

    @Test
    fun `TextBuilderテスト`() {
        director = Director(TextBuilder())
    }

    @Test
    fun `MarkDownBuilderテスト`() {
        director = Director(MarkDownBuilder())
    }

    @After
    fun commonTest() {
        when (director.builder) {
            is TextBuilder -> {
                val expect = StringBuilder().apply {
                    appendLine("==========")
                    appendLine(" [Greeting] ")
                    appendLine("")
                    appendLine("■朝から昼にかけて")
                    appendLine("")
                    appendLine("  ・おはようございます。")
                    appendLine("  ・こんにちは。")
                    appendLine("")
                    appendLine("■夜に")
                    appendLine("")
                    appendLine("  ・こんばんは。")
                    appendLine("  ・おやすみなさい。")
                    appendLine("  ・さようなら。")
                    appendLine("")
                    appendLine("==========")
                }.toString()
                director.construct()
                assertEquals(expect, director.builder.getResult())
            }
            is MarkDownBuilder -> {
                val expect = StringBuilder().apply {
                    appendLine("# Greeting")
                    appendLine("")
                    appendLine("朝から昼にかけて")
                    appendLine("")
                    appendLine("- おはようございます。")
                    appendLine("- こんにちは。")
                    appendLine("")
                    appendLine("夜に")
                    appendLine("")
                    appendLine("- こんばんは。")
                    appendLine("- おやすみなさい。")
                    appendLine("- さようなら。")
                    appendLine("")
                }.toString()
                director.construct()
                assertEquals(expect, director.builder.getResult())
            }
            else -> {
                assert(false)
            }
        }
    }

}