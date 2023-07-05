import java.time.LocalDateTime

fun main(){

    integer(9)

    num(23, 54)

    nums(6, 9)

    dep(37)

    compute(32, 3)

    time(5)

}


// 1. write Kotlin Program to Print an Integer (Entered by the User)
fun integer(num1: Int) {
    println("Entre a number: ")
    val stringInput = readLine()!!
    var integer = stringInput.toInt()
    println("you entered: $integer")
}

// 2. Kotlin Program to Add Two Integers
fun num(num1: Int, num2: Int){
    val sum = num1+num2
    println("the sum is: $sum")
}


// 3. Kotlin Program to Multiply two Floating Point Numbers
fun nums(x: Int, y: Int) {
    val product = x * y
    println("the product is: $product")
}


// 4. Kotlin Program to Find ASCII value of a character
fun dep(w: Int){
    val b = 'a'
    val ascii = b.toInt()
    println("the ASCII value of $b is: $ascii")
}


// 5. Kotlin Program to Compute Quotient and Remainder
fun compute(g: Int, h: Int){
    val run = g/h
    val run1 = g%h
    println("Run = $run")
    println("Run1 = $run1")
}


// 6. write Kotlin Program to Get Current Date/TIme
fun time(date: Int){
    val current = LocalDateTime.now()
    println("Current Date and Time is: $current")
}

