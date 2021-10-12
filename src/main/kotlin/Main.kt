

fun main(args: Array<String>) {
    var appleNo = readLine()!!
    var dozens = appleNo.toInt()/12 // number of dozes we have
    var remainApple = appleNo.toInt() % 12 // the remider of the apples
    println("number of dozens = "+ dozens)
    println("apples remain = " + remainApple)
    // Try adding program arguments at Run/Debug configuration
    //  println("Program arguments: ${args.joinToString()}")
}