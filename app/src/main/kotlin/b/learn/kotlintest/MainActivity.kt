package b.learn.kotlintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import learn.b.kotlintest.R

//https://kotlinlang.org/docs/tutorials/android-plugin.html
//http://andressjsu.blogspot.com/2016/04/kotlin-tutorials.html
//https://code.tutsplus.com/tutorials/an-introduction-to-kotlin--cms-24051
//https://www.raywenderlich.com/132381/kotlin-for-android-an-introduction
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.setText("Hello, Kotlin world!")
        hello.setText("Hi!")

        hello.setOnClickListener { view ->

                Log.d("Kotlin Test", "Clicked  ")
                Log.d("Kotlin Test", "Clicked  2")
            
        }

        var jake = Person("Jake Hill", 15, "Stephen's College", "jake.hill@example.com")

        Log.d("Name ", "Name " + jake.name)

        jake.isEligibleToVote()

        if (jake.isTeenager()) {
            Log.d("isTeenager ", "Jake is teenager")
        } else {
            Log.d("isTeenager ", "Jake is not teenager")
        }
        main();

        if (jake.isOctogenarian()) {
            Log.d("isOctogenarian ", "Jake is Octogenarian")
        } else {
            Log.d("isTeenager ", "Jake is not Octogenarian")
        }
    }

    fun Person.isTeenager(): Boolean {

        // If age falls in the range
        // 13-19 return true

        return age in 13..19
    }

}



