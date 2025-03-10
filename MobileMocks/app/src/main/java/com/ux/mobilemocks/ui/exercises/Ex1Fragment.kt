package com.ux.mobilemocks.ui.exercises

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ux.mobilemocks.R

class Ex1Fragment : Fragment() {

    companion object {
        fun newInstance() = Ex1Fragment()
    }

    private val viewModel: Ex1ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_ex1, container, false)
    }
}