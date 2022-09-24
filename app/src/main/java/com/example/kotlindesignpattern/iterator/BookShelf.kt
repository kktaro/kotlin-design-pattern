package com.example.kotlindesignpattern.iterator

data class BookShelf(
    private val books: List<Book>
) : Aggregate<Book> {
    val lastIndex = books.size - 1

    fun getAt(index: Int): Book = books[index]

    override fun iterator(): Iterator<Book> = BookShelfIterator(this)
}