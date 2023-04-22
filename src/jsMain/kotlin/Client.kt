import web.dom.document
import react.create
import react.dom.client.createRoot

fun main() {
    /*val container = document.createElement("div")
    document.body.appendChild(container)*/

    val container = document.getElementById("root") ?: error("Couldn't find root container!")

    val welcome = Welcome.create {
        name = "Kotlin/JS"
    }
    createRoot(container).render(welcome)
}