package org.example.start

class HelloThread : Thread() {

    override fun run() {
        println(String.format("[%s] - run () ", Thread.currentThread().name))
    }

}