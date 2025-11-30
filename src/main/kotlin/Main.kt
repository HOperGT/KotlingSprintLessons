package org.example

fun f(N: Int): String {
    if(N==0){
        return "0"
    }
    var s = ""
    var n = N

    while(n>0){
        s = (n % 17).toString() + s
        n/=17
    }
    return s
}
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, $name!")
    var k = 0
    for (i in 1..10000) {
        if (i%3444==0){
            println("Четное i == $i")
            k += 1
        }
    }


    for(i in 1..100){
        println(f(i))
    }
    println("$k")
}