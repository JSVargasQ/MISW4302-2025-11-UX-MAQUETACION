package com.ux.mobilemocks.ui.summary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ux.mobilemocks.R
import com.ux.mobilemocks.databinding.FragmentSummaryBinding

class SummaryFragment : Fragment() {


    private var _binding: FragmentSummaryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSummaryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.topAppBarSummary.setNavigationOnClickListener {
            findNavController().navigate(R.id.action_summaryFragment_to_navigation_home)
        }

        binding.shareButton.setOnClickListener {
            val shareDialog = ShareDialogFragment()
            shareDialog.show(parentFragmentManager, "ShareDialogFragment")
        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}