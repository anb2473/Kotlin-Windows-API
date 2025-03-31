import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.layout.StackPane
import javafx.stage.Stage

class IDE : Application() {
    override fun start(primaryStage: Stage) {
        val root = StackPane()
        val label = Label("Hello, World!")
        root.children.add(label)

        val scene = Scene(root, 400.0, 300.0)

        primaryStage.title = "Stream"
        primaryStage.scene = scene
        primaryStage.show()
    }
}

fun main() {
    Application.launch(HelloWorld::class.java)
}