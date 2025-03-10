package com.ux.mobilemock.ui.exercises;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ux.mobilemock.R;
import com.ux.mobilemock.databinding.FragmentEx1Binding;
import com.ux.mobilemock.databinding.FragmentHomeBinding;
import com.ux.mobilemock.ui.home.HomeViewModel;

public class Ex1Fragment extends Fragment {

    private FragmentEx1Binding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentEx1Binding.inflate(inflater, container, false);


        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}