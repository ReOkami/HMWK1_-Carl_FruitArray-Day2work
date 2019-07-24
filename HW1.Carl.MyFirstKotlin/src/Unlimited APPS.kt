fun main(args: Array<String>)
{
    var x = 3
    val name = "Swag Mastah"
    x = x + 10
    println("x is $x")
    // comment

    //decrement by one
     println("x before the while loop is: $x")
    while(x > 20){
        x--
        print("$x-")
    }
    println("x After the while loop is: $x")
//    increment by one
    for(i in 1..10){
        x++
        print("$x+")
    }
    println("x After the for loop is: $x")
//    condition
    if (x == 20){
        println("x must be 20!")
    }else{
        println("x is not in fact 20.")
    }
    var y = 9
    if (x < y ){
        println("x is smaller")
    }else{
        println("x is a big boi")
    }
    x = 3
    y = 1
    when{
        x < y -> println("x is small")
        x > y -> println("x is large")
        else -> println(" x and y are one and the same")
    }


//    a shortcut

    //print("Hello World\n")
//Tis a comment right here, yes good chap a comment i say.
}