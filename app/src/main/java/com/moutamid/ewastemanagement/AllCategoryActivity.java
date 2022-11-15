package com.moutamid.ewastemanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.moutamid.ewastemanagement.databinding.ActivityAllCategoryBinding;

public class AllCategoryActivity extends AppCompatActivity {

    ActivityAllCategoryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAllCategoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}