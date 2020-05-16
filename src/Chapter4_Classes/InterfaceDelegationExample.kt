package Chapter4_Classes

//This complete code is for interface delegation which is seen
//from a youtube video
// Refer : https://www.youtube.com/watch?v=zfiohSIZtbo
fun main(args: Array<String>){
    var jack = Employee(FastCoder(), GoodDesigner(), DecentTester())
    jack.code()
    jack.design()
    jack.test()
}


interface whoCanCode{
    fun code()
}

interface whoCanDesign{
    fun design()
}

interface whoCanTest{
    fun test()
}



class Employee(coder: whoCanCode, designer: whoCanDesign, tester: whoCanTest):
        whoCanCode by coder, whoCanDesign by designer, whoCanTest by tester



class FastCoder: whoCanCode {
    override fun code() {
        println("Coded by Fast Coder")
    }
}

class GoodDesigner: whoCanDesign {
    override fun design() {
        println("Designed by Good Designer")
    }
}

internal class DecentTester: whoCanTest {
    override fun test() {
        println("Tested by a Decent Tester")
    }
}


