package org.example.util

import util.MyLogger.log

abstract class ThreadUtils {

    fun sleep(time: Long) {
        try {

            Thread.sleep(time)

        } catch (e: InterruptedException) {
            log("interrupt 발생 : ${e.message}")
            throw RuntimeException(e)
        }
    }
}