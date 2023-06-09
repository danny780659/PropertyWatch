package au.edu.cqu.propertywatch

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class ErrorDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
        AlertDialog.Builder(requireContext())
            .setMessage("Error! Please make sure all fields are populated.")
            .setPositiveButton("ok") { _,_ -> }
            //.setNegativeButton("discard changes", null)
            .create()

    companion object {
        const val TAG = "ErrorDialog"
    }
}