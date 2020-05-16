package Chapter4_Classes

import kotlin.math.PI

class TowerTank(override var height: Int, var diameter:Int): Aquarium(height= height,width=diameter,length=diameter){
    override var volume: Int
        get() = (width/2 * length/2 * height/1000 * PI).toInt()
        set(value) {
            height = ((value * 1000/ PI)/(width/2 * length/2)).toInt()
        }

    //This is overrided from the Aquarium class
    override var water = volume * 0.8

    override var shape = "cylinder"
}