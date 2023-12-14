package com.example.kiosk

//var coffeeMutableData = mutableMapOf("아메리카노" to 1500, "헤이즐넛 아메리카노" to 2500, "카푸치노" to 2700, "콜드브루 커피" to 3300, "메가리카노" to 3000, "id" to 1)
//제이슨 형식의 데이터

var coffeeData = listOf(
    mapOf(
        "id" to 1,
        "name" to "아메리카노",
        "price" to 1500,
        "description" to "풍부한 바디감을 느낄 수 있는 스탠다드 커피."
    ),
    mapOf(
        "id" to 2,
        "name" to "헤이즐넛 아메리카노",
        "price" to 2500,
        "description" to "헤이즐넛의 풍성한 향과 달콤함을 담아 향긋하고 부드럽게 즐기는 커피."
    ),
    mapOf(
        "id" to 3,
        "name" to "카푸치노",
        "price" to 2700,
        "description" to "시나몬 파우더로 완성한 조화로운 맛의 커피."
    ),
    mapOf(
        "id" to 4,
        "name" to "콜드브루 커피",
        "price" to 3300,
        "description" to "차가운 물에 장시간 우려내 깔끔한 목넘김을 느낄 수 있는 콜드브루."
    ),
    mapOf("id" to 5, "name" to "메가리카노", "price" to 3000, "description" to "더 큼직하게 즐길 수 있는 대용량 커피.")
)


var latteData = listOf(
    mapOf(
        "id" to 1,
        "name" to "카페라떼",
        "price" to 2900,
        "description" to "진한 에스프레소와 부드러운 우유가 어우러져 고소한 풍미를 완성한 라떼."
    ),
    mapOf(
        "id" to 2,
        "name" to "바닐라 라떼",
        "price" to 3200,
        "description" to "바닐라의 짙은 향과 풍부한 폼 밀크의 조화가 인상적인 달콤한 라떼."
    ),
    mapOf(
        "id" to 3,
        "name" to "큐브 라떼",
        "price" to 3900,
        "description" to "연유를 섞은 라떼에 에스프레소를 얼린 커피큐브를 올려, 녹을수록 더 진한 커피가 느껴지는 라떼."
    ),
    mapOf(
        "id" to 4,
        "name" to "헤이즐넛 라떼",
        "price" to 3200,
        "description" to "부드러운 카페라떼에 헤이즐넛의 풍부한 향과 달콤함을 담아 향긋하게 즐길 수 있는 라떼."
    ),
    mapOf(
        "id" to 5,
        "name" to "연유라떼",
        "price" to 3700,
        "description" to "향기로운 에스프레소 샷, 부드러운 우유 그리고 달콤한 연유가 조화롭게 어우러진 라떼."
    )
)


var teaData = listOf(
    mapOf(
        "id" to 1,
        "name" to "녹차",
        "price" to 2500,
        "description" to "고소한 감칠맛과 부드러운 목넘김으로 산뜻하게 마음을 위로하는 국내산 녹차."
    ),
    mapOf(
        "id" to 2,
        "name" to "얼그레이",
        "price" to 2500,
        "description" to "홍차 특유의 풍부한 플레이버를 만끽할 수 있는 허브티."
    ),
    mapOf(
        "id" to 3,
        "name" to "캐모마일",
        "price" to 2500,
        "description" to "마음을 진정 시켜주는 산뜻한 풀내음을 느낄 수 있는 허브티."
    ),
    mapOf(
        "id" to 4,
        "name" to "유자차",
        "price" to 3000,
        "description" to "비타민이 가득 든 상큼달콤한 유자를 듬뿍 넣어 향긋한 즐거움을 전하는 과일티."
    ),
    mapOf(
        "id" to 5,
        "name" to "허니자몽블랙티",
        "price" to 3500,
        "description" to "달콤한 꿀청에 재운 자몽에 홍차의 부드러움을 어우른 상큼한 과일티."
    ),
)



//data class Coffee(
//    val name: String,
//    val price: Int,
//    val description: String
//)

