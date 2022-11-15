package com.moutamid.ewastemanagement.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.card.MaterialCardView;
import com.moutamid.ewastemanagement.AllCategoryActivity;
import com.moutamid.ewastemanagement.R;
import com.moutamid.ewastemanagement.SearchActivity;
import com.moutamid.ewastemanagement.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    MaterialCardView searchBtn;
    FragmentHomeBinding binding;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        binding.searchBtn.setOnClickListener(v -> {
            startActivity(new Intent(view.getContext(), SearchActivity.class));
        });

        binding.morebtn.setOnClickListener(v -> {
            startActivity(new Intent(view.getContext(), AllCategoryActivity.class));
        });

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}