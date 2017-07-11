package b.learn.kotlintest

import android.util.Log

/**
 * Created by bilal on 6/19/17.
 */

fun main() {
    Log.d("","This is not static but package level");
}

open class Person(var name: String, var age: Int, var college: String?) {

    var email: String = ""

    constructor(name:String, age:Int, college: String?, email: String) : this(name, age, college) {
        this.email = email
    }

    open fun isEligibleToVote(): Boolean {
        // If age is greater or equal to 18
        // return true

        return age >= 18
    }

    fun isOctogenarian(): Boolean = age in 80 .. 89

    val sumLambda: (Int, Int) -> Int = {x,y -> x+y}
    val actualSum = sumLambda(3,4)

}