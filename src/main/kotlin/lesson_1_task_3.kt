
fun main() {

    val year: Int = 1961
    var hour: String = "09"
    var minute: String = "07"
    val landing: String = "$hour:$minute"

    println("Год полета Юрия Гагарина в космос - $year")
    println("Время взлета - $landing")

    hour = "10"
    minute = "55"

    val takeOff : String = "$hour:$minute"
    println("Время Посадки - $takeOff")




}