package com.example.kotlindesignpattern.prototype

import com.example.kotlindesignpattern.prototype.framework.Product

data class UnderlinePen(
    private val decoChar: Char,
) : Product {
    override fun use(s: String): String =
        StringBuilder().apply {
            // 表示文字列の左右のスペース分も含めて確保
            val underLength = s.toByteArray().size
            appendLine("\"$s\"")
            appendLine(" ${decoChar.toString().repeat(underLength)} ")
        }.toString()

    override fun cloneProduct(): Product = this.copy()
}
