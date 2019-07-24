fun main(args: Array<String>){
    val wordSet1 = arrayOf("Chocolate","big","powerful","little","young")
    println("my first array has ${wordSet1.size} items")
    val wordSet2 = arrayOf("Jacked","funny","cute","addded","Chungus")
    println("my second array has ${wordSet2.size} items")
    val wordSet3 = arrayOf("AAHHH","point","trap","orange","short")
    println("my first array has ${wordSet3.size} items")
    println("the first item is ${wordSet1[3]}")
    val fitemID = wordSet1[3]
    println("the next item is ${wordSet2[2]}")
    val sitemID = wordSet2[2]
    println("the last item is ${wordSet3[5]}")
    val titemID = wordSet3[3]
    println("to put it all together... \n\n\n\n\n")
    println(fitemID + sitemID + titemID)

}