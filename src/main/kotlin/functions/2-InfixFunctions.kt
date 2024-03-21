package org.example.functions

/**
 * Daha okunakli kodlar yazmak icin kullanilir.
 * .(nokta) kullanimini kaldirir.
 * Bir fonksiyonu infix hale getirebilmek icin 5 sart vardir
 *
 *  1) infix keywordu ile baslar.
 *  2) fonksiyon bir uye fonksiyon olmalidir.(Bir sinifa ait olmalidir)
 *  3) ya da bir extension function olmalidir.
 *  4) sadece bir adet parametre almalidir ve bu parametre vararg olamaz.
 *  5) infix method'un parametresi default deger alamaz.
 */

/**
 * Yapisal olarak bakarsak,

infix fun infixMethod(justOneParam : AwesomeParameter) : Whatever{

}
 */

fun main() {

	val isStudent = false
	val isMale = true

	/**
	 * and,or,xor gibi onlarca infix methot vardır.
	 */

	if (!isStudent and isMale) {
		print("Öğrenci olmayan erkek.")
	}

	// infix kullanimi
	isStudent and isMale
	isStudent.and(isMale)

	val awesomeInstance = AwesomeClass()



}

class AwesomeClass() {
	infix fun downloadImage(imageUrl: String) {
		println("Image Url :$imageUrl")
	}

	infix fun specialPlus(number: Int): Int = number + 4

//	infix fun <T> downloadImage2(vararg imageUrl: T) {
//		 Bu kod çalışmaz
//	}

	/* -------------------------------------------------------------------------------------------------------------------*/

	/**
	 *      Bir sinifin icindeyken this kullanimi size bulundugu sinifi isaret eder.
	 *      Eger bir infix fonksiyon, bagli bulundugu classin icinde infix
	 *      gibi kullanilmak isteniliyorsa "this" kullanilmalidir.
	 *      Asagidaki kullanimda AwesomeClass().downloadImage(imageUrl) kullanimi olusur aslinda.(implicit)
	 */

	fun logWhenImageDownloaded(imageUrl: String) {
		downloadImage(imageUrl) // İstersek böyle normal bir şekilde çağrabiliriz. Boylesi daha mantıklı
	//	downloadImage imageUrl // yanlış kullanım
	// Class icindeki fonksiyon, "this" olmadan infix kullanilamaz. Bu sebeple bu satirdaki yanlis kullanimdir, calismaz.
		this downloadImage imageUrl // Infix ve dogru kullanimdir, calisir.
	}
}
/* -------------------------------------------------------------------------------------------------------------------*/
/**
 *  bir sinifin disindayken infix method cagirimi yapilirsa this kullanilamaz.
 *  Bir classin disindayken infix methodun cagirimi icin "this"
 *  kullanmak ise yaramaz, direkt class ismi ile cagirmak gerekir.
 *  Asagidaki function, bir top level functiondur ve bu functiondaki
 * "this" isaret edecegi bir class bulamadigi icin "this" ise yaramaz.
 */


fun logWhenImageDownloaded(imageUrl: String) {
//    this downloadImage imageUrl // İsaret edecegi birsey yok.Class'in disindadir ise yaramaz.
//   This icerisinde bulundugu classi veya icerisinde bulundugu interface denen yapiyi isaret eder.(Onemli)
}