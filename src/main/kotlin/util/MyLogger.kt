package org.example.util

import java.time.format.DateTimeFormatter
import java.util.Objects

abstract class MyLogger {

    val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS")

    fun log(obj: Objects) {

        val time = formatter.format(java.time.LocalDateTime.now()).format(formatter)
        println("$time [${Thread.currentThread().name.padStart(9)}] $obj")

    }


}