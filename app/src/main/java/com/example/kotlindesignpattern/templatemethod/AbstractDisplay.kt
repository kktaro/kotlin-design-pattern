package com.example.kotlindesignpattern.templatemethod

abstract class AbstractDisplay {
    abstract fun open(): String
    abstract fun print(): String
    abstract fun close(): String
    fun display(): String {
        var result = ""
        result += open()
        for (i in 0..4) {
            result += print()
        }
        result += close()
        return result
    }
}