package sas3.KotlinInAction.Ch02

class Person(
        val name: String,
        val dateOfBirth: String)
{

}


fun main(args: Array<String>) {
    val person: Person = Person("Shimon","24 Feb 1987")
    println(person.toString())
}