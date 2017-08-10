package io.github.adsuper.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    var name = "zhangsan";


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 获取一个类的对象
        val kotlinBean = KotlinBean("珞神", 26)

    }


    /**
     * 方法的定义
     * 第一个 ： 后边的代表参数类型
     * 第二个 ： 后边的代表返回值类型
     */
    fun getName(name: String): String {

        var name1 = name

        return name1
    }

    /**
     * if 判断语句，与 java 一致
     */
    fun getMax(a: Int, b: Int): Int {
        if (a > b) return a else return b

    }

    /**
     * when 表达式 ，代替 switch
     */
    fun switch(age: Int): Int {

        when (age) {
        //在 1 - 10 之间，包含开头和结尾
            in 1..10 -> return 10
        //在 1 - 10 之间，包含开头,不包含结尾
            in 1 until 10 -> return 9

            11 -> return 11
        //多个分支条件放在一起，用逗号分隔
            12, 13 -> return 13
        //不在 1 - 13 的区间内
            !in 1..13 -> return 14
        //相当于 Switch 的 default
            else -> {
                return 20
            }
        }

    }

    /***
     * for循环
     */
    fun for0(){
        for (i in 1..10 step 3){
            //打印结果为：1,4,7,10
            println(i);
        }
    }

    /**
     * 集合的创建方式 及 遍历
     */
    fun listText(){

        val items = listOf<Int>()
        val items2 = mutableListOf<Int>()

        //Mutable开头的表示可以对集合进行操作，如改变数据等
        val numbers:MutableList<Int> = mutableListOf()
        println(numbers.size)
        numbers.add(1)
        numbers.add(2)
        numbers.add(3)
        numbers.add(4)
        println(numbers.size)

        //需要用到角标的遍历方式 ，number 代表角标
        for (number in numbers.indices) {
            println(numbers[number])
        }

        //不需要用到角标， number 代表 集合中的元素
        for (number in numbers) {
            println(number)
        }
        //不需要用到角标， it 代表 集合中的元素
        numbers.forEach {

            println(it)
        }

        //numbersList 跟随着  numbers 变化，不管numbers 如何操作，numbersList 最终结果肯定与 numbers 一样
        val numbersList:List<Int> = numbers


        numbers.add(5)
        println(numbersList.size)

    }



}
