package b.learn.kotlintest

/**
 * Created by bilal on 6/19/17.
 */


class Employee(name: String, age: Int, college: String?, var company: String) : Person(name, age, college) {

    override fun isEligibleToVote(): Boolean {
        // Always return true
        return true
    }

}