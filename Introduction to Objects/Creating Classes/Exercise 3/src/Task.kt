// CreatingClasses/Task3.kt
package creatingClassesExercise3


class Robot {
    fun right(steps: Int) {
        println("Right $steps steps")
    }

    fun left(steps: Int) {
        println("Left $steps steps")
    }

    fun down(steps: Int) {
        println("Down $steps steps")
    }

    fun up(steps: Int) {
        println("Up $steps steps")
    }
}

fun main() {
    val robot = Robot()
    robot.up(11)
}
/* Expected output:
Up 11 steps
*/