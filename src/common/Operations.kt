package common

interface Operation : Displayable {
    fun operate(total: Double, next: Double) : Double
}

interface MultiStepOperation : Operation

class Clear : Operation {
    override fun operate(total: Double, next: Double): Double {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDisplay(): String {
        return "AC"
    }
}

class Negate : Operation {
    override fun operate(total: Double, next: Double): Double {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDisplay(): String {
        return "+/-"
    }
}

class Percent : Operation {
    override fun operate(total: Double, next: Double): Double {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDisplay(): String {
        return "%"
    }
}

class Divide : MultiStepOperation {
    override fun operate(total: Double, next: Double): Double {
        return total / next
    }

    override fun getDisplay(): String {
        return "÷"
    }
}

class Multiply : MultiStepOperation {
    override fun operate(total: Double, next: Double): Double {
        return total * next
    }

    override fun getDisplay(): String {
        return "x"
    }
}

class Add : MultiStepOperation {
    override fun operate(total: Double, next: Double): Double {
        return total + next
    }

    override fun getDisplay(): String {
        return "+"
    }
}

class Subtract : MultiStepOperation {
    override fun operate(total: Double, next: Double): Double {
        return total - next
    }

    override fun getDisplay(): String {
        return "-"
    }
}

class Eq : Operation {
    override fun operate(total: Double, next: Double): Double {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDisplay(): String {
        return "="
    }
}

class Decimal : Operation {
    override fun operate(total: Double, next: Double): Double {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDisplay(): String {
        return "."
    }
}

class Num(val num: Int) : Operation {
    override fun operate(total: Double, next: Double): Double {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDisplay(): String {
        return "$num"
    }
}