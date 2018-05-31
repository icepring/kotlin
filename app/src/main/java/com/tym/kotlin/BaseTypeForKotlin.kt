package com.tym.kotlin

/**
 * @Author Jliuer
 * @Date 2018/05/23/15:52
 * @Email Jliuer@aliyun.com
 * @Description
 */
class BaseTypeForKotlin {
    private val a: Int = 4
    private val b: Int = 5

    private val c = a + b
    private val d = c and 1

    val intArray = arrayOf(1, 2)
    val stingArray = arrayOf("1", 2)
    val testArray = Array(8, { i -> (i * i).toString() })


    val string1 = """tts>s""".trimMargin(">")

    val ifvalue = if (a > b) {
        ""
    } else {
        "1"
    }

    val whenvalue = when (a) {
        1 -> println("not")
        else -> {
            check("ss")
        }
    }

    fun lable() {
        arrayOf(1, 2, 3, 4).forEach{
            check(it.toString())
            if (it == 5) {
                return
            }
        }
    }

    fun dealInt(i: Int): Int {
        return i.inc()
    }

    fun check(a: String): Boolean {
        testArray[2] = ""
        println("name is ${string1.length}")

        for (item: Int in intArray) {

        }

        for (i in 0..12) {

        }

        for (i in 89 downTo 8 step 2) {

        }

        for (index in stingArray.indices) {

        }

        for ((index, value) in stingArray.withIndex()) {

        }

        return a.length > 1
    }

    private val double: Double? = 2.0
}