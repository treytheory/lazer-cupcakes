package com.example.acmesuperstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import android.os.Bundle;

/** Public class for the DisplayMessageActivity */
public class DisplayMessageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        /** Clothes Fragment Object */
        ClothesFragment fragmentClothes = new ClothesFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().add(R.id.clothesLayout,fragmentClothes).commit();
    }
}