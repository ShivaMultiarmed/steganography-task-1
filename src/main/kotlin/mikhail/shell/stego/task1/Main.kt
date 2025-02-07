package mikhail.shell.stego.task1

import javafx.application.Application
import javafx.stage.Stage

class Main: Application() {
    override fun start(stage: Stage?) {
        val inputStage = InputStage()
        inputStage.show()
    }
}

fun main() {
    Application.launch(Main::class.java)
}