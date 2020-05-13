import java.util.*

//Refer : https://codelabs.developers.google.com/codelabs/kotlin-bootcamp-functions/#1

fun main(args : Array<String>){

    //Example for a return type using functions
    var ahs = printss(1)
    println(ahs)

    //Learn why almost everything in kotlin has a value
    val isUnit = println("Harish")
    println(isUnit)

    val temperature = 15
    val isHot = if(temperature>40) true else false
    println(isHot)

    //Taking that into a longer java version
    val tem:Boolean
    if(temperature>40)
        tem = true
    else tem = false
    println("Tem is $tem")

    // You could even put the conditional statements using the string.
    var watertem:Int? =12
    val str = "The water is ${if (watertem!!<2) "warm" else "cold"}"
    println(str)

    val ssd = if(watertem!=null)println("HAR") else println("DAS")
    println(ssd)

    val day = randomDay()
    val feed = fishFood(day)
    println("The day is $day and it ate $feed")

    swim(rom = "JOKA")

    println(shouldChangeWater("Monday"))

    var lists:List<String> = Filters()

    //eager filter which creates a new list
    val eager = lists.filter { it[0]=='p' }
    println(eager)

    //lazy, will wait until asked to evaluate
//    val lazy = lists.asSequence().filter { it[0]=='p' }
    val lis = lists.asSequence().map { println("accesss : $it") }
    println("lis : $lis")
    println("lisToFirst : ${lis.first()}")
    //It prints the item that are only accessed
    println("lisComplete : ${lis.toList()}")

    //***********LAMBDAS***********
    var dirtyLevel = 20
    val waterLevel = {dirty:Int -> dirty/2}
    println(waterLevel(dirtyLevel))


    // val c = 299 COMPARE THESE TWO AND SEE YOU GET THE ANSWER
    val hh = {
        dirty:Int ->
        var di = dirty/2
        di
    }

    //val c:Int = 299 and compare these two
    /*The lambdas are same but this one specifies us the data type
    that it gets from the parameter and also returns it*/
    val harish : (Int,String)->String = {dirty,ar->
        var di = dirty / 2
        var jk = ar + di
        jk
    }

    println("Harish : ${harish(50,"Bai")}")

}

//Function with return type
fun printss(ah : Int): Int{
    return ah
}

fun feedThefish(){
    val day = randomDay()
    val str:String = "FishFood"
    println("Today is $day and the fish ate $str")
}

//Random statements are used with the help of java util package
fun randomDay() : String{
    val week = arrayOf("Monday","Tuesday","Wednesday","Thursday"
    , "Friday", "Saturday","Sunday")
    return week[Random().nextInt(week.size)]
}

/*You can return the when statement since that too has a value in
kotlin */
fun fishFood(day : String):String{

    return when(day){
        "Monday" -> "Ponja"
        "Tuesday" -> "Jomba"
        "Wednesday" -> "Monja"
        "Thursday" -> "Goasa"
        "Friday" -> "Loba"
        "Saturday" -> "Thoosa"
        "Sunday" -> "Jooka"
        else -> "DEFAULTY MOKA"
    }
}

/* So you can specify a default value which helps from writing the
boilerplater code for method overloading */

fun swim(speed : String? = "", rom : String){
    if(speed!= null){
        println("This is his speed : $speed")
    }else{
        println("This is his rom : $rom")
    }
}
//
fun shouldChangeWater(day:String,temp:Int=22,dirty:Int=20):Boolean{
    return when{
        isTooHot(temp) -> true //These are the compact fun call
//        temp>30 -> true
        isDirty(dirty) -> true
//        dirty>30 -> true
        isSunday(day)->true
//        day == "Sunday" -> true
        else -> false
    }
}
//These are the compact functions
fun isTooHot(temp:Int) = temp>30
fun isDirty(dirty:Int) = dirty>30
fun isSunday(day:String) = day=="Sunday"

fun Filters() : List<String>{
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    return decorations
}


