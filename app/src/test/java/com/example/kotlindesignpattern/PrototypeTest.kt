package com.example.kotlindesignpattern

import com.example.kotlindesignpattern.prototype.MessageBox
import com.example.kotlindesignpattern.prototype.UnderlinePen
import com.example.kotlindesignpattern.prototype.framework.Manager
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Test

class PrototypeTest {
    @Test
    fun `実行テスト`() {
        val manager = Manager().apply {
            register("strong", UnderlinePen('~'))
            register("warning", MessageBox('*'))
            register("slash", MessageBox('/'))
        }

        val message = "Hello, World"

        val p1 = manager.create("strong")
        assertNotNull(p1)
        val expect1 = StringBuilder().apply {
            appendLine("\"$message\"")
            appendLine(" ~~~~~~~~~~~~ ")
        }.toString()
        assertEquals(expect1, p1!!.use(message))

        val p2 = manager.create("warning")
        assertNotNull(p2)
        val expect2 = StringBuilder().apply {
            appendLine("****************")
            appendLine("* $message *")
            appendLine("****************")
        }.toString()
        assertEquals(expect2, p2!!.use(message))

        val p3 = manager.create("slash")
        assertNotNull(p3)
        val expect3 = StringBuilder().apply {
            appendLine("////////////////")
            appendLine("/ $message /")
            appendLine("////////////////")
        }.toString()
        assertEquals(expect3, p3!!.use(message))
    }
}