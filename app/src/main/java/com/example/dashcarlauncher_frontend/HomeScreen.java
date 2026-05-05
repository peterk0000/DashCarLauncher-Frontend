package com.example.dashcarlauncher_frontend;

import static com.example.dashcarlauncher_frontend.databinding.FragmentScreenBinding.inflate;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.dashcarlauncher_frontend.databinding.FragmentScreenBinding;

public class HomeScreen extends Fragment {

    FragmentScreenBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentScreenBinding.inflate(getLayoutInflater());

        binding.phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_CALL_BUTTON));
            }
        });

        binding.radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        return binding.getRoot();


    }
}

