package com.example.kotlindesignpattern.prototype.framework

class Manager {
    private val showcase = HashMap<String, Product>()

    fun register(name: String, proto: Product) {
        showcase[name] = proto
    }

    fun create(protoName: String): Product? {
        val p = showcase[protoName]
        return p?.cloneProduct()
    }
}