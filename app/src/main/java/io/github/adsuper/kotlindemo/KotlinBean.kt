package io.github.adsuper.kotlindemo

/**
 * 作者：luoshen/rsf411613593@gmail.com
 * 时间：2017年08月09日
 * 说明：一个简单的 javaBean
 */
class KotlinBean(var name: String, var age: Int) {
    val data: String get() = name + age
}