package com.example.kotlindesignpattern

import com.example.kotlindesignpattern.singleton.Singleton
import junit.framework.Assert.assertTrue
import org.junit.Test

class SingletonTest {
    @Test
    fun `実行テスト`() {
        val singletonObject1 = Singleton
        val singletonObject2 = Singleton
        assertTrue(singletonObject1 == singletonObject2)
    }
}