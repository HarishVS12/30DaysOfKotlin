package Chapter6_Generics

fun main(args: Array<String>){
    var number:Int = Integer.valueOf(readLine())
    var lists = IntArray(number)
    for(i in 0.rangeTo(number-1)){
        lists[i] = Integer.valueOf(readLine())
    }
    val jumps:Int = Integer.valueOf(readLine())
    val ans = number/jumps
    println(ans)
}

fun findMinCost() {
    val i: Int = 8
    var arr = intArrayOf(1,4,1,2,3,5,2,3)
    /*for(ia in 0.rangeTo(i-1))
        arr[ia] = Integer.valueOf(readLine())*/
    val anInteger = 2
//    println(java.util.Arrays.toString(arr))


}