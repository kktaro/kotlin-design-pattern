package com.example.kotlindesignpattern.builder

class MarkDownBuilder : Builder {
    private var stringBuilder = StringBuilder()

    override fun makeTitle(title: String) {
        stringBuilder.apply {
            appendLine("# $title")
            appendLine("")
        }
    }

    override fun makeString(str: String) {
        stringBuilder.apply {
            appendLine(str)
            appendLine("")
        }
    }

    override fun makeItems(items: List<String>) {
        stringBuilder.apply {
            items.forEach {
                appendLine("- $it")
            }
            appendLine("")
        }
    }

    override fun close() {
        // 何もしない
    }

    override fun getResult(): String = stringBuilder.toString()
}