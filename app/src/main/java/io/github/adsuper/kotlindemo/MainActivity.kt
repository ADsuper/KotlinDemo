package io.github.adsuper.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    val num = 1..10

    //定义一个变量,var 对应的 是 可变变量
    var name = "zhangsan";
    // val 在初始化之后，不能被改变，对应的是 java 中的 final
//    val age: String

    var age = if (2 > 1) 3 else 4


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 获取一个类的对象
        val kotlinBean = KotlinBean("珞神", 26)

      kotlinBean.name = "zhangsan"

        val javabean = Javabean()

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
     * if 判断语句
     */
    fun getMax(a: Int, b: Int): Int {
        if (a > b) return a else return b

    }

    /**
     * when 表达式 ，代替 switch
     */
    fun switch(age: Int): Int {
        when  {
        //在 1 - 10 之间，包含开头和结尾
            age in 1..10 -> return 10
        //在 1 - 10 之间，包含开头,不包含结尾
            age in 1 until 10 -> return 9

            age == 11 -> return 11

        //不在 1 - 13 的区间内
            age !in 1..13 -> return 14
        //相当于 Switch 的 default
            else -> {
                return 20
            }
        }

    }

    /***
     * for循环
     */
    fun for0() {
        //如果正序 + 3 ，如果倒序 - 3
        for (i in 1..10 step 3) {
            //打印结果为：1,4,7,10
            println(i);
        }
        //循环条件 1 - 9 不包含 10
        for (i in 1 until 10) {

            println(i);
        }
        //循环条件：10 -1 倒序 包含 10 和 1
        for (i in 10 downTo 1) {
            println(i);
        }

    }

    /**
     * 集合的创建方式 及 遍历
     */
    fun listText() {

        val list = listOf<Int>(1,2,3)
        val list1 = arrayListOf<Int>(1,2,3)
        val list3 = mutableListOf<Int>()

        val set = setOf<Int>()
        val hashSet = hashSetOf<Int>()
        val linkedSet = linkedSetOf<Int>()
        val sortedSetOf = sortedSetOf(1, 2)




        val map = mapOf<Int, String>()
        val hashMap = hashMapOf<Int, String>()
        val linkedHashMap = linkedMapOf<Int, String>()
        val sortedMap = sortedMapOf("a" to "b", "c" to "d")

        val mutableMapOf = mutableMapOf<Int, String>()
        //拿到 key value
        for (mutableEntry in mutableMapOf) {
            val key = mutableEntry.key
            val value = mutableEntry.value
        }

        for (mutableEntry in mutableMapOf) {
            val key = mutableEntry.key
            val value = mutableEntry.value
        }
        //拿到 key value
        mutableMapOf.forEach {
            val key = it.key
            val value = it.value
        }
        //拿到 key value
        for ((key, value) in mutableMapOf) {
            println("$key = $value")
        }

        var arrayOf = arrayOf(1, 2)
            arrayOf[0] = 6
        println(arrayOf[0])

        val array = Array<Int>(2, init = { 1;2 })
        array.set(0,5)
        val get = array.get(0)



        val studentArray = Array<KotlinBean>(2,init = { KotlinBean("11",11) })
        studentArray.set(0,KotlinBean("11",1221))

        //Mutable开头的表示可以对集合进行操作，如改变数据等
        val numbers: MutableList<Int> = mutableListOf()
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
        //这种遍历方式可以拿到下b标，也可以拿到数据
        for ((index, element) in numbers.withIndex()) {
            println("$index = $element")
        }

        //numbersList 跟随着  numbers 变化，不管numbers 如何操作，numbersList 最终结果肯定与 numbers 一样
        val numbersList: List<Int> = numbers


        numbers.add(5)
        println(numbersList.size)

    }

    //定义一个方法的三种方式
    fun getMax2(a: Int, b: Int) = if (a > b) a else b

    fun getMax3(a: Int, b: Int): Int = if (a > b) a else b

    fun getMax4(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    //遍历 key 为 char 类型的 map 集合
    val mTreeMap = TreeMap<Char, String>()

    fun forTreeMap() {
        //赋值操作
        for (i in 'A'..'F') {
            //将 ASCII 码 转化为二进制
            val s = Integer.toBinaryString(i.toInt())
            mTreeMap[i] = s
        }
        //遍历操作
        for ((letter, binaray) in mTreeMap) {
            println("$letter = $binaray")
        }

    }
    fun varAndval() {

        var school = "天山"
        println(school)
        school = "逍遥"
        println(school)
        val school2 = "明教"
        println(school2)

        val school3: String
        school3 = "丐帮"

    }


    fun a(){

        var name = "zhangsan"
        println("hello,$name")
        println("hello,"+name+"!")
    }

    fun a1(a :Int):Int{
        return a +1
    }


}
