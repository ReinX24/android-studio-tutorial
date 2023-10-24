fun main() {
    // Printing
//    println("Hello World!")
//    println(add(5, 2)) // 7
//    println(multiply(5, 2)) // 10

    // Defining and using variables
//    val count: Int = 10 // declaring a variable and specifying its value
//    val count: Int; //  value has not been initialized yet?
//    val count = 10; // shorthand way of declaring a variable
//    println("You have $count unread messages.") // printing with a String template

//    val unreadCount = 5
//    val readCount = 100
//    println("You have ${unreadCount + readCount} total messages in your inbox.")

//    val photosTotal = 100
//    val photosDeleted = 10
//    println("$photosTotal photos")
//    println("$photosDeleted photos deleted")
//    println("${photosTotal - photosDeleted} photos left")

    // Use var if the value of the variable changes
//    var cartTotal = 0
//    println("Cart Total: $cartTotal")

//    cartTotal = 20
//    println("Cart Total: $cartTotal")

//    var unreadCount: Int = 10;
//    println("You have $unreadCount unread messages.")

//    unreadCount--;
//    println("You have $unreadCount unread messages.")

//    val trip1 = 3.20
//    val trip2 = 4.10
//    val trip3 = 1.72
//    val totalTripLength = trip1 + trip2 + trip3
//    println("$totalTripLength miles left to destination.")

//    val nextMeeting = "Next meeting: "
//    val date = "January 1"
//    val reminder = nextMeeting + date + " at work" // String concatenation
//    println(reminder)

    // Using escape sequences
//    println("Say \"hello\"")
//    println("Hi!, my name is\nRein")

//    val notificationsEnabled: Boolean = false
//    println("Are notifications enabled? $notificationsEnabled")

    /*
    * This is a multi line comment
    * This is a very long comment that can
    * take up multiple lines.
    *  */

    // Using arguments and named arguments in our methods
//    println(birthdayGreeting(name = "Rover", age = 5))
//    println(birthdayGreeting(age = 2, name = "Rex"))

    // Using default arguments
    println(birthdayGreeting(age = 5)) // using a named argument
    println(birthdayGreeting( age = 2))
}

fun birthdayGreeting(name: String = "Rover", age: Int): String {
//    val nameGreeting = "Happy Birthday, $name!"
//    val ageGreeting = "You are now 5 years old!"
//    return "$nameGreeting\n$ageGreeting"
    return "Happy Birthday, $name! You are now $age years old!"
}

// Function that adds 2 integers and returns an Int
//fun add(x: Int, y: Int): Int {
//    return x + y
//}

// Function that multiplies 2 integers and returns their value
fun multiply(x: Int, y: Int) = x * y