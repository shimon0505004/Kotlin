/**
 * In kotlin, you can add new members to any class with the extension mechanism.
 * Namely, there are two types of extensions. extension functions and extension properties.
 * They look a lot like normal functions and properties.
 * But with one important difference. You need to specify the type that you extend.
 */

data class Item(val name: String, val price: Float)
data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxBy { it.price }?.price ?: 0F
fun Order.maxPricedItemName(): String = this.items.maxBy { it.price }?.name ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames: String
    get() = items.map{ it.name }.joinToString()

fun main() {
    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))
    println("Max priced item name: ${order.maxPricedItemName()}")
    println("Max priced item name: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")
}