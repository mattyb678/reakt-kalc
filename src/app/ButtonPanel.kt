package app

import react.RBuilder
import react.dom.div

fun RBuilder.buttonPanel(clickHandler: (String) -> Unit) {
    div("component-button-panel") {
        div {
            button("AC", clickHandler = clickHandler)
            button("+/-", clickHandler = clickHandler)
            button("%", clickHandler = clickHandler)
            button("÷", orange = true, clickHandler = clickHandler)
        }
        div {
            button("7", clickHandler = clickHandler)
            button("8", clickHandler = clickHandler)
            button("9", clickHandler = clickHandler)
            button("x", orange = true, clickHandler = clickHandler)
        }
        div {
            button("4", clickHandler = clickHandler)
            button("5", clickHandler = clickHandler)
            button("6", clickHandler = clickHandler)
            button("-", orange = true, clickHandler = clickHandler)
        }
        div {
            button("1", clickHandler = clickHandler)
            button("2", clickHandler = clickHandler)
            button("3", clickHandler = clickHandler)
            button("+", orange = true, clickHandler = clickHandler)
        }
        div {
            button("0", wide = true, clickHandler = clickHandler)
            button(".", clickHandler = clickHandler)
            button("=", orange = true, clickHandler = clickHandler)
        }
    }
}