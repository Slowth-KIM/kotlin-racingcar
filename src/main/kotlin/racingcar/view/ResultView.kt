package racingcar.view

import racingcar.car.Cars

object ResultView {
    private const val PRINT_EXPRESSION = "-"

    fun printStart() {
        println("실행 결과")
    }

    fun printResult(cars: Cars) {
        // 자동차들의 이동 거리 출력
        cars.list.forEach { car -> println(PRINT_EXPRESSION.repeat(car.distance)) }
        println()
    }
}
