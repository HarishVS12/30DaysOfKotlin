package Chapter4_Classes.Codelab

//This is developed referring a youtube video
//Refer : https://www.youtube.com/watch?v=Z6xj7hta7Ac
    fun main(args: Array<String>) {
        var user1 = User("Sam", 10)
        var user2 = User("Sam", 10)

        //Instead of calling like
//    val name = user1.name; val id = user1.id

        //We shall call it like this called DESTRUCTURING
        val (name, _) = user1


        //implicitly it calls the toString() in case of data class
        println(user1.toString())
        if (user1.equals(user2))
            println("Equal")
        else println("Not Equal")

        //Data class gives us the copy() where the data of the one object can
        //be copied to another function
        var newUser = user1.copy(name = "Harish")
        println("NewUser : $newUser")
    }

    //When you wanna deal with data and not the object then use data class
//This should contain only property variable as the paramteres
//which has (val/var) in it
    data class User(var name: String, var id: Int)


