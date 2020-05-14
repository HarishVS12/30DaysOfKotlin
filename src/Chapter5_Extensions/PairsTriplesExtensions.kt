package Chapter5_Extensions

fun main(args:Array<String>){

    //This is the list partition where it is created based on
    // the response of the function whether its true or false;
    val lists = listOf("Harish","JUA")
//    println("copy : ${lists.contains("Harish")}")
    val twoLists:Pair<List<String>,List<String>> = lists.partition { isFresh(it) }
    println(twoLists.toString())


    //Making some pairs and triples
    var equipment:Pair<String,String> = "fish net" to "catching fish"
    println(equipment)
    println(equipment.first)
    println(equipment.second)

    //Creating a triple
    val numbers = Triple("GH",2,4)
    println(numbers.toString())
    println(numbers.toList())
    println(numbers.third)

    //Pair with the first itself a pair
    val pairOfPairs = ("Harish " to "a good boy") to " YES HE IS!"
    println(pairOfPairs.first)

    //Destructure
    val(first,second,third) = numbers
    println("First: $first, Second: $second, Third: $third")
}

fun isFresh(str:String):Boolean{
    return when{
        str.length>4 -> return true
        else -> return false
    }
}