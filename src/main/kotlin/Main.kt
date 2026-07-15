package com

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    println("== 명언 앱 ==")

    while (true) {
        print("명령) ")
        val command = sc.nextLine()

        if (command =="종료") {
            break
        }else if (command=="등록") {
            print("명언 : ")
            val content = sc.nextLine()
            print("작가 : ")
            val author = sc.nextLine()

        }
    }
}