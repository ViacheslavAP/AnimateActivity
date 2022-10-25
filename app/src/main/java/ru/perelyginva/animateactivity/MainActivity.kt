package ru.perelyginva.animateactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ru.perelyginva.animateactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding?.root)


        binding?.btnFirst?.setOnClickListener(View.OnClickListener {
            val startSecondActivity = Intent(this, TwoActivity::class.java)
            startActivity(startSecondActivity)
            overridePendingTransition(R.anim.slide_up_in, R.anim.slide_up_out)
        })
    }


}