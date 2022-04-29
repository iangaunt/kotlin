/* 
    Programming Basics -> Looping & Ranges
*/

/* LoopingAndRanges/Task1.kt
   Using a for loop, create a function that calculates the factorial of its parameter (n! = 1 * 2 * ... * n). */
class lr_1() {
    fun factorial(n: Int): Long {
        var sum = 1L
        for (i in 1..n) {
            sum *= i
        }
    
        return sum
    }
    
    fun main() {
        println(factorial(10))
    }
}

/* LoopingAndRanges/Task2.kt 
   Using a for loop, create a function that sums the factorials up to its parameter (1! + 2! + ... + n!). */
class lr_2() {
    fun factorial(n: Int): Long {
        var result = 1L
        for (i in 1..n) {
        result *= i
        }
        return result
    }
    
    fun sumOfFactorials(n: Int): Long {
        var sum = 0L
        for (i in 1..n) {
        sum += factorial(i)
        }
        
        return sum
    }
    
    fun main() {
        println(sumOfFactorials(10))  // 4037913
    }
}