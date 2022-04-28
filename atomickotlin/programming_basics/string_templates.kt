/* 
    Programming Basics -> String Templates 
*/

/* 1. StringTemplates/Task1.kt 
   Display the result of the function findMax() (from the exercises in the previous atom) on the console in the form "The maximum of x and y is max." */
class st_1() {
    fun findMax(first: Int, second: Int): Int {
        if (first > second) first else second
    }

    fun main() {
        val first = 17
        val second = 31

        println("The maximum of $first and $second is ${findMax(first, second)}.")
    }
}

/* 2. StringTemplates/Task2.kt 
   Implement a record() function that returns a String in the form: index [status] message, where each item is passed into record() as a parameter. */
class st_2() {
    fun record(index: Int, status: String, message: String): String {
        return "$index [$status] $message\n"
    }
      
    fun main() {
        print(record(1, "OK", "Everything is fine."))
        print(record(2, "Fail", "Something has broken."))
    }   
}

/* 3. StringTemplates/Task3.kt 
   Write a function show() with parameters i: Int, s: String, c: Char and d: Double. On the console, show() displays the value of each parameter on its own line. */

class st_3() {
    fun show(i: Int, s: String, c: Char, d: Double) {
        println("i: $i")
        println("""s: $s""")
        println("c: '$c'")
        println("d: $d")
    }
    
    fun main() {
        show(1, "abc", 'd', 2.0)
    }
}

/* 4. StringTemplates/Task4.kt 
   Replace all instances of foo in the file with bar. */
class st_4() {
    // bar
    fun bar() = 1

    fun main() {
        println(bar())
    }
}

/* 5. StringTemplates/Task5.kt
   Rename the val name to result without changing the word "answer" in the string literal. */
class st_5() {
    fun main() {
        val result = 42
        println("The answer is $result")
    }
}