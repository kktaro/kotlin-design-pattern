package com.example.kotlindesignpattern.singleton

import java.time.LocalDateTime

object Singleton {
    val createdAt = LocalDateTime.now()

    fun write(): String = "write"
}