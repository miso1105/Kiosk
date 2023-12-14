package com.example.kiosk

fun main() {

    var coffeeList = mutableListOf<Menu>()   // 데이터 클래스에 있는 프로퍼티로 이뤄진 커피 리스트.
    for(coffee in coffeeData) {
        var coffeeId = coffee.get("id").toString().toInt()     // get의 리턴타입이 Any?이다 toInt는 String에서만 쓸 수 있고 Any?에서만 String을 쓸 수 있다.
        var coffeeName = coffee.get("name").toString()
        var coffeePrice = coffee.get("price").toString().toInt()
        var coffeeDesciption = coffee.get("description").toString()
        var data = Menu(id = coffeeId, name = coffeeName, price = coffeePrice, description = coffeeDesciption)
        coffeeList.add(data)
    }

    var latteList = mutableListOf<Menu>()     // 데이터 클래스에 있는 프로퍼티로 이뤄진 커피 리스트.
    for(latte in latteData) {
        var latteId = latte.get("id").toString().toInt()     // get의 리턴타입이 Any?이다 toInt는 String에서만 쓸 수 있고 Any?에서만 String을 쓸 수 있다.
        var latteName = latte.get("name").toString()
        var lattePrice = latte.get("price").toString().toInt()
        var latteDesciption = latte.get("description").toString()
        var data = Menu(id = latteId, name = latteName, price = lattePrice, description = latteDesciption)
        latteList.add(data)
    }


    var teaList = mutableListOf<Menu>()   // 데이터 클래스에 있는 프로퍼티로 이뤄진 커피 리스트.
    for(tea in teaData) {
        var teaId = tea.get("id").toString().toInt()     // get의 리턴타입이 Any?이다 toInt는 String에서만 쓸 수 있고 Any?에서만 String을 쓸 수 있다.
        var teaName = tea.get("name").toString()
        var teaPrice = tea.get("price").toString().toInt()
        var teaDesciption = tea.get("description").toString()
        var data = Menu(id = teaId, name = teaName, price = teaPrice, description = teaDesciption)
        teaList.add(data)
    }

    // 메뉴 주문 시작 부분
    var mainScreen = MainScreen()
    mainScreen.initScreen()  // 웰컴 문구와 메뉴판 나옴

    // 카테고리 번호와 해당 음료 번호 추춯
    var drinkCategoryId_and_drinkNumber = mainScreen.accesId()

//    println(drinkCategoryId_and_drinkNumber) // (1, 3) : 카테고리 번호 1, 해당 음료번호 3
//    println(drinkCategoryId_and_drinkNumber.toString().get(1)) // 1 -> 카테고리 번호
//    println(drinkCategoryId_and_drinkNumber.toString().get(4)) // 3 -> 해당 음료번호

    var category = drinkCategoryId_and_drinkNumber.toString().get(1).digitToInt()  // 문자 변수의 값이 숫자인 경우 digitToInt() 함수를 사용해 명시적으로 Int 숫자로 변환
    var drinkId = drinkCategoryId_and_drinkNumber.toString().get(4).digitToInt()

//    println(coffeeList)
//    [Menu(id=1, name=아메리카노, price=1500, description=풍부한 바디감을 느낄 수 있는 스탠다드 커피.), Menu(id=2, name=헤이즐넛 아메리카노, price=2500,
//        ddescription=헤이즐넛의 풍성한 향과 달콤함을 담아 향긋하고 부드럽게 즐기는 커피.), Menu(id=3, name=카푸치노, price=2700, description=시나몬 파우더로
//            완성한 조화로운 맛의 커피.), Menu(id=4, name=콜드브루 커피, price=3300, description=차가운 물에 장시간 우려내 깔끔한 목넘김을 느낄 수 있는 콜드브루.)
//        , Menu(id=5, name=메가리카노, price=3000, description=더 큼직하게 즐길 수 있는 대용량 커피.)] // Menu 데이터 클래스로 묶인 리스트



    // 고른 음료를 화면에 띄우기
    var orders = Orders()
    if (category == 1) {
        var yourDrink = coffeeList.get(drinkId - 1)  // drinkId를 인덱스로 사용해 해당 카테고리 메뉴 리스트에 접근해서 size로 인해 -1
//        println(yourDrink)                         // Menu(id=5, name=허니자몽블랙티, price=3500, description=달콤한 꿀청에 재운 자몽에 홍차의 부드러움을 어우른 상큼한 과일티.)
        // Menu(id=5, name=허니자몽블랙티, price=3500, description=달콤한 꿀청에 재운 자몽에 홍차의 부드러움을 어우른 상큼한 과일티.)
        orders.displayInfo(yourDrink.id, yourDrink.name, yourDrink.price, yourDrink.description)
    } else if (category == 2) {
        var yourDrink = latteList.get(drinkId - 1)
        orders.displayInfo(yourDrink.id, yourDrink.name, yourDrink.price, yourDrink.description)
    } else {
        var yourDrink = teaList.get(drinkId - 1)
        orders.displayInfo(yourDrink.id, yourDrink.name, yourDrink.price, yourDrink.description)
    }





}