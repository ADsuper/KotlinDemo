package io.github.adsuper.kotlindemo

/**
 * 作者：luoshen/rsf411613593@gmail.com
 * 时间：2017年08月14日
 * 说明：
 */
fun main(args: Array<String>) {

    val numbers: MutableList<Int> = mutableListOf()
    numbers.add(1)
    numbers.add(2)
    numbers.add(3)
    numbers.add(4)
    println(numbers.size)


    //这种遍历方式可以拿到下b标，也可以拿到数据
    for ((index, element) in numbers.withIndex()) {
        println("$index = $element")
    }



}



