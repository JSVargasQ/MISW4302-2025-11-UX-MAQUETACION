package com.ux.mobilemocks.ui.exercises

import android.graphics.Typeface
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.StyleSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.ux.mobilemocks.R
import com.ux.mobilemocks.databinding.FragmentEx1Binding

class Ex1Fragment : Fragment() {


    private var _binding: FragmentEx1Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentEx1Binding.inflate(inflater, container, false)

        val root: View = binding.root

        binding.topAppBarEx1.setNavigationOnClickListener {
            requireActivity().onBackPressedDispatcher.onBackPressed()
        }

        Glide.with(this)
            .asGif()
            .load(R.drawable.postura_silla)
            .into(binding.gifEx1)

        val repeatsEx1 = SpannableString(getString(R.string.repeats_ex1))
        repeatsEx1.setSpan(StyleSpan(Typeface.BOLD), 0, 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        binding.repeatsEx1.text = repeatsEx1

        val restEx1 = SpannableString(getString(R.string.rest_ex1))
        restEx1.setSpan(StyleSpan(Typeface.BOLD), 0, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        binding.restEx1.text = restEx1

        binding.finishButtonEx1.setOnClickListener {
            findNavController().navigate(R.id.action_ex1Fragment_to_summaryFragment)
        }

        binding.iconButtonNextEx1.setOnClickListener {
            findNavController().navigate(R.id.action_ex1Fragment_to_ex2Fragment)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}