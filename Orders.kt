package com.example.kiosk

class Orders : DisplayInfo, MainScreen() {
    var cartHashMap = HashMap<String, Any>()   // 장바구니에 담기 위한 해쉬맵 선언. key:value로 두개
    var moneyList = mutableListOf<Any?>()
    var payment: Int = 0
    override fun displayInfo(id: Int, name: String, price: Int, description: String) {
        println("${name}     | ${price}원 |  ${description}")
        // 장바구니에 이름,가격,설명 추가
        cartHashMap.put("name", name)
        cartHashMap.put("price",price)
        cartHashMap.put("description",description)
        cart()
    }

    override fun cart() {
        while (true) {
            println("위 메뉴를 장바구니에 추가하시겠습니까?\n1. 확인      2.취소")
            try {
                var reOrders = readLine()!!.toInt()
                if(reOrders == 1) {
                    println("${cartHashMap.get("name")} 가 장바구니에 추가되었습니다.\n")   // 무조건 나오는거
                    moneyList.add(cartHashMap.get("price"))
                    println(moneyList)
                    fixOrder()
                } else if (reOrders == 2) {
                    println("주문을 종료합니다. 이용해주셔서 감사합니다.")
                    break
                } else {
                    continue
                }
            } catch (e: Exception) {
                println("잘못된 번호를 입력했습니다. 재입력해주세요.")
                continue
            }
        }
    }

    override fun fixOrder() {
        // 메뉴판만 프린트해서 보여주기
        var mainScreen = MainScreen()
        while (true) {
            mainScreen.initScreen()
            println("5. 주문  :  장바구니를 확인 후 주문합니다.\n6. 취소  :  진행중인 주문을 취소합니다.")
            try {
                var fixOrders = readLine()!!.toInt()
                if (fixOrders == 5) {
                    println("아래와 같이 주문하시겠습니까?\n")
                    println("[ 주문 ]\n${cartHashMap.get("name")}    | ${cartHashMap.get("price")}원 |  ${cartHashMap.get("description")}")
                    pay() // 주문 금액 프린트
                } else if(fixOrders == 6) {
                    println("주문이 취소되었습니다. 이용해주셔서 감사합니다")
                    cartHashMap.clear()
                    break
//                } else if (fixOrders == 1) {
//                    mainScreen.enterMenuOption(1)
//                } else if (fixOrders == 2) {
//                    mainScreen.enterMenuOption(2)7
//                } else if (fixOrders == 3) {
//                    mainScreen.enterMenuOption(3)
//                } else if (fixOrders == 4) {
//                    mainScreen.enterMenuOption(4)
//                }
                }
            } catch (e: Exception) {
                println("잘못된 번호를 입력했습니다. 재입력해주세요.")
                continue
            }

        }

    }

    override fun pay() {
        //    println(cartHashMap) //{price=2500, name=얼그레이, description=홍차 특유의 풍부한 플레이버를 만끽할 수 있는 허브티.}
        for (i in moneyList){
            payment += i
        }
        print("주문 금액 : ${payment}원\n\n")
    }

}

private operator fun Any.plusAssign(prices: Any?) {

}
