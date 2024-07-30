package com.thoughtworks.kotlin_basic.util

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.test.assertFailsWith

class ConversionOfNumbersToColumnSequenceLabelsTest {
    @Test
    fun `Return true if all validation pass` () {
        val numbersToColumnSequenceLabels = ConversionOfNumbersToColumnSequenceLabels()
        assertEquals(true,
            numbersToColumnSequenceLabels.validationOfNumbers(1, 1))
    }
    @Test
    fun `should throw error if starting sequence number is less or equal to 0`() {
        val numbersToColumnSequenceLabels = ConversionOfNumbersToColumnSequenceLabels()
        assertFailsWith<IllegalArgumentException>(
            message = "Starting sequence number (first value) must be greater than 0",
            block = {
                numbersToColumnSequenceLabels.validationOfNumbers(0, 1)
            }
        )
    }
    @Test
    fun `should throw error if number of results is less or equal to 0`() {
        val numbersToColumnSequenceLabels = ConversionOfNumbersToColumnSequenceLabels()
        assertFailsWith<IllegalArgumentException>(
            message = "Number Of results (second value) must be greater than 0",
            block = {
                numbersToColumnSequenceLabels.validationOfNumbers(1, 0)
            }
        )
    }
    @Test
    fun `should throw error if both starting sequence number and number of results are less or equal to 0`() {
        val numbersToColumnSequenceLabels = ConversionOfNumbersToColumnSequenceLabels()
        assertFailsWith<IllegalArgumentException>(
            message = "Both Starting sequence number (first value) and number Of results (second value) must be greater than 0",
            block = {
                numbersToColumnSequenceLabels.validationOfNumbers(0, 0)
            }
        )
    }
    @Test
    fun `should throw error if sequence of numbers is beyond that assigned to ZZZ`() {
        val numbersToColumnSequenceLabels = ConversionOfNumbersToColumnSequenceLabels()
        assertFailsWith<IllegalArgumentException>(
            message = "Sequence of numbers exceeds max value assigned to column label for ZZZ",
            block = {
                numbersToColumnSequenceLabels.validationOfNumbers(17577, 1)
            }
        )
    }
    @Test
    fun `should return correct column label based on the number entered`() {
        val numbersToColumnSequenceLabels = ConversionOfNumbersToColumnSequenceLabels()
        assertEquals("AA", numbersToColumnSequenceLabels.numberToColumnLabel(27))
    }
    @Test
    fun `should return a list of string column label based on the starting sequence number and number of results entered`() {
        val numbersToColumnSequenceLabels = ConversionOfNumbersToColumnSequenceLabels()
        assertEquals("AA, AB, AC, AD, AE, AF, AG, AH, AI, AJ",
            numbersToColumnSequenceLabels.generatingColumnLabels(27, 10))
    }
}