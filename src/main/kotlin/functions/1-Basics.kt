package org.example.functions

/**
 * fun keywordu ile fonksiyonlar baslar.
 * fonksiyon ismi verilir.
 * parametre parantezleri acilir ve parantezler girilir.
 * : operatoru ve geri donus degeri yazilir.
 * fonksiyon bodysi acilir ve kapanir.
 * Geri donus degeri verilmeyen fonksiyonlar Unit tipini geri dondurur.
 */

fun main(): Unit {


	/**
	 * Fonksiyon cagirilirken ismi ve parametreleri kullanilir.
	 * Eger bir geri donusu varsa bir degiskene aktarilir.
	 */

	takeSquare(2)
	val squareValue = takeSquare(2)
	println("SquareValue:$squareValue")

	/*---------------------------------------------------------------------------------------------------------------------*/

	/**
	 * Bir classin fonksiyonunu cagirirken ise nokta isaretini kullaniriz.
	 */

	Math.pow(2.0, 3.0)

	/*---------------------------------------------------------------------------------------------------------------------*/
	/**
	 * Default degeri olan parametrelere sahip bir fonksiyon cagrilirken,default degeri olan parametrelere deger atamak sart degildir.Default degeri olan bu parametreler opsiyonel parametrelerdir.
	 * Default degeri olan parametrelere deger atanmadan fonksiyon cagirilacaksa,bu durumda parametre sirasi degisir.
	 * Ide'ye hangi parametreye deger atadigimizi soylemek icin Named Arguments'leri kullanmamiz gerekir.
	 * name argumentleri verdigimizde siralamanin bir onemi yoktur.
	 */


	reformatMessage("Message", true, 7, "tr")
	reformatMessage("Message", size = 7, lang = "tr")
	reformatMessage("Message", true, 7)
	reformatMessage("Message", size = 7)
}

/*---------------------------------------------------------------------------------------------------------------------*/

/**
 * parametre  olan number,degisken tanimlanir gibi tanimlanir.
 * Fonksiyon parametresi tanimlanirken,val veya var kullanilmaz.
 */
fun takeSquare(number: Int): Int {
	return number * number
}

/*---------------------------------------------------------------------------------------------------------------------*/

/**
 * = ile fonksiyonlara default degerler verilebilir.(Default Argument)
 * Default degeri atamasi yapmak,function overload islemi yapmamizi saglar.
 * Tekrar tekrar ayni fonksiyonun farkli varyasyonlarini yazmak zorunda kalmayiz.
 * Özetle biz kotlinde bir adet default deger alan fonksiyon olusturuyorsak,arka planda 2 adet fonksiyon olusur.
 * Biri bu fonksiyonun bos hali,digeri ise parametre alan halidir.
 * Aynı fonksiyon ismini kullanarak,parametre sayılarını degistirerek ya da parametre tiplerini degistirerek birden fazla kez kullanilmasina function overload denir.(İs görüsmelerinde cikabilir)
 */

fun reformatMessage(message: String, isUpperCase: Boolean = false, size: Int, lang: String = "tr") {
	println("Message:$message, isUpperCase:$isUpperCase, Size:$size, Lang:$lang")
}

/*---------------------------------------------------------------------------------------------------------------------*/