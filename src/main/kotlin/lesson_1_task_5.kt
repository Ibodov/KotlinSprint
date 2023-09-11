
fun main() {
    val secondInSpace = 3800
    val secondInMinute = (secondInSpace % 3600) / 60
    val secondInHour = secondInSpace / 3600
    val secondInSecond = (secondInSpace % 3600) % 60

    println("Количество секунд в космосе - $secondInSpace")
    println("Количество секунд в минутах - $secondInMinute")
    println("Количество секунд в часах - $secondInHour")
    println("Количество секунд в секундах - $secondInSecond")

    println()

    val total = "$secondInHour:$secondInMinute:$secondInSecond"
    println("Время, проведенное в космосе - $total")


}