fun main() {

    // Print messages
//    println("Use the val keyword when the value doesn't change.")
//    println("Use the var keyword when the value can change.")
//    println("When you define a function, you define the parameters that can be passed to it.")
//    println("When you call a function, you pass arguments for the parameters.")

    // Fix compile error
//    println("New chat message from a friend")

    // String templates
//    var discountPercentage = 0
//    var offer = ""
//    val item = "Google Chromecast"
//    discountPercentage = 20
//    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
//    println(offer)

    // String concatenation
//    val numberOfAdults = 20
//    val numberOfKids = 30
//    val total = numberOfAdults + numberOfKids
//    println("The total party size is: $total")

    // Message formatting
//    val baseSalary = 5000
//    val bonusAmount = 1000
//    val totalSalary = "$baseSalary + $bonusAmount"
//    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")

    // Implement basic math operations
//    val firstNumber = 10
//    val secondNumber = 5
//    println("$firstNumber + $secondNumber = ${firstNumber + secondNumber}")

    // Implement basic math operations
//    val firstNumber = 10
//    val secondNumber = 5
//    val thirdNumber = 8

//    val result = add(firstNumber, secondNumber)
//    val anotherResult = add(firstNumber, thirdNumber)

//    println("$firstNumber + $secondNumber = $result")
//    println("$firstNumber + $thirdNumber = $anotherResult")

//    val subtractResult = subtract(firstNumber, secondNumber)
//    val anotherSubtractResult = subtract(firstNumber, thirdNumber)

//    println("$firstNumber - $secondNumber = $subtractResult")
//    println("$firstNumber - $thirdNumber = $anotherSubtractResult")

    // Default parameters
//    val operatingSystem = "Chrome OS"
//    val emailId = "sample@gmail.com"
//    println(displayAlertMessage(operatingSystem, emailId))

//    val firstUserEmailId = "user_one@gmail.com"
//    println(displayAlertMessage(emailId = firstUserEmailId)) // Using named arguments

//    val secondUserOperatingSystem = "Windows"
//    val secondUserEmailId = "user_two@gmail.com"
//    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))

//    val thirdUserOperatingSystem = "Mac OS"
//    val thirdUserEmail = "user_three@gmail.com"
//    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmail))

//    val userSteps = 4000
//    val caloriesBurned = pedometerStepsToCalories(userSteps)
//    println("Walking $userSteps steps burns $caloriesBurned calories")

//    println("Have I spent more time using my phone today: ${timeSpentMoreToday(300, 200)}") // true
//    println("Have I spent more time using my phone today: ${timeSpentMoreToday(200, 200)}") // false
//    println("Have I spent more time using my phone today: ${timeSpentMoreToday(200, 220)}") // false

    println(showCityWeather("Ankara", 27, 31, 82))
    println()
    println(showCityWeather("Tokyo", 32, 36, 10))
    println()
    println(showCityWeather("Cape Town", 59, 64, 2))
    println()
    println(showCityWeather("Guatemala City", 50, 55, 7))

}

fun showCityWeather(cityName: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int): String {
    return "City: $cityName\nLow temperature: $lowTemp, High temperature: $highTemp\nChance of rain: $chanceOfRain%"
}

fun timeSpentMoreToday(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    return numberOfSteps * caloriesBurnedForEachStep
}

fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId"
}

fun add(numOne: Int, numTwo: Int): Int {
    return numOne + numTwo
}

fun subtract(numOne: Int, numTwo: Int): Int {
    return numOne - numTwo
}
