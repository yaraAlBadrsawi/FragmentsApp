package com.alaqsa.android_lab.fragments.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import com.alaqsa.android_lab.fragments.databinding.ActivityMainBinding;

import Fragments.PersonalFragment;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(this.binding.getRoot());

        startActivity(new Intent(this,InfoActivity.class));

        getSupportFragmentManager()
                .beginTransaction()
                .replace(this.binding.fragmentContainer,new PersonalFragment());
    }
}