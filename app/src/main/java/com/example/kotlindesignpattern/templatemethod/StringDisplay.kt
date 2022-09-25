package com.example.kotlindesignpattern.templatemethod

class StringDisplay(
    private val string: String,
) : AbstractDisplay() {
    private val length = string.toByteArray().size

    override fun open(): String {
        return printLine()
    }

    override fun print(): String {
        return "|$string|\n"
    }

    override fun close(): String {
        return printLine()
    }

    private fun printLine(): String {
        return "+${"-".repeat(length)}+\n"
    }
}