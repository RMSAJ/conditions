

fun main(args: Array<String>) {
    println(" please write the annual salary")
    var salary = readLine()!!
    println(" pls input the kpi (1- Excellent 2- good 3- poor)")
    var kpi = readLine()!!

    if ( kpi.toInt() == 1 ){
        var raise = (salary.toInt() * 0.06)
        println(" Employee of the month!! you deserve a raise of: SAR ${raise} ")
        println(" your Salary now: ")
        println(raise + salary.toInt())
    }
    else if ( kpi.toInt() == 2 ){
        var raise = (salary.toInt() * 0.04)
        println(" do better next year!! you deserve a raise of: SAR ${raise} ")
        println(" your Salary now: ")
        println(raise + salary.toInt())
    }
    else if ( kpi.toInt() == 3 ) {
        var raise = (salary.toInt() * 0.015)
        println(" very bad employee!!! you deserve a raise of: SAR ${raise} ")
        println(" your Salary now: ")
        println(raise + salary.toInt())
    }
    else {
        println( " pls write the correct numbers")
    }
    }


    // Try adding program arguments at Run/Debug configuration
    //  println("Program arguments: ${args.joinToString()}")
