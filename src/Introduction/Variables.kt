package Introduction

fun someCondition() = true

fun main(args: Array<String>) {
    var a: String = "initial"  // 1
    println(a)
    val b: Int = 1             // 2
    val c = 3

    var e: Int
    //println(e) // Print e ไม่ได้เพราะไม่ได้กำหนดค่าให้มัน


    val d: Int  // 1


    if (someCondition()) {
        d = 1   // 2
    } else {
        d = 2   // 2
    }

    println(d) // 3
}


