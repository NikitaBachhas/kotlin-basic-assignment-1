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
}