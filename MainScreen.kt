package com.example.kiosk

open class MainScreen {
    fun initScreen() {
        println("MEGA COFFEE에 오신 것을 환영합니다.")
        println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n[ MEGA COFFEE ]\n1. COFFEE\n2. LATTE\n3. TEA\n0. 종료")
    }

    fun enterMenuOption(choiceNum: Int): Any? {
        return when (choiceNum) {
            0 -> {
                return println("이용해주셔서 감사합니다.")
            }
            1 -> {
                println("[ COFFEE MENU ]\n1. 아메리카노: 1,500원 \n2. 헤이즐넛 아메리카노: 2,500원 \n3. 카푸치노: 2,700원 \n4. 콜드브루 커피: 3,300원 \n5. 메가리카노(1L 커피): 3,000원 \n0. 뒤로가기")
                while (true) {
                    try {
                        var drinkNumber = readLine()?.toInt()
                        if (drinkNumber in 1..5) {
                            return Pair(1, drinkNumber)
                        } else if (drinkNumber == 0) {
                            main()
                        } else {
                            println("해당 메뉴 번호를 다시 입력해주세요.")
                            println("[ COFFEE MENU ]\n1. 아메리카노: 1,500원 \n2. 헤이즐넛 아메리카노: 2,500원 \n3. 카푸치노: 2,700원 \n4. 콜드브루 커피: 3,300원 \n5. 메가리카노(1L 커피): 3,000원 \n0. 뒤로가기")
                            continue
                        }

                    } catch (e: Exception) {
                        println("해당 메뉴 번호를 다시 입력해주세요.")
                        println("[ COFFEE MENU ]\n1. 아메리카노: 1,500원 \n2. 헤이즐넛 아메리카노: 2,500원 \n3. 카푸치노: 2,700원 \n4. 콜드브루 커피: 3,300원 \n5. 메가리카노(1L 커피): 3,000원 \n0. 뒤로가기")
                        continue
                    }
                }
            }

            2 -> {
                println("[ LATTE MENU ]\n1. 카페라떼: 2,900원 \n2. 바닐라 라떼: 3,200원 \n3. 큐브 라떼: 3,900원 \n4. 헤이즐넛 라떼: 3,200원 \n5. 연유라떼: 3,700원 \n0. 뒤로가기")
                while (true) {
                    try {
                        var drinkNumber = readLine()?.toInt()
                        if (drinkNumber in 1..5) {
                            return Pair(2, drinkNumber)
                        } else if (drinkNumber == 0) {
                            main()
                        } else {
                            println("해당 메뉴 번호를 다시 입력해주세요.")
                            println("[ COFFEE MENU ]\n1. 아메리카노: 1,500원 \n2. 헤이즐넛 아메리카노: 2,500원 \n3. 카푸치노: 2,700원 \n4. 콜드브루 커피: 3,300원 \n5. 메가리카노(1L 커피): 3,000원 \n0. 뒤로가기")
                            continue
                        }
                    } catch (e: Exception) {
                        println("해당 메뉴 번호를 다시 입력해주세요.")
                        println("[ COFFEE MENU ]\n1. 아메리카노: 1,500원 \n2. 헤이즐넛 아메리카노: 2,500원 \n3. 카푸치노: 2,700원 \n4. 콜드브루 커피: 3,300원 \n5. 메가리카노(1L 커피): 3,000원 \n0. 뒤로가기")
                        continue
                    }
                }
            }

            3 -> {
                println("[ TEA MENU ]\n1. 녹차: 2,500원 \n2. 얼그레이: 2,500원 \n3. 캐모마일: 2,500원 \n4. 유자차: 3,000원 \n5. 허니자몽블랙티: 3,500원 \n0. 뒤로가기")
                while (true) {
                    try {
                        var drinkNumber = readLine()?.toInt()
                        if (drinkNumber in 1..5) {
                            return Pair(3, drinkNumber)
                        } else if (drinkNumber == 0) {
                            main()
                        } else {
                            println("해당 메뉴 번호를 다시 입력해주세요.")
                            println("[ COFFEE MENU ]\n1. 아메리카노: 1,500원 \n2. 헤이즐넛 아메리카노: 2,500원 \n3. 카푸치노: 2,700원 \n4. 콜드브루 커피: 3,300원 \n5. 메가리카노(1L 커피): 3,000원 \n0. 뒤로가기")
                            continue
                        }
                    } catch (e: Exception) {
                        println("해당 메뉴 번호를 다시 입력해주세요.")
                        println("[ COFFEE MENU ]\n1. 아메리카노: 1,500원 \n2. 헤이즐넛 아메리카노: 2,500원 \n3. 카푸치노: 2,700원 \n4. 콜드브루 커피: 3,300원 \n5. 메가리카노(1L 커피): 3,000원 \n0. 뒤로가기")
                        continue
                    }
                }
            }

            else -> {
                println("해당 메뉴 번호를 다시 입력해주세요.")
                main()
            }
        }
    }

    // try-catch에서 리턴 받으려면 메소드를 새로 만들고 while문 안에서 끝나는 기능과 함께 값을 반환 받으면 됨
    fun accesId(): Any? {
        while (true) {
            try {
                var choiceNum = readLine()!!.toInt()
                var drinkNumber = this.enterMenuOption(choiceNum)          // this 키워드를 사용한 클래스 자신 MainScreen을 지칭
                return drinkNumber
            } catch (e: Exception) {
                println("해당 메뉴 번호를 다시 입력해주세요.")
                main()
            }
        }
    }

}


