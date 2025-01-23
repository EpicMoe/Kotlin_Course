import kotlin.properties.Delegates

/**
 * Numbers
 *
 * Int: Represents a 32-bit integer.
 *
 * Long: Represents a 64-bit integer.
 *
 * Short: Represents a 16-bit integer.
 *
 * Byte: Represents an 8-bit integer.
 *
 * Double: Represents a 64-bit floating-point number.
 *
 * Float: Represents a 32-bit floating-point number.
 *
 * Characters
 *
 * Char: Represents a single character, like 'A'.
 *
 * Boolean: Represents a binary value, either true or false.
 *
 * String: Represents a sequence of characters.
 *
 * Collections
 *
 * Array: Represents a collection of elements of the same type.
 *
 * List: Represents an ordered collection of elements (can be mutable or immutable).
 *
 * Set: Represents an unordered collection of unique elements (can be mutable or immutable).
 *
 * Map: Represents a collection of key-value pairs (can be mutable or immutable).
 *
 * Nullable Types:
 * In Kotlin, any type can be marked as nullable by appending a question mark (?) to its type,
 * which allows it to hold a null value. For example, String? can hold either a string value or null.
 */
fun main() {
    val varriable = 12
    var varriable2 = 12
    val val_boolean = true
    val val_char: Char = 'M'
    val val_number: Float = 2.32F
    val val_number2: Double = 2.322
    val val_number3: Byte = 2
    var number4 = 2.3
    print("$number4")


    val myArray: Array<Char> = arrayOf('M', 'V')

    // A Set is a collection that does not allow duplicate elements.
    val mySet: Set<String> = setOf("apple", "banana", "orange", "apple")

    // A Map is a collection of key-value pairs, where each key is unique.
    val myMap: Map<String, Int> = mapOf("apple" to 1, "banana" to 2, "orange" to 3)

    // A List is an ordered collection that can contain duplicate elements.
    val myList: List<String> = listOf("apple", "banana", "orange", "apple")

    var number_null: Float? = null
    val characters_null: Array<Char>? = null
    // if we want to force something with null exception this is how we can do it  ( !! )

    //print(number4 * number_null!!)
    //print(number_null!! * 2 )

    var  test by Delegates.notNull<Int>()
    // it's not creating a variable write now but when ever we give this variable
    // a value it's going to create on the Memory

}