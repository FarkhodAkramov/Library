package uz.ipanda.pandalibrary

import android.content.Context
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar


class SnackbarByFarkhod {
    fun s(view: View,text:String) {
        Snackbar.make(view, text, Snackbar.LENGTH_LONG).apply {
            setAction("Undo") {

            }
            show()
        }
    }
}