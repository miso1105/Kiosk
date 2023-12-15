package com.example.kiosk

interface DisplayInfo {
    fun displayInfo(id: Int, name: String, price: Int, description: String)

    fun cart()

    fun fixOrder()

    fun pay()
}