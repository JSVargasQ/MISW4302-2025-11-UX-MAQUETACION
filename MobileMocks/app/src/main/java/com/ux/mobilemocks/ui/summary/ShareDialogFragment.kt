package com.ux.mobilemocks.ui.summary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import com.ux.mobilemocks.R

class ShareDialogFragment : DialogFragment() {

    // The system calls this to get the DialogFragment's layout, regardless of
    // whether it's being displayed as a dialog or an embedded fragment.
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout to use as a dialog or embedded fragment.
        return inflater.inflate(R.layout.fragment_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cancelButton: Button = view.findViewById(R.id.cancel_dialog)
        cancelButton.setOnClickListener {
            dismiss()
        }
    }
}