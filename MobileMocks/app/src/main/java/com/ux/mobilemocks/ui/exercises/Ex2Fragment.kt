package com.ux.mobilemocks.ui.exercises

import android.graphics.Typeface
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.StyleSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.ux.mobilemocks.R
import com.ux.mobilemocks.databinding.FragmentEx2Binding

class Ex2Fragment : Fragment() {


    private var _binding: FragmentEx2Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentEx2Binding.inflate(inflater, container, false)

        val root: View = binding.root

        binding.topAppBarEx2.setNavigationOnClickListener {
            findNavController().navigate(R.id.action_ex2Fragment_to_listFragment)
        }

        Glide.with(this)
            .asGif()
            .load(R.drawable.postura_cobra)
            .into(binding.gifEx2)

        val repeatsEx = SpannableString(getString(R.string.repeats_ex2))
        repeatsEx.setSpan(StyleSpan(Typeface.BOLD), 0, 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        binding.repeatsEx2.text = repeatsEx

        val restEx = SpannableString(getString(R.string.rest_ex2))
        restEx.setSpan(StyleSpan(Typeface.BOLD), 0, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        binding.restEx2.text = restEx

        binding.iconButtonPreviousEx2.setOnClickListener {
            findNavController().navigate(R.id.action_ex2Fragment_to_ex1Fragment)
        }

        binding.finishButtonEx2.setOnClickListener {
            findNavController().navigate(R.id.action_ex2Fragment_to_summaryFragment)
        }

        binding.iconButtonNextEx2.setOnClickListener {
            findNavController().navigate(R.id.action_ex2Fragment_to_ex3Fragment)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}