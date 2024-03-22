package rs.djokafioka.calculator

/**
 * Created by Djordje on 21.9.2023..
 */
data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
) {
}