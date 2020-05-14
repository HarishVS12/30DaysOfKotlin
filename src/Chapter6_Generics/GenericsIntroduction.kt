package Chapter6_Generics

fun main(args:Array<String>){
    genericsExample()
}


fun genericsExample(){
    //Kotlin has Type Inference, So we can remove the <TapWater>
    var aq = Aquarium<TapWater>(TapWater())
    println("Water need processing : ${aq.waterSupply.needProcessing}")
    aq.waterSupply.addChemicalCleaners()
    println("Water need processing : ${aq.waterSupply.needProcessing}")

    //Any Type can be passed in and no restrictions is put
    // on by the generics type
    var aqq = Aquarium("Harish")
    println(aqq.waterSupply)

    //By default its of type T:Any?
    //To make it no null remove the ? from it =  T:Any
    val aq3 = Aquarium(null)
    println("The water is ${if(aq3.waterSupply==null) "null" else "not null"}")

}


class Aquarium<T>(val waterSupply:T){

   inline fun<reified R:WaterSupply> hasWaterSupplyOfType() = waterSupply is R


    //This allows a check function to check whether this
    // type has the following condition true or not

    /*fun addWater(){
        check(!waterSupply.needProcessing){
            println("water supply need processing first")
        }
        println("adding water from $waterSupply")
    }*/
}


open class WaterSupply(var needProcessing:Boolean)

class TapWater:WaterSupply(true){
    fun addChemicalCleaners(){
        needProcessing=false
    }
}

class FishStoreWater:WaterSupply(false)

class LakeWater:WaterSupply(true){
    fun filter(){
        needProcessing = false
    }
}