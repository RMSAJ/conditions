

fun main(args: Array<String>) {
    println("Write your name")
    var playerName = readLine()
    println(" are u sure that ur name?  yes or no ")
      var answer =  readLine()
        while(answer  ==   "no" ){
            println("then get out")
            break
        }


    var playerHeathPoint = 100
    if(playerHeathPoint == 100){
        println("Full")
    }
    else if(playerHeathPoint < 50){
        println("Run!!!")
    }
    else {
        println("Heal!")
    }

}