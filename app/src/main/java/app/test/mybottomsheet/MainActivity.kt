package app.test.mybottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnShow: Button = findViewById(R.id.btn_sheet)

        btnShow.setOnClickListener {
            val view: View = layoutInflater.inflate(R.layout.bottom_sheet, null)
            val dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()
        }

    }
}