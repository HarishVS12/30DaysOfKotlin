fun main(args: Array<String>){

    //Refer : https://codelabs.developers.google.com/codelabs/kotlin-bootcamp-basics/#2

    //Compare Conditions and booleans
    //Normal if
    var a = 19
    if(a>10)
        println("Harish is a good boy")
    else
        println("Harish is not a good boy")

    //If with a range
    var i = 120
    if(i in 18..100 && i in 120..140){
        println("Major and his age is $i")
    }else{
        println("Minor and his age is $i")
    }

    //With else if
    val ass:Int = 11
    if(ass>19){
        println("His age will be plus 10 which is ${ass+10}")
    }else if(ass<90){
        println("His age will be minus 10 which is ${ass-10}")
    }else{
        print("I really cant think anything")
    }

    //When statement: Similar to the SWITCH
    val harish = 31
    when(harish){
        10 -> println("He is 10 years old")
        in 11..30 -> println("He is between 11 and 30")
        else -> println("He is $harish years old")
    }

//    nullAndNonNullable()
    arraysLoopsLists()

}

fun nullAndNonNullable(){
    println("\n****** NULL AND NON NULLABLE *******")

    var rocks = null
    println(rocks)

    //Traditional way
    var fishfoodtreats = 7
    if (fishfoodtreats!=null)
        fishfoodtreats = fishfoodtreats.dec()
    println(fishfoodtreats)

    //Kotlin way
    var fishfood:Int? = null
    val len = fishfood
    println(len)
}

fun arraysLoopsLists(){
    println("\n****** ARRAYS LOOPS AND LISTS *******")

    //Creating a list - Cannot be changed
    val list = listOf("Harish","Mass",12)
    println(list)

    //List that can be changed using MUTABLE LIST
    val mutableList = mutableListOf("Harish","Mass","guy")
    println(mutableList.remove("Mass"))
    println(mutableList)

   //Creating arrays
    val arr = arrayOf("as",2,"as")
    println(java.util.Arrays.toString(arr))

    //Concatenate the arrays
    val ara = intArrayOf(1,2,3)
    val opp = intArrayOf(5,7,8)
    val oddList = ara + opp
    println(oddList[5])

    //NestedArrays and Lists
    val qwe = intArrayOf(1,2,3)
    val wer = listOf("Harish","Good boy")
    val ko = listOf(java.util.Arrays.toString(qwe),wer)
    println("Nested Arrays : " + ko)

    //init with the code instead of 0
    val array = Array(20){it * 4}
    println(java.util.Arrays.toString(array))

    //LOOOOOOPSS
    //For Loop
    val school = arrayOf("Harish","is a","good","boy")
    for(element in school){
        print(element+" ")
    }
    println()
    for((index,element) in school.withIndex()){
        println("Item at $index is $element")
    }

    //Specify Ranges of numbers and characters
    for(i in 1..5)
        print("$i ")

    println()

    for(i in 5 downTo 1)
        print("$i ")

    println()

    val a = 1
    val b = 22
    for(i in a+1..b step 2)
        print("$i ")

    println()

    for(i in 'a'..'z')
        print("$i ")

    println()

    repeat(5){
        println("WHAT THE FUCK!!!!")
    }
}

