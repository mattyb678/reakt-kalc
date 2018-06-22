package app

import common.Calculator
import common.Operation
import react.*
import react.dom.div

interface KalcState : RState {
    var total: Double?
    var next: Double?
    var operation: Operation?
}

class App : RComponent<RProps, KalcState>() {
    init {
        state.total = null
        state.next = null
        state.operation = null
    }

    private fun handleClick(op: Operation) {
        println("In APP: ${op.getDisplay()}")

        val updatedState: KalcState = Calculator.calculate(state, op)

        setState {
            total = updatedState.total
            next = updatedState.next
            operation = updatedState.operation
        }
    }

    override fun RBuilder.render() {
        println(JSON.stringify(state))
        val toDisplay: Double = when {
            state.next != null -> state.next!!
            state.total != null -> state.total!!
            else -> 0.0
        }
        div("component-app") {
            display(toDisplay)
            buttonPanel(::handleClick)
        }
    }
}

fun RBuilder.app() = child(App::class) {}
