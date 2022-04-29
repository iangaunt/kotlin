/* 
    Programming Basics -> Repetition with while
*/

/* 1. RepetitionWithWhile/Task1.kt
   Using a while loop, write a function displayContent() that takes a String parameter and displays each character on its own line. */
class rw_1() {
    fun displayContent(i: String) {
        var l = 0

        while (l < i.length) {
            println(i[l])
            l++
        }
    }

    fun main() {
        displayContent("abc")
    }
}

/* 2. RepetitionWithWhile/Task2.kt
   Using a while loop, write a function that sums the integral numbers from zero up to and including a given number (the parameter). */
class rw_2() {
    fun sum(number: Int): Int {
        var sum = 0
        var i = 0
    
        while (i <= number) {
        sum += i
        i++
        }
    
        return sum
    }
    
    fun main() {
        println(sum(10))
    }
}

/* 3. RepetitionWithWhile/Task3.kt
   Using a while loop, write a function that sums only even numbers up to and including a given number (the parameter). */
class rw_3() {
    fun sumOfEven(n: Int): Int {
        var sum = 0
        var i = 0
    
        while (i <= n) {
        if (i % 2 == 0) {
            sum += i
        }
    
        i++
        }
    
        return sum
    }
    
    fun main() {
        println(sumOfEven(10))
    }
}

/* 4. RepetitionWithWhile/Task4.kt
   Select getFooResult() by moving the caret over words and extract it into a val foo by hand. */

class rw_4() {
    fun getFooResult(): Int = 736

    fun main() {
        println("Foo result is: ${getFooResult()}")
    }
}

/* 5. RepetitionWithWhile/Task5.kt
   Select the expression getFooResult() inside a string template. */
class rw_5() {
    fun getFooResult(): Int = 736

    fun main() {
        val fooResult = getFooResult()
        println("Foo result is: $fooResult")
    }
}