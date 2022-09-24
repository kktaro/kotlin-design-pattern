package com.example.kotlindesignpattern.iterator

data class BookShelfIterator(
    private val bookShelf: BookShelf
) : Iterator<Book> {
    private var index = 0

    override fun hasNext(): Boolean = bookShelf.lastIndex >= index

    override fun next(): Book {
        val book = bookShelf.getAt(index)
        index++
        return book
    }
}