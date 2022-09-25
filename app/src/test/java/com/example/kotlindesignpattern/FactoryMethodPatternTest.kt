package com.example.kotlindesignpattern

import com.example.kotlindesignpattern.factorymethod.idcard.IDCardFactory
import org.junit.Assert.assertEquals
import org.junit.Test

class FactoryMethodPatternTest {
    @Test
    fun `実行テスト`() {
        val factory = IDCardFactory()
        val card1 = factory.create("user1")
        val card2 = factory.create("user2")
        val card3 = factory.create("user3")

        assertEquals("Use: user1", card1.use())
        assertEquals("Use: user2", card2.use())
        assertEquals("Use: user3", card3.use())
        assertEquals("user1", factory.owners[0])
        assertEquals("user2", factory.owners[1])
        assertEquals("user3", factory.owners[2])
    }
}