package Chapter7_FunctionManipulation

data class Fish(var name:String)

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
    fishNames()

}