package com

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    println("== 명언 앱 ==")

    var num = 0

    while (true) {
        print("명령) ")
        when (sc.nextLine()) {
            "종료" -> break
            "등록" -> {
                print("명언 : ")
                val content = sc.nextLine()
                print("작가 : ")
                val author = sc.nextLine()

                num++
                println("${num}번 명언이 등록되었습니다.")
            }
        }
    }
}