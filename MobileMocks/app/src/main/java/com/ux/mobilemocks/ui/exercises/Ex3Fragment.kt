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
import com.ux.mobilemocks.databinding.FragmentEx3Binding

class Ex3Fragment : Fragment() {


    private var _binding: FragmentEx3Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentEx3Binding.inflate(inflater, container, false)

        val root: View = binding.root

        binding.topAppBarEx3.setNavigationOnClickListener {
            findNavController().navigate(R.id.action_ex3Fragment_to_listFragment)
        }

        Glide.with(this)
            .asGif()
            .load(R.drawable.postura_gato_vaca)
            .into(binding.gifEx3)

        val repeatsEx = SpannableString(getString(R.string.repeats_ex3))
        repeatsEx.setSpan(StyleSpan(Typeface.BOLD), 0, 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        binding.repeatsEx3.text = repeatsEx

        val restEx = SpannableString(getString(R.string.rest_ex3))
        restEx.setSpan(StyleSpan(Typeface.BOLD), 0, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        binding.restEx3.text = restEx

        binding.iconButtonPreviousEx3.setOnClickListener {
            findNavController().navigate(R.id.action_ex3Fragment_to_ex2Fragment)
        }

        binding.finishButtonEx3.setOnClickListener {
            findNavController().navigate(R.id.action_ex3Fragment_to_summaryFragment)
        }

        binding.iconButtonNextEx3.setOnClickListener {
            findNavController().navigate(R.id.action_ex3Fragment_to_ex4Fragment)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}