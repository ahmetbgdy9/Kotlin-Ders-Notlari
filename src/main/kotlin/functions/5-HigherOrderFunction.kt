package org.example.functions

fun main() {

	val name = "Ahmet"
	val surName = "Bugday"

	val fullName = name + " " + surName

	fun deneme(fullName: String): String {
		return "Merhaba" + fullName
	}

	fun deneme2(fullName: String): String {
		return "Merhaba" + fullName
	}

	val welcomeMessage: String = deneme(fullName)
	println(deneme(deneme2(fullName)))


	/**
	 * 		foknsiyonlar kotlinde "firs class Cirizen" dır. Yani degiskenlere deger olarak atanabilir baska fonksiyona parametre olarak verilebilir ya da bir fonksiyonun geri donus degeri olabilir demektir.
	 * 		HOF daha basitce fonskiyon body'sidir.
	 * 		HOF basitce bir fonksiyona parametre olarak verilen fonksiyonlardır. Verilmekten kasıt, fonksiyonun cagriminin parametre kısmında yapılması degil, fonksiyonun govdesinin yani süslü parantezler arasinda kalan gorev alaninin baska bir fonksiyona parametre olarak verilmesidir.
	 *
	 * 	Yapisal olarak;
	 */

//fun foo(normalFunction: (message: String) -> Unit) {
//
////		diger kodlar
////  	diger kodlar
////  	diger kodlar
//
//
//  	normalFunction("Kekod")
//
//}
//
//fun boo(boo: String) {
//
//}
//
////Cagrilirken;
//
//fun main() {
//
//	boo("Merhaba")
//
//	foo { message ->
//		println("Message : $message")
//	}
//}


	/* ------------------------------------------------------------------------------------------- */


	/**
	 * 		HOF tanimlamanin 3 yolu vardir.
	 */

// 		Bir degiskene atayarak  tanimlayabilirsiniz.
// 		Bu durumda suslu parantezler yanina HOF in aldigi lambda okundan oonce aralik koyularak yazilir.
// 		HOF tek parametre alıyorsa bu parametreleri yazmak zorunda degiliz.
// 		Bu durumda HOF size "it" kelimesi ile HOF'in parametresi tipinde bir degisken verir !

	val higherOrderFunction = { surName: String ->
		println("surName : $surName")
		"surname : $surName"
	}

	//	ismi olamayan "anonymous function" tanimlamalari da Higher Order Function olarak, normal bir fonksiyona parametre olarak veirlebilir.

	val anonymousFunction = fun(surName: String): String {
		return  "surName : $surName"
	}

	// Anonymoous Function'in expression kullanimi ya da yine Higher Order Function olarak normal bir fonksiyona parametre olarak verilir.

	val anonymousFunction2 = fun(surName: String): String = "surname : $surName"

	//	Higher order function

	fun logPrint(message: String, count: Int): String {
		return "Log: $message"
	}

	fun foo(higherOrderFunction: (message:String, count:Int) -> String) {
		higherOrderFunction("Cod",1)
	}

	logPrint("Selam ", 23)
//	foo(::logPrint("selam"))
//	foo(logPrint("selam"))
	foo(::logPrint)



}