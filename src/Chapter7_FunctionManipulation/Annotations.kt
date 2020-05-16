package Chapter7_FunctionManipulation

import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.findAnnotation

fun main(args:Array<String>){
//    testAnnotations()
    labels()
}

fun labels(){
    outerLoop@ for(i in 1..100){
        print("$i ")
        for(j in 1..5){
            print("j : $j ")
            if(i>10) {break@outerLoop}
        }
    }
}

@ImAPlant class Plant{
    fun trim(){}
    fun fertilize(){}

    @get:OnGet
    val isGrowing: Boolean = true
}

fun testAnnotations(){
    val classObj = Plant::class
    val myAnnotationObject = classObj.findAnnotation<ImAPlant>()
    for(m in classObj.declaredMemberFunctions){
        println(m.name)
    }
    for(a in classObj.annotations){
        println(a.annotationClass.simpleName)
    }

    val myAnnotatioObject = classObj.findAnnotation<ImAPlant>()
    println("MyAnnotation : $myAnnotatioObject")
}

annotation class ImAPlant

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet



