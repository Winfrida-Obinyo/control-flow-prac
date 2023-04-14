fun main(){
    add()
    prime()
    factorial()
    sumEven()
    checkPrime()

}
//Write a program in Kotlin to find the sum of
//all the numbers from 1 to n using a while loop.
fun add() {
    var sum = 0
    var n = 10
    var i = 1
    while (i <= n) {
        sum += i
        i++
    }
    println("Sum of 1 to $n is $sum")
}
//Write a program in Kotlin to check whether
//a given number is a prime number or not

fun prime() {
    val num = 13
    var isPrime = true
    for (i in 2..num / 2) {
        if (num % i == 0) {
            isPrime = false
            break
        }
    }
    if (isPrime) {
        println("$num is a prime number")
    } else {
        println("$num is not a prime number")
    }
}
//Write a program in Kotlin to calculate the
//factorial of a given number using a while loop.
fun factorial() {
    val n = 5
    var factorial = 1
    var i = 1
    while (i <= n) {
        factorial *= i
        i++
    }
    println("Factorial of $n is $factorial")
}


//Write a program in Kotlin to find the sum of all even numbers
//from 1 to a given number using a for loop.

fun sumEven() {
    val n = 10
    var sum = 0
    for (i in 1..n) {
        if (i % 2 == 0) {
            sum += i
        }
    }
    println("Sum of all even numbers from 1 to $n is $sum")
}
//Write a program in Kotlin to check if a given
//number is prime or not using a while loop.
fun checkPrime() {
    val n = 17
    var i = 2
    var isPrime = true
    while (i <= n/2) {
        if (n % i == 0) {
            isPrime = false
            break
        }
        i++
    }
    if (isPrime) {
        println("$n is a prime number")
    } else {
        println("$n is not a prime number")
    }
}











