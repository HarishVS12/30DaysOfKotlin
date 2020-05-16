package Chapter4_Classes

enum class Directions{
    EAST,
    WEST,
    SOUTH,
    NORTH
}

enum class Color(val red:Int, val green:Int, val blue:Int){
    RED(255,0,0),
    GREEN(0,255,0),
    BLUE(0,0,255)
}

fun main(args: Array<String>){

    var red = Color.RED
    var reddy = Color.RED

    println("$red $reddy")

    println("North enum = ${Directions.NORTH}")
    println("RED COLOR ENUM = ${Color.RED.ordinal}")
    println("Value : ${Color.valueOf("RED")}")

    println("Particular value : " + Color.RED.red)
}
