

fun main(args: Array<String>) {
    println(" welcome to Rakan calcolator ")
    println(" pls write your inter calc operations")

    var firstNumber = readLine()!!
    println(" pls use only (+, -, *, /,%)")
   var operation = readLine()
    println("pls write ur second number")
    var secondNumber = readLine()!!

    if( operation == "+"){
        println(firstNumber.toInt() + secondNumber.toInt())
    }
    else if (operation == "-"){
       println( firstNumber.toInt() - secondNumber.toInt())



    }
    else if ( operation == "/"){
        println(firstNumber.toInt() / secondNumber.toInt() )
    }
    else if ( operation == " *"){
        println(firstNumber.toInt() * secondNumber.toInt())
    }
    else if( operation == "%"){
        println(firstNumber.toInt() % secondNumber.toInt())
    }
    else{
        println("null")
    }

    }


    // Try adding program arguments at Run/Debug configuration
    //  println("Program arguments: ${args.joinToString()}")
