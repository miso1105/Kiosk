package com.example.kiosk

// 리스트에 쓰일 프로퍼티 선언 ()증괄호로 묶는다.
data class Menu(
    val id: Int,
    val name: String,
    val price: Int,
    val description: String
)