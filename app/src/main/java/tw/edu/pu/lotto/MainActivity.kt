package tw.edu.pu.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linear_main)

        var txv:TextView=findViewById(R.id.txv)
        txv.text="0"
    }
    fun happy(v: View){
       var txv:TextView=findViewById(R.id.txv)
        txv.text=(1..100).random().toString()
    }
}