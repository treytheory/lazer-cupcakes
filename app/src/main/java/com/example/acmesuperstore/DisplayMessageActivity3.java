package com.example.acmesuperstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import android.os.Bundle;

/** Public class for the DisplayMessageActivity3 */
public class DisplayMessageActivity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message3);

        /** Shoe Fragment Object */
        HealthFragment fragmentHealth = new HealthFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().add(R.id.healthLayout,fragmentHealth).commit();
    }
}