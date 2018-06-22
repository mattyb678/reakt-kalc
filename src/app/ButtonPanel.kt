package app

import common.*
import react.RBuilder
import react.dom.div

fun RBuilder.buttonPanel(clickHandler: (Operation) -> Unit) {
    div("component-button-panel") {
        div {
            button(Clear(), clickHandler = clickHandler)
            button(Negate(), clickHandler = clickHandler)
            button(Percent(), clickHandler = clickHandler)
            button(Divide(), orange = true, clickHandler = clickHandler)
        }
        div {
            button(Num(7), clickHandler = clickHandler)
            button(Num(8), clickHandler = clickHandler)
            button(Num(9), clickHandler = clickHandler)
            button(Multiply(), orange = true, clickHandler = clickHandler)
        }
        div {
            button(Num(4), clickHandler = clickHandler)
            button(Num(5), clickHandler = clickHandler)
            button(Num(6), clickHandler = clickHandler)
            button(Subtract(), orange = true, clickHandler = clickHandler)
        }
        div {
            button(Num(1), clickHandler = clickHandler)
            button(Num(2), clickHandler = clickHandler)
            button(Num(3), clickHandler = clickHandler)
            button(Add(), orange = true, clickHandler = clickHandler)
        }
        div {
            button(Num(0), wide = true, clickHandler = clickHandler)
            button(Decimal(), clickHandler = clickHandler)
            button(Eq(), orange = true, clickHandler = clickHandler)
        }
    }
}