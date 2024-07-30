import com.thoughtworks.kotlin_basic.util.ConversionOfNumbersToColumnSequenceLabels

fun main(args: Array<String>) {
    val startingSequenceNumber = args[0].toInt()
    val numberOfResults = args[1].toInt()

    val numbersToColumnSequenceLabels = ConversionOfNumbersToColumnSequenceLabels()

    println("[" + numbersToColumnSequenceLabels.generatingColumnLabels(startingSequenceNumber, numberOfResults) + "]")
}