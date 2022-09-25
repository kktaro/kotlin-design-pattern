package com.example.kotlindesignpattern.templatemethod

class CharDisplay(
    private val ch: Char,
) : AbstractDisplay() {
    override fun open(): String {
        return "<<"
    }

    override fun print(): String {
        return ch.toString()
    }

    override fun close(): String {
        return ">>"
    }
}