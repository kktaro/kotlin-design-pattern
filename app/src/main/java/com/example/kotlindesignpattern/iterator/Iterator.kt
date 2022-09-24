package com.example.kotlindesignpattern.iterator

interface Iterator<T> {
    fun hasNext(): Boolean
    fun next(): T
}