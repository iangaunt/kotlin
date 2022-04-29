/* 
    Programming Basics -> Booleans
*/

/* 1. Booleans/Task1.kt
   Guess the answers for the following boolean expressions and then check yourself using Kotlin. */
class bl_1() {
    // (178 + 131 > 209 + 99) && false
    val a: Boolean = (178 + 131 > 209 + 99) && false

    // 1 > 2 || 1 < 2
    val b: Boolean = 1 > 2 || 1 < 2

    // (111 - 101 >= 10) && (11.0 > 10.99) && true
    val c: Boolean = (111 - 101 >= 10) && (11.0 > 10.99) && true
}

/* 2. Booleans/Task2.kt
   Create a "truth table" for && and ||. */
class bt_2() {
    fun showAnd(first: Boolean, second:Boolean) {
        println("$first && $second == ${first && second}")
    }
    
    fun showOr(first: Boolean, second: Boolean) {
        println("$first || $second == ${first || second}")
    }
    
    fun showTruthTable() {
        showAnd(true, true)
        showAnd(false, true)
        showAnd(true, false)
        showAnd(false, false)
    
        showOr(true, true)
        showOr(false, true)
        showOr(true, false)
        showOr(false, false)
    }
    
    fun main() {
        showTruthTable()
    }
}

/* 3. Booleans/Task3.kt
   Using only if expressions, write the functions and() and or(). */
class bt_3() {
    fun and(b1: Boolean, b2: Boolean): Boolean {
        return b1 && b2
    }

    fun or(b1: Boolean, b2: Boolean): Boolean {
        return b1 || b2
    }

    fun main() {
        println(and(true, true)) // true
        println(or(true, false)) // true
    }
}