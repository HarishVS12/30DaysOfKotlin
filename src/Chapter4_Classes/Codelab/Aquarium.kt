package Chapter4_Classes.Codelab

open class Aquarium(open var width:Int=30,open var length:Int=39,open var height:Int=40){

    //More init code can be declared and handled inside the init block
  /*  init {
        println("Aquarium is initializing")
        println("Volume in init of the primary constructor : ${width * length * height/1000}l")

    }*/

    //Any secondary constructor must call the primary one first
    // which is either directly using this() or indirectly by
    //calling another constructor.
    constructor(numberOfFish:Int) :this(){
        val tank = numberOfFish * 2000 * 1.1
        height = (tank/(length * width)).toInt()

    }

    //open property
    open val shape = "rectangle"
    //open with a getter
    open var water: Double = 0.0
        get() = volume * 0.9

    //Add a getter and a setter explicitly
    open var volume:Int
        get() = width * height *length/1000
         set(value){
            height = (value * 1000)/ (width * length)
        }

    /*Remove the below code if you delcare the properties in the
    parameters itself.*/

    var widt= width
    var lengt = length
    var heigh = height
    fun printSize(){
        println("width : $width\n" +
                "length = $length\n" +
                "height = $height")

        println("Volume : $volume")

        println("Volume: $volume l Water: $water l (${water/volume*100.0}% full)")
    }


}


