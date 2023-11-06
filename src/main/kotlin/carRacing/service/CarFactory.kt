package carRacing.service

import carRacing.domain.Car
import carRacing.view.CarInfo

/*
* CarFactory는 Car를 생성하는 역할을 한다.
*
* CarFactory 구현 전략은 다음과 같다.
* 1. CarFactory를 상속받는 클래스는 createCars(carInfoList: List<CarInfo>)를 구현해야 한다.
* - createCars(carInfoList: List<CarInfo>)는 매개 변수로 받은 CarInfoList 중에 MovementController가 null이 아닌 CarInfo만 MovementController를 주입하여 Car를 생성한다.
* 2. CarFactory 구현체는 MovementController와 1:1 관계로 생성되어야 한다.
* - Ex) RandomMovementCarFactory는 RandomMovementController를 주입받아 Car를 생성한다.
*
* */
interface CarFactory {
    fun createCars(carInfoList: List<CarInfo>): List<Car>
}
