package com.ux.mobilemocks.ui.home

import android.os.Bundle
import androidx.fragment.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.ux.mobilemocks.R

class CustomDialogFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dialog, container, false)

        val cancelButton: Button = view.findViewById(R.id.cancel_dialog)
        cancelButton.setOnClickListener {
            dismiss()
        }

        return view
    }
}