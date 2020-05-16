package Chapter4_Classes

abstract class AquariumFish {
    abstract var color: String
}

class Shark: FishColor, FishAction {
   //Was used while overriding the abstract class
    override var color = "yellow"
    override fun eat() {
        print("Hunt and eat fish")
    }
}

class Dolphin(fishColor: FishColor = GoldColor): FishAction
, FishColor by fishColor{
    override fun eat() {
        println("Just eat it when it needs")
    }
}

//HelperClasses (Please refer the note)
//This is a Singleton class
object GoldColor : FishColor {
    override var color = "Gold"
}