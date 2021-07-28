package uz.ipanda.pandalibrary

import android.content.Context
import android.widget.Toast


class SnackbarByFarkhod {
    fun s(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }

    fun square(c: Context?, a: Int): Int {

        Toast.makeText(c, "${a * a}", Toast.LENGTH_SHORT).show()
        return a * a
    }
}