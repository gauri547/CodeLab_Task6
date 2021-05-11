package com.streamliners.codelab;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.streamliners.codelab.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Set the title for the activity
        setTitle("Codelab");
    }
}







