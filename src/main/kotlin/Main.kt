


fun main(args: Array<String>) {



    val playerHeathPoint = 89 // given from the book

    var auraColor = "green"

    val playerKarma = (Math.pow(Math.random(), (100- playerHeathPoint)/ 100.0)*20).toInt()
    println(" the player defult color is  $auraColor, However his karma might go down  ")
     when(playerKarma ){


         in 0..5 -> auraColor= "red"
         in 6 .. 10 ->auraColor=  "orange"
         in 11 .. 15 ->auraColor= "purple"
         in 16 ..20 ->auraColor= "green"
     }

    println(" the player karma at the moment   $playerKarma")
    println( "his aura now is $auraColor ")
    println(" turns out the plays is strong has very strong karma")

}