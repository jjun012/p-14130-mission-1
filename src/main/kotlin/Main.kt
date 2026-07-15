package com

import java.util.Scanner

data class Quote(val num: Int, val content: String, val author: String)

fun main() {
    val sc = Scanner(System.`in`)
    println("== 명언 앱 ==")

    val list = mutableListOf<Quote>()
    var num = 0

    while (true) {
        print("명령) ")
        val command = sc.nextLine()

        when {
            command == "종료" -> break

            command == "등록" -> {
                print("명언 : ")
                val content = sc.nextLine()
                print("작가 : ")
                val author = sc.nextLine()

                num++
                println("${num}번 명언이 등록되었습니다.")
                list.add(Quote(num, content, author))
            }

            command == "목록" -> {
                println("번호 / 작가 / 명언")
                println("----------------------")
                for (i in list.size - 1 downTo 0) {
                    val quote = list[i]
                    println("${quote.num} / ${quote.author} / ${quote.content}")
                }
            }

            command.startsWith("삭제?id=") -> {
                val id = command.substringAfter("id=").toInt()
                val quote = list.find { it.num == id }

                if (quote == null) {
                    println("${id}번 명언은 존재하지 않습니다.")
                } else {
                    list.remove(quote)
                    println("${id}번 명언이 삭제되었습니다.")
                }
            }
        }
    }
}