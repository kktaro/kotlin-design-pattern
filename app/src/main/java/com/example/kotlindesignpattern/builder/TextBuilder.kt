package com.example.kotlindesignpattern.builder

class TextBuilder : Builder {
    private var stringBuilder = StringBuilder()

    override fun makeTitle(title: String) {
        stringBuilder.apply {
            appendLine("==========")
            appendLine(" [$title] ")
            appendLine("")
        }
    }

    override fun makeString(str: String) {
        stringBuilder.apply {
            appendLine("■$str")
            appendLine("")
        }
    }

    override fun makeItems(items: List<String>) {
        stringBuilder.apply {
            items.forEach {
                appendLine("  ・$it")
            }
            appendLine("")
        }
    }

    override fun close() {
        stringBuilder.appendLine("==========")
    }

    override fun getResult(): String = stringBuilder.toString()
}