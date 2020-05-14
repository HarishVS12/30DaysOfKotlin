package Chapter6_Generics

fun<T:WaterSupply> isWaterClean(aquarium: Aquarium<T>){
    println("This water is clean : ${aquarium.waterSupply.needProcessing}")
}

fun main(args:Array<String>){
    var asa = isWaterClean<TapWater>(Aquarium(TapWater()))

    var aqua = Aquarium(TapWater())
    println(aqua.hasWaterSupplyOfType<TapWater>())
}
