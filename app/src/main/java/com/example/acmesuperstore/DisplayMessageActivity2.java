package com.example.acmesuperstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import android.os.Bundle;

/** Public class for the DisplayMessageActivity2 */
public class DisplayMessageActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message2);

        /** Shoe Fragment Object */
        ShoeFragment fragmentShoe = new ShoeFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().add(R.id.shoeDisplay,fragmentShoe).commit();
     }
}