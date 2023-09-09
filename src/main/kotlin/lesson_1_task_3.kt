
fun main() {

    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7
    val landing : String = "0$hour:0$minute"

    println("Год полета Юрия Гагарина в космос - $year")
    println("Время взлета - $landing")

    hour = 10
    minute = 55

    val takeOff : String = "$hour:$minute"
    println("Время Посадки - $takeOff")



}