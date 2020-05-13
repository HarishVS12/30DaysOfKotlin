package Chapter4_Classes.Codelab

fun main(args:Array<String>){

    var callFunction: (Int,Int,Int) -> Unit={
        width,height,length->
            var aquarium = Aquarium(height=10)
        aquarium.printSize()
    }

    var  callFun = {
        width:Int,length:Int,height:Int->

        /*So Constructor overloading can be done
           as the method overloading when the default values
           are given while declaring it.*/

//            var aquar = Aquarium(20,50,60)
            var aq = Aquarium(numberOfFish = 90)

//            aquar.printSize()
            aq.volume = 0
//            aq.printSize()
    }

//    callFun(100,200,300)
//    buildAquarium()
    makeFish()
}

fun buildAquarium(){
//    val aq6 = Aquarium(25,25,40)
//    aq6.printSize()
    val myTower = TowerTank(40,25)
    myTower.printSize()
}

fun makeFish(){
    var shark = Shark()
    var dolphin = Dolphin()
    println("The color of shark is ${shark.color}")
    shark.eat()
    println("The color of dolphin is ${dolphin.color}")
    dolphin.eat()
}