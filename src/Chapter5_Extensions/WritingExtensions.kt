package Chapter5_Extensions

fun main(args: Array<String>){
    println("Doesithavespaces?".hasSpaces())
}
//This is how you use a extension function
fun String.hasSpaces():Boolean{
    val found = this.find { it == ' ' }
    return found != null
}
//or
fun String.hasSpacess():Boolean = find{it==' '}!=null