package app

import react.RBuilder
import react.dom.div

fun RBuilder.display(value: Double) {
    div("component-display") {
        div { +"$value" }
    }
}