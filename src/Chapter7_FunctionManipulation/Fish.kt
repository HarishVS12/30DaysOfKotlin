package Chapter7_FunctionManipulation

data class Fish(var name:String)

 class ChummaHarish{
     companion object {
         //Refer TELUSKO : OBJECT AND COMPANION VIDEOS
         @JvmStatic
         fun chummaHarish() {
             println("Harish is a good boy!")
         }
     }
}

class Jack(var name: String ){
    companion object{
        @JvmStatic
        fun show(){
            println("Hello Harish")
        }
    }
}

fun myWith(name:String, block:String.()->Unit){
    name.block()
}



fun fishNames(){
    val fish = Fish("splashy")
    val fish2 = Fish(name = "splashy").apply {
        name = "sharky"
    }
    println(fish2.name  )
    fish.run {
        println(name)
    }
    with(fish.name){
        println(capitalize())
    }
    println(fish2.name)
}

fun main(args: Array<String>) {
//    fishNames()
    var fish = Fish("Harish")
    var jack = Jack("JACK")
    println(fish)
    ChummaHarish.chummaHarish()

}