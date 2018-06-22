package common

interface Operation : Displayable {

}

interface MultiStepOperation : Operation

class Clear : Operation {
    override fun getDisplay(): String {
        return "AC"
    }
}

class Negate : Operation {
    override fun getDisplay(): String {
        return "+/-"
    }
}

class Percent : Operation {
    override fun getDisplay(): String {
        return "%"
    }
}

class Divide : MultiStepOperation {
    override fun getDisplay(): String {
        return "÷"
    }
}

class Multiply : MultiStepOperation {
    override fun getDisplay(): String {
        return "x"
    }
}

class Add : MultiStepOperation {
    override fun getDisplay(): String {
        return "+"
    }
}

class Subtract : MultiStepOperation {
    override fun getDisplay(): String {
        return "-"
    }
}

class Eq : Operation {
    override fun getDisplay(): String {
        return "="
    }
}

class Decimal : Operation {
    override fun getDisplay(): String {
        return "."
    }
}

class Num(val num: Int) : Operation {
    override fun getDisplay(): String {
        return "$num"
    }
}