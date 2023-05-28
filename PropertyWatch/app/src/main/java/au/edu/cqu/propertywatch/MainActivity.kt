package au.edu.cqu.propertywatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {

            val fragment = PropertyDetailsFragment()

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, fragment)
                .commit()
        }

    }
}