package study.step4.controller

import study.step4.model.RacingCarNameGenerator.convertCarNamesList
import study.step4.model.RacingGame
import study.step4.model.RandomDigit
import study.step4.view.InputView.inputRacingCarInfo
import study.step4.view.ResultView.resultRacingCar

class RacingGameController {
    fun raceGame() {
        runCatching {
            val (racingCarNames, repeatRace) = inputRacingCarInfo()

            val racingGame = RacingGame(convertCarNamesList(racingCarNames), repeatRace, RandomDigit())
            racingGame.race()

            resultRacingCar(racingGame.getChampions(), racingGame.getCars(), repeatRace)
        }.onFailure { e ->
            println("주의: ${e.message}")
        }
    }
}
