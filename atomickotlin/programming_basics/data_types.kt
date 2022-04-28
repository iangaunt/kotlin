/* 
    Programming Basics -> Data Types
*/

/* 1. DataTypes/Task1.kt
   Define a val answer and set its value to 42, then to 43. Display the value of answer on the console. */
fun dt_1() {
    var answer = 42
    // answer = "unknown"

    println("Kotlin: Type mismatch: inferred type is String but Int was expected")
}

/* 2. DataTypes/Task2.kt 
   On the console, display the name of the type that can be combined with any other type if it goes first. */
fun main() {
    val int: Int = 10
    val double: Double = 1.1
    val boolean: Boolean = false
    val string: String = "abc"
    val character: Char = 'a'
  
    // Can be combined:
    // String can be combined with every other type:
    val si: String = string + int
    val sd: String = string + double
    val sb: String = string + boolean
    val sc: String = string + character
  
    val d1: Double = int + double
    val d2: Double = double + int
    val s1: String = character + string
    val c1: Char = character + int
  
    println("The type that can be combined " + "with every other type using '+':")
    println("String")
  
    // Can't be combined:
    // val bb = boolean + boolean
    // val ic = int + character
    // val ds = double + string
}  

/* 3. DataTypes/Task3.kt
   Guess the results of the following expressions and then check your guesses using Kotlin: */
fun dt_3() {
    // 'a' + 1
    val c1 = 'b'

    // 'a' + 25
    val c2 = 'z'

    // 'E' - 2
    val c3 = 'C'
}


/* 4. DataTypes/Task4.kt
   Check the types of all declared variables in the example. */
fun dt_4() {
    val whole = 11
    val fractional = 1.4
    val trueOrFalse = true
    val words = "A value"
    val character = 'z'
    val lines = """Triple quotes let
    you have many lines
    in your string"""

    println(whole)
    println(fractional)
    println(trueOrFalse)
    println(words)
    println(character)
    println(lines)
}

/* 5. DataTypes/Task5.kt 
   Different intention actions are available in different contexts, depending on where you put the caret. */
fun main() {
    val s = "Sally" + 5.9
    println(s)
}