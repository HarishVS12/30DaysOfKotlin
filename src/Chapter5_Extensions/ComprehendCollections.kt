package Chapter5_Extensions

//This can be assigned only globally. This assigns the value at compile time
const val rocks = 3

fun main(args: Array<String>){
    var lists = listOf(1,2,3)
    println(lists.sum())

    //This sums the length of the strings with the lambda
    var listOfStrings = listOf("Harish","JOKA","Batman")
    print("The sum is ${listOfStrings.sumBy { it.length }}")
    println()

    //Iterator(This is how you print the elements in the lists)
    for(s in listOfStrings.listIterator()){
        print("$s ")
    }
    println("\n*****************************")
    hashMaps()
}

fun hashMaps(){
    val cures = hashMapOf("white spots" to "Ich",
                        "red sores" to "hole disease")
    println(cures.get("white spots"))
    //or
    println(cures["red sores"])

    //If you look up to the hashMap with a value that is not in the map
    //then it returns null but you use the following code
    println(cures.getOrDefault("aids","sorry, I dont know"))

    //You can do more using getOrElse function
    println(cures.getOrElse("bloating"){"No Cure for this"})

}

