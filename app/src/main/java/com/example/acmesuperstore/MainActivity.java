package com.example.acmesuperstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.EditText;

/** Main method that starts the application */
public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.acmesuperstore.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** First Fragment that displays the Newsletter button */
        FirstFragment fragment = new FirstFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().add(R.id.mainLayout,fragment).commit();
    }
        /** Called when the user taps the Shoes button */
        public void sendMessage(View view) {
            String message = "test";
            /** Intent that responds to button click and sends message to activity*/
            Intent intent = new Intent(this, DisplayMessageActivity2.class);
            EditText editText = (EditText) findViewById(R.id.editText);
            startActivity(intent);
    }
        /** Called when the user taps the Clothes button  */
        public void sendMessage2(View view) {
            setContentView(R.layout.activity_display_message);
            /** Intent that responds to button click and starts the activity*/
            Intent intent2 = new Intent(this, DisplayMessageActivity.class);
            startActivity(intent2);
    }
        /** Called when the user taps the Health button */
        public void sendMessage3(View view) {
            setContentView(R.layout.activity_display_message3);
            /** Intent that responds to button click and starts the activity*/
            Intent intent3 = new Intent(this, DisplayMessageActivity3.class);
            startActivity(intent3);
    }
        /** Inflates the search box to the app bar */
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.options_menu, menu);
        return true;
    }
}
