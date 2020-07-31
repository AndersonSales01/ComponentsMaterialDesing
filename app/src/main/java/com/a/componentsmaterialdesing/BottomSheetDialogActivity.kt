package com.a.componentsmaterialdesing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_bottom_sheet_dialog.*
import kotlinx.android.synthetic.main.layout_bottom_sheet.view.*

class BottomSheetDialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_sheet_dialog)
        buttonShow.setOnClickListener {
            val bottomSheetDialog = BottomSheetDialog(this, R.style.BottomSheetDialogTheme)
            val bottomSheetView = LayoutInflater.from(applicationContext)
                .inflate(R.layout.layout_bottom_sheet,
                    findViewById<LinearLayout>(R.id.bottomSheetContainer)
                )
            bottomSheetView.buttonShare.setOnClickListener {
                Toast.makeText(this, "Add Share ...", Toast.LENGTH_SHORT).show()

            }

            bottomSheetDialog.setContentView(bottomSheetView)
//            bottomSheetDialog.dismissWithAnimation = true
            bottomSheetDialog.show()
        }
    }
}
