fun main() {

    totalSalary(5 , 500)
    totalSalary(7, 1000)

}
fun totalSalary(hour:Int, rate:Int):Int {

    var salary = hour * rate
    println( "total salary = $salary")
    return salary

}


