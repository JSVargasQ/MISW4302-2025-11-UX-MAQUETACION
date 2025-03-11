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
import com.ux.mobilemocks.databinding.FragmentEx4Binding

class Ex4Fragment : Fragment() {


    private var _binding: FragmentEx4Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentEx4Binding.inflate(inflater, container, false)

        val root: View = binding.root

        // TODO: go back to exercise list
        binding.topAppBarEx4.setNavigationOnClickListener {
            requireActivity().onBackPressedDispatcher.onBackPressed()
        }

        Glide.with(this)
            .asGif()
            .load(R.drawable.postura_uttanasana)
            .into(binding.gifEx4)

        val repeatsEx = SpannableString(getString(R.string.repeats_ex4))
        repeatsEx.setSpan(StyleSpan(Typeface.BOLD), 0, 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        binding.repeatsEx4.text = repeatsEx

        val restEx = SpannableString(getString(R.string.rest_ex4))
        restEx.setSpan(StyleSpan(Typeface.BOLD), 0, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        binding.restEx4.text = restEx

        binding.iconButtonPreviousEx4.setOnClickListener {
            findNavController().navigate(R.id.action_ex4Fragment_to_ex3Fragment)
        }

        binding.finishButtonEx4.setOnClickListener {
            findNavController().navigate(R.id.action_ex4Fragment_to_summaryFragment)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}