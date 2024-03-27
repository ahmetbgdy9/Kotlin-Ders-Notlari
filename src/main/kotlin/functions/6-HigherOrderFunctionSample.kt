package org.example.functions

fun main() {
	calculateAndPrintNormal(10, 3, 'x')
	calculateAndPrintNormal(10, 4, '+')
	calculateAndPrintNormal(10, 5, '-')
	calculateAndPrintNormal(10, 6, '/')

	println("Birinci Sayıyı giriniz: ")
	val numberOne = readLine()!!.toInt()

	println("İkinci Sayıyı giriniz: ")
	val numberTwo = readLine()!!.toInt()

	println("İşlemin türünü giriniz: ")
	val operation: String = readLine()!!

	val sumFunction = { numberOne: Int, numberTwo: Int ->
		numberOne + numberTwo
	}



	when (operation) {
		"+" -> calculateAndPrint(numberOne, numberTwo, { numberOne, numberTwo -> numberOne + numberTwo })
		"+" -> calculateAndPrint(numberOne, numberTwo, sumFunction)
		"-" -> calculateAndPrint(numberOne, numberTwo, { numberOne, numberTwo -> numberOne - numberTwo })
		"*" -> calculateAndPrint(numberOne, numberTwo, { numberOne, numberTwo -> numberOne * numberTwo })
		"/" -> calculateAndPrint(numberOne, numberTwo, { numberOne, numberTwo -> numberOne / numberTwo })
		"/" -> calculateAndPrint(numberOne, numberTwo, ::divFunction)
		"/" -> calculateAndPrint(numberOne, numberTwo, ::divFunction2)
	}
}

fun divFunction(numberOne: Int, numberTwo: Int): Int {
	return numberOne / numberTwo
}


fun divFunction2(numberOne: Int, numberTwo: Int): Int = numberOne / numberTwo


fun calculateAndPrintNormal(numberOne: Int, numberTwo: Int, operation: Char) {
	val result = when (operation) {
		'+' -> {
			numberOne + numberTwo
		}

		'-' -> {
			numberOne - numberTwo
		}

		'x' -> {
			numberOne * numberTwo
		}

		'/' -> {
			numberOne / numberTwo
		}

		else -> {
			numberOne + numberTwo
		}
	}

	println("Result : $result")

}

//fun operation(numberOne: Int,numberTwo: Int): Int {
//
//}

fun calculateAndPrint(numberOne: Int, numberTwo: Int, operation: (numberOne: Int, numberTwo: Int) -> Int) {
	val result = operation(numberOne, numberTwo)
	println("Result : $result")
}