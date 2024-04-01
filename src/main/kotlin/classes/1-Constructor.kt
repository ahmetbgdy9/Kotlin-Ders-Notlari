package classes


// Eğer visibilty gibi zorunluluklarımız yoksa Class isminden sonra constructor keywordünü yazmak  zorunda değiliz.
// init bloğu primary constructor'ın çağrımında çalışıyor. özetle init bloğu primary constructor'ın body'sidir
// secondary constuctor'ın en sonuna primary constructor'ı işaret etmemiz gerekiyor (this())

class Turtle constructor(var feetCount: Int = 4, var name:String = "Murtle") {

	val feetColor: String = "Brown"
	val headCount: Int = 1
	val headColor: String = "Brown"
	val shelterColor: String = "Green"
	val tailCount: Int = 1
	val tailColor: String = "Brown"
	val age: Int = 1
	val sex: String = "Female"
	val isMarried: Boolean = true

	init {
		println("Primary constructor created")
	}

	constructor(mIsMarrid: Boolean = true) : this(4,"kadir") {
		println("Secondary constructor created")
	}

//	constructor(mName: String = "Tosbik", mFeetCount: Int = 4, isMarried: Boolean = true, sex: Boolean) : this() {
//		println("Secondary constructor created")
//	}

	fun makeASound(): String {
		return  "hthrhtr"
	}

	fun eatMeal() {
		name = "dsa"
		feetCount = 12
	}

	fun walk() {

	}

	fun swim() {

	}
}

fun main() {
	val turtle1 = Turtle().makeASound()
	println(turtle1)

}