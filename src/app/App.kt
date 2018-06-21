package app

import react.*
import react.dom.div

interface KalcState : RState {
    var total: Double
    var next: Double
}

class App : RComponent<RProps, KalcState>() {
    init {
        state.total = 0.0
        state.next = 0.0
    }

    private fun handleClick(name: String) {
        println("In APP: $name")
        setState { total++ }
    }

    override fun RBuilder.render() {
        println(state.total)
        div("component-app") {
            display(state.total)
            buttonPanel(::handleClick)
        }
    }
}

fun RBuilder.app() = child(App::class) {}
