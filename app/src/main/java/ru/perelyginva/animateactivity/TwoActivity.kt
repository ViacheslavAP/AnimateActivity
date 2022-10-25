package ru.perelyginva.animateactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ru.perelyginva.animateactivity.databinding.ActivityTwoBinding

class TwoActivity : AppCompatActivity() {
    private var binding: ActivityTwoBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTwoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding?.root)

        binding?.btnSecond?.setOnClickListener(View.OnClickListener {
            val startFirstActivity = Intent(this, MainActivity::class.java)
            startActivity(startFirstActivity)
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out)
        })
    }
}