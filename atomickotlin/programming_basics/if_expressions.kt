/* 
    Programming Basics -> If Expressions
*/

/* 1. IfExpressions/Task1.kt 
Create a function checkSign() that checks whether an integer number is positive, negative, or zero, and returns a String. */
class ife_1() {
    fun checkSign(number: Int): String {
        if (number == 0) {
            return "zero"
        } else if (number > 0) {
            return "positive"
        } else {
            return "negative"
        }
    }
    
    
    fun main() {
        println(checkSign(-19)) 
    }
}

/* 2. IfExpressions/Task2.kt 
   Create a function abs() that returns the absolute value of its parameter: for example, abs(3) is 3 and abs(-5) is 5. */
class ife_2() {
    fun abs(number: Int): Int {
        if (number < 0) {
            return number * -1
        }

        return number
    }

    fun main() {
        println(abs(-19)) 
    }
}

/* 3. IfExpressions/Task3.kt
   Create a function findMax() that finds the maximum value when given two integer arguments. */
class ife_3() {
    fun findMax(first: Int, second: Int): Int {
        if (first > second) {
            return first
        }
    
        return second
    }
    
    
    fun main() {
        println(findMax(-1, 4)) 
    }
}