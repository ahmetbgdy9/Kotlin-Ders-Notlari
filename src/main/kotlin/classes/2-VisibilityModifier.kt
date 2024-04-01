package classes

// --> 4 Tane visibilty modifier var "public,private,protected,internal"
//  public    -->   Her yerden erişim
//  private   -->   Sadece class içinde erişim
//  protected -->   class içinde ve child class lardan erişim, farklı herhangi biryere erişim kapatır
//  internal  -->   sadece class içinde ve bağlı olduğu modüllerde erişim.

//  1-> encapsullation : bir classın üye değişkenlerini private tutup, bu değiskene erisecek olan
//  fonksiyonları publicte tutma olayidir.
//  2-> Top level tanımlamalar her hangi bir class'in içerisinde yer almadan
//  basitçe bir dosyanın içerisinde değişken, fonksiyon tanımlayabilriz.
//  3-> Protected tanimlama kotlin de top level olarak kullanılamaz.
//  4-> internal kotlinde var javada yok


open class Foo() {

	private var shortLine: Int = 0
	private var longLine: Int = 0

	private val name = "ahmet"

	public var surName = "bugday"

	protected val email = "sfsdfsd@gmail.com" // child class larda public - harici tüm class'larda private

	internal val age = 22 // module içerisinde public harici modullerde private

	fun printName() {
		println("Merhaba : $name")
		println("Surname : $surName")
		println("Email : $email")

	}

	fun getName(): String {
		return name
	}

	fun calculateArea(shortLine: Int, longLine: Int): Int {
		this.shortLine = shortLine
		this.longLine = longLine
		return this.shortLine * this.longLine
	}

	private fun download(url: String) {
		// video download
	}

	private fun startOwnAds() {

	}

	fun downloadVideo(url: String) {
		startOwnAds()
		download(url)
	}
}


class Boo private constructor() : Foo() {
	init {
		// name erisilemez
		surName
		age
		email
	}
}

class Doo() {
	init {
		val foo = Foo()
		//  foo.name
		foo.surName
		foo.age
		//  foo.email
	}
}


fun main() {
	val foo = Foo()
	// foo.name = "fas"
	foo.surName = "sada"
	// foo.email = "sdasa"
	foo.getName()

//    foo.calculateArea(2,4)

	foo.downloadVideo("youtube.com/videourl")
	//  foo.download("youtube.com/videourl")
}