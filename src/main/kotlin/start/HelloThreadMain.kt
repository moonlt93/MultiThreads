package org.example.start

// kotlin은 root main 이거나 companion object 하위 형태의 fun main이면 java psvm 처럼 실행 가능
class HelloThreadMain {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("${Thread.currentThread().name} - main() start")
            val thread = HelloThread()
            println("${Thread.currentThread().name} - hello thread 호출 전")
            thread.start()
            println("${Thread.currentThread().name} - hello thread 호출 후")
            println("${Thread.currentThread().name} - main() end")
        }
    }

}

fun main() {

    println("${Thread.currentThread().name} - main() start")
    val thread = HelloThread()
    println("${Thread.currentThread().name} - hello thread 호출 전")
    thread.start()
    println("${Thread.currentThread().name} - hello thread 호출 후")
    println("${Thread.currentThread().name} - main() end")
}