package com.example.kotlindesignpattern.prototype

import com.example.kotlindesignpattern.prototype.framework.Product

data class MessageBox(
    private val decoChar: Char,
) : Product {
    override fun use(s: String): String =
        StringBuilder().apply {
            // 表示文字列の左右のスペース分も含めて確保
            val topBottomLength = s.toByteArray().size + 4
            appendLine(decoChar.toString().repeat(topBottomLength))
            appendLine("$decoChar $s $decoChar")
            appendLine(decoChar.toString().repeat(topBottomLength))
        }.toString()

    override fun cloneProduct(): Product = this.copy()
}