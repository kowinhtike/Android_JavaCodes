package com.example.layoutflater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    Button button;

    private static void showMessage(View View) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        linearLayout = findViewById(R.id.linearLayout);

        button.setOnClickListener(View -> {
            TextView textView1 = new TextView(this);
            textView1.setText("Generated Text");
            // Set any other properties as needed
            textView1.setLayoutParams(new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT));

// Add the TextView to the ViewGroup
            linearLayout.addView(textView1);

            Button button1 = new Button(this);
            button1.setText("Generated Button");
            button1.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Handle button click here
                    Log.d("ButtonClicked", "Button Clicked!");
//                    textView1.setText("Text From Button");
                    linearLayout.removeView(button1);

                }
            });
            linearLayout.addView(button1);

        });
    }
}
