package com.thoughtworks.kotlin_basic.util

class ConversionOfNumbersToColumnSequenceLabels {

    fun validationOfNumbers (start: Int, noOfResults: Int): Boolean {
        if (start <= 0 && noOfResults <= 0) {
            throw IllegalArgumentException("Both Starting sequence number (first value) and number Of results (second value) must be greater than 0")
        } else if (start <= 0 || noOfResults <= 0) {
            if (start <= 0) {
                throw IllegalArgumentException("Starting sequence number (first value) must be greater than 0")
            } else {
                throw IllegalArgumentException("Number Of results (second value) must be greater than 0")
            }
        } else {
            return true
        }
    }
}