import kotlin.math.pow

// Create a mutable variable to control the while loop in the main function
var keepRunning: Boolean = true
// Create an immutable variable to hold the value of Pi
const val pi: Double = 3.14159265358979

fun main() {
    while (keepRunning) {
        /* Print welcome message and explain the program */
        println("\nThis program will calculate the volume of a sphere or a cone.")
        println("Please choose one of the following option by entering it's corresponding number:")
        println("   1. Calculate Sphere Volume")
        println("   2. Calculate Cone Volume")
        println("   3. Quit\n")

        /* Read what the user types */
        val choice = readLine()!!

        /* Take action that corresponds to user's choice */
        if (choice.toInt() == 1) {
            println("\nEnter the radius of the sphere:")
            /* Read what the user types */
            val radius = readLine()!!
            /* Get volume of sphere with given radius */
            val answer = Sphere(radius.toDouble()).calculateVolume()
            /* Tell user the volume of the shape */
            println("\nThe sphere's volume is about $answer")
        }
        else if (choice.toInt() == 2) {
            println("\nEnter the radius of the cone:")
            /* Read what the user types */
            val radius = readLine()!!
            println("\nEnter the height of the cone:")
            /* Read what the user types */
            val height = readLine()!!
            /* Get volume of sphere with given radius */
            val answer = Cone(radius.toDouble(), height.toDouble()).calculateVolume()
            /* Tell user the volume of the shape */
            println("\nThe cone's volume is about $answer")
        }
        else if (choice.toInt() == 3) {
            /* If the user does not wish to continue, say goodbye and exit the while loop by
            * setting the variable keepRunning's value to false */
            println("\nHave a good day!")
            keepRunning = false
        }
        else {
            /* If the user makes an invalid entry, tell them */
            println("\n#=== INVALID ENTRY | TRY AGAIN===#")
        }
    }
}

// Sphere class. Requires a radius.
class Sphere(radius:Double) {
    /* Property (data member) */
    private var radius = radius

    /* Member function */
    fun calculateVolume(): Double {
        return ((4.0/3.0) * pi * (radius.pow(3)))
    }
}

// Cone class. Requires a radius and height.
class Cone(radius:Double, height:Double) {
    /* Property (data member) */
    private var radius = radius
    private var height = height

    /* Member function */
    fun calculateVolume(): Double {
        return (pi * (radius.pow(2)) * (height/3.0))
    }
}
