fun main(args: Array<String>){
    var lists = mutableListOf(1,2,3,4,5,6,7,8)
    var last: (Int,MutableList<Int>)->Int = {
           index,lastList->
                var ans:Int = lastList.get(index)
                ans
    }

    var reverseTheList : (MutableList<Int>)->MutableList<Int> = {
        mutableList ->
                var tempList:MutableList<Int> = mutableList.asReversed()
                tempList
                /*for(i in tempList.size-1 downTo 0){
                    print("${mutableList.get(i)} ")
                }*/
    }
//     println(last(2,lists))

    println(reverseTheList(lists))
}

fun IteratorExample(){
    val numbers = listOf("one", "two", "three", "four")
    val numbersIterator = numbers.iterator()
    while (numbersIterator.hasNext()) {
        println(numbersIterator.next())
    }
}
