package com.example.kotlindesignpattern.iterator

interface Aggregate<T> {
    fun iterator(): Iterator<T>
}