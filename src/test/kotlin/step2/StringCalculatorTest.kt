package step2

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
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


	context("예외 상황 처리") {
		test("null 또는 빈 문자열 입력시 예외가 발생한다") {
			shouldThrow<IllegalArgumentException> {
				calculator.calculate("")
			}.message shouldBe "입력값이 null이거나 빈 문자열입니다."

			shouldThrow<IllegalArgumentException> {
				calculator.calculate("   ")
			}.message shouldBe "입력값이 null이거나 빈 문자열입니다."
		}

		test("잘못된 연산자 입력시 예외가 발생한다") {
			forAll(
				row("2 @ 3"),
				row("4 # 5"),
				row("6 $ 7")
			) { expression ->
				shouldThrow<IllegalArgumentException> {
					calculator.calculate(expression)
				}.message shouldBe "사칙연산 기호가 아닙니다."
			}
		}
	}
})
