package com.shawonarefin.collections.list

/**
 *  Functions associateBy and groupBy build maps from the elements of a collection
 *  indexed by the specified key.
 *  They key is defined in the keySelector parameter.
 *  Optional valueSelector can be used to define what will be stored in the value of
 *  the map element.
 *
 *  The difference between associateBy and groupBy is how they process objects with
 *  the same key.
 *
 *  associateBy uses the last suitable element as the value.
 *  groupBy builds a list of all suitable elements and puts it in the value.
 *
 *  The returned map preserves the entry iteration order of the original collection.
 *
 */

data class Person(val name: String
                  , val city: String
                  , val phone: String) // 1

fun main() {
    val people = listOf(
        Person("John", "Boston", "+1-888-123456"),
        Person("Sarah", "Munich", "+49-777-789123"),
        Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
        Person("Vasilisa", "Saint-Petersburg", "+7-999-123456"))

    val phoneBook = people.associateBy { it.phone }
    val cityBook = people.associateBy(Person::phone, Person::city)
    val peopleCities = people.groupBy(Person::city, Person::name)

    println(phoneBook)
    println(cityBook)
    println(peopleCities)

}

