package step2

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe


class StringCalculatorTest : FunSpec({
	val calculator = StringCalculator()

	context("기본 사칙 연산") {
		test("덧셈 연산을 수행한다") {
			calculator.calculate("2 + 3") shouldBe 5
		}

		test("뺄셈 연산을 수행한다") {
			calculator.calculate("5 - 3") shouldBe 2
		}

		test("곱셈 연산을 수행한다") {
			calculator.calculate("4 * 3") shouldBe 12
		}

		test("나눗셈 연산을 수행한다") {
			calculator.calculate("8 / 2") shouldBe 4
		}
	}
})
