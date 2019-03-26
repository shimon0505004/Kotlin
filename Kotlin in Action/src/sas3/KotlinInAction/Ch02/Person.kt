package sas3.KotlinInAction.Ch02

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

class Person(
        val name: String,
        val dateOfBirth: String)
{
    val currentAge:Int
    get() {
        var dateOfBirth = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("MM/dd/yyyy"))
        var dateToday = LocalDate.now()
        return ChronoUnit.YEARS.between(dateOfBirth,dateToday).toInt()
    }


}


fun main(args: Array<String>) {
    val person = Person("Shimon","02/24/1987")
    println(person.toString())
    println("The name is ${person.name} \n " +
            "date of birth is ${person.dateOfBirth} \n" +
            "current age is ${person.currentAge}"
    )
}