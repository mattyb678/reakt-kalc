package common

import app.KalcState

class Calculator {
    companion object {
        fun calculate(calcState: KalcState, operation: Operation): KalcState {
            if (operation is Num) {
                calcState.next = (calcState.next ?: 0.0) * 10 + operation.num.toDouble()
                return calcState
            } else if (operation is MultiStepOperation) {
                calcState.total = calcState.next
                calcState.next = 0.0
                calcState.operation = operation
                return calcState
            }
            return calcState
        }
    }
}