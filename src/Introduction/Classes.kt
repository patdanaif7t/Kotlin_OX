package Introduction

class Customer                                  // 1

class Contact(val id: Int, var email: String)   // 2

fun main(ag: Array<String>) {


    val contact = Contact(1, "mary@gmail.com")  // 4

    println(contact.id)                         // 5
    contact.email = "jane@gmail.com"            // 6
}