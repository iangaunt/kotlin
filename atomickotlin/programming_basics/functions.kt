/* 
    Programming Basics -> Functions
*/

/* 1. Functions/Task1.kt 
   Create a function squareInt() that takes an Int parameter and returns its mathematical square. */
fun fn_1() {
    fun squareInt(i: Int): Int {
        return i * i
    }
      
    fun main() {
        println(squareInt(2))  // 4
    }
}

/* 2. Functions/Task2.kt
   Create a function sumDoubles() that takes three Double parameters and returns their sum. */
fun fn_2() {
    fun getSum(a: Double, b: Double, c: Double): Double {
        return a + b + c
    }
    
    fun main() {
        println(getSum(1.0, 2.2, 3.4))  // 6.6
    }
}

/* 3. Functions/Task3.kt
   Create a function duplicate() that takes a String parameter and returns that String repeated twice. */
fun fn_3() {
    fun duplicate(s: String): String {
        return s + s
    }
    
    fun main() {
        println(duplicate("abc"))  // abcabc
    }
}

/* 4. Functions/Task4.kt 
   Apply Convert to expression body, and then Convert to block body intention actions. */
fun fn_4() {
    fun foo(): String {
        return "abc"
    }
  
    fun main() {
        println(foo())
    }
}