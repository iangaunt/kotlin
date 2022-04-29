/* 
    Programming Basics -> Number Types
*/

/* 1. NumberTypes/Task1.kt 
   Guess the results of the following expressions and then check yourself using Kotlin. */
class nt_1() {
    // 11 / 3
    val a = 11 / 3

    // 11 % 3
    val b = 11 % 3

    // a * 3 + b
    val c = a * 3 + b

    // 6 / 5.0
    val d = 6 / 5.0
}

/* 2. NumberTypes/Task2.kt
   Check which of the following values can't be stored in an Int type. */
class nt_2() {
    val million: Int = 1_000_000
    val millionType: String = "Int"

    val billion = 1_000_000_000
    val billionType: String = "Int"

    val trillion = 1_000_000_000_000
    val trillionType: String = "Long"

    val quintillion = 1_000_000_000_000_000_000
    val quintillionType: String = "Long"
}

/* 3. NumberTypes/Task3.kt 
   Create two functions: the first converts Fahrenheit to Celsius, and the second converts Celsius to Fahrenheit. */
class nt_3() {
    fun convertFahrenheitToCelsius(f: Int): Double {
        return 5.0 * (f - 32) / 9
    }
    
    fun convertCelsiusToFahrenheit(c: Int): Double {
        return c * (9.0 / 5) + 32
    }
    
    fun main() {
        println(convertFahrenheitToCelsius(68)) // 20.0
        println(convertCelsiusToFahrenheit(20)) // 68.0
    }
}

/* 4. NumberTypes/Task4.kt
   Write a function that produces the time in milliseconds given a period of time in hours, minutes and seconds. */
class nt_4() {
    fun convertToMilliseconds(hours: Int, minutes: Int, seconds: Int): Long {
        return (1000L * seconds) + (60000L * minutes) + (3600000L * hours)
    }
    
    fun main() {
        println(convertToMilliseconds(1, 30, 0))
    }
}