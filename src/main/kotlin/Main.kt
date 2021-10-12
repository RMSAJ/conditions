

fun main(args: Array<String>) {
    var years = readLine()!!
    var year400 = years.toInt()%400// the reminder of years when devided by 400
    var year100 = years.toInt()%100 // the reminder of years when devided by 100
    var year4 = years.toInt() % 4 // the reminder of years when devided by 4
    if( years < 1582.toString()){
        if( year4 == 0 ){
            println("it's a leap year")
        }
        else {
            println("its normal year")
        }
    }
    else if ( years >= 1582.toString()){
        if( year400 == 0){
            println("Leap Year")
        }
        else if ( year100 == 0){
            println("normal year")
        }
        else if ( year4 == 0){
            println(" leap year")
        }
        else {
            println("normal year")
        }

    }

    // Try adding program arguments at Run/Debug configuration
    //  println("Program arguments: ${args.joinToString()}")
}