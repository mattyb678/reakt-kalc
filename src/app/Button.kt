package app

import common.Operation
import kotlinx.html.js.onClickFunction
import react.RBuilder
import react.dom.button
import react.dom.div

fun RBuilder.button(op: Operation, orange: Boolean = false, wide: Boolean = false, clickHandler: (Operation) -> Unit) {
    val classes = arrayOf(if (orange) "orange" else "not-orange",
            if (wide) "wide" else "not-wide",
            "component-button")
    div(classes.joinToString(" ")) {
        button {
            attrs { this.onClickFunction = { clickHandler(op)} }
            +op.getDisplay()
        }
    }
}