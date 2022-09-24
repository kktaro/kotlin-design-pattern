package com.example.kotlindesignpattern

import com.example.kotlindesignpattern.iterator.Book
import com.example.kotlindesignpattern.iterator.BookShelf
import org.junit.Assert.assertEquals
import org.junit.Test

class IteratorTest {
    @Test
    fun `実行テスト`() {
        val actual = listOf(
            "Around the World in 80 Days",
            "Bible",
            "Cinderella",
            "Daddy-Long-Legs",
        )

        val bookShelf = BookShelf(actual.map { Book(it) })
        val iterator = bookShelf.iterator()

        val expect = mutableListOf<String>()
        while(iterator.hasNext()) {
            expect.add(iterator.next().name)
        }

        assertEquals(expect.size, actual.size)

        expect.forEachIndexed {index, name ->
            assertEquals(name, actual[index])
        }
    }
}