//REFER : RESO CODE APPLY,LET,RUN VIDEO = https://www.youtube.com/watch?v=-Lha9n8VJf0
fun main(args: Array<String>) {
    val firstPerson = Person("Harish",20,"Programmer")
    val secondPerson = Person("Jack",23,"Broker")

    val olderPerson:Person = if(firstPerson.age>secondPerson.age) firstPerson else secondPerson
    olderPerson.printPerson()

    //Runs the code within the block and returns the answer
    run{
        if(firstPerson.age>secondPerson.age) firstPerson else secondPerson
    }.printPerson()

    //Modifies the code and returns the result
    with(firstPerson){
        age += 1
        "Age is now $age"
    }.println() //Extension function created

    //Combination of with and run
    firstPerson.run {
        age += 1
        "Age is now $age"
    }.println()

    firstPerson.let {
        modifiedPerson->
        modifiedPerson.age +=1
        "Age is now ${modifiedPerson.age}"
    }.println()

    //APPLY eliminates doing
//        secondPerson.age = 1
//        secondPerson.job = "Jar" - Eliminating the boilerplater code
    secondPerson.apply {
        age+=1
        job = "Hot-dog seller"
    }.printPerson()

    //This containers it or we can modify it by creating a temp object by
    //using lambda
    secondPerson.also {
        /*it.age += 1
        it.job = "Youtuber"*/
        modifyPerson->
                modifyPerson.age = 12
                modifyPerson.job = "GULEBAGAAVALI"

    }.printPerson()

}

data class Person(var name:String, var age:Int, var job:String){
    fun printPerson(){
        println(this.toString())
    }
}

fun String.println() = println(this)