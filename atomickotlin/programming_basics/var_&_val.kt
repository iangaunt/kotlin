/* 
    Programming Basics -> var & val
*/

/* 1. VarAndVal/Task1.kt
   Define a val answer and set its value to 42, then to 43. Display the value of answer on the console. */
fun vv_1() {
    var answer = 42
    println(answer)
      
    answer = 43
    println(answer)  
}

/* 2. VarAndVal/Task2.kt 
   Define var a = 10. Now define a val b = a. Now assign 42 to a and display both a and b on different lines. */
fun vv_2() {
    var a = 10
    val b = a
    a = 42
  
    println(a)
    println(b)
}

/* 3. varAndVal/Task3.kt
   Define two vars: x and y. Swap their contents. */
fun vv_3() {
    var x = 1
    var y = 2
  
    var a = x
    x = y
    y = a
  
    println(x)
    println(y)
}