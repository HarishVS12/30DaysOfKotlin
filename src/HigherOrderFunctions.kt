import java.util.function.Consumer

//Refer: https://www.youtube.com/watch?v=ESm5AX1ZbSg

fun main(args: Array<String>) {

    var values = listOf<Int>(1,2,3,4,5,6,7,8,9,10)

    //External for loop
    /*for(i in values){
        println(i)
    }*/

    //This is the functional programming
    //ForEach is a function and println() is a function
    //Passing a function inside a function -> Functional Programming

    var con:Consumer<Int> = object: Consumer<Int>{
        override fun accept(t: Int) {
            println(t)
        }
    }
    //Remove the boiler plate like removing the object:Consumer<Int>
    //since you have declared that in the left as type. So just specify the value
    //and print that value
    values.forEach({t->println(t)})
    //it is the default word
    values.forEach({println(it)})
    //Remove the it and just pass the method
    values.forEach(::println)


}
data class Alien(var name: String, var points: Int)