package com.example.first;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.first.R;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    // Declare variables to hold references to UI elements
    private EditText num1EditText, num2EditText;
     TextView Bswapnum1 , Bswapnum2 ,Aswapnum1,Aswapnum2;
    Button Btn,clearBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements from the layout
        num1EditText = findViewById(R.id.num1EditText);
        num2EditText = findViewById(R.id.num2EditText);
        Bswapnum1 = findViewById(R.id.bsn2);
        Bswapnum2=findViewById(R.id.bsn4);
        Aswapnum1=findViewById(R.id.asn2);
        Aswapnum2=findViewById(R.id.asn4);
        Btn=findViewById(R.id.sqrtButton1);
        clearBtn=findViewById(R.id.clear);


        // Set click listeners for arithmetic operation buttons
Btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String str1 =num1EditText.getText().toString();
        String str2 = num2EditText.getText().toString();

        if (str1.isEmpty() || str2.isEmpty()) {
            Toast.makeText(MainActivity.this,"Please enter both numbers",Toast.LENGTH_SHORT).show();
            return; // Exit the method to prevent calculations with empty inputs
        }

        //before Swaping

        Bswapnum1.setText(str1);
        Bswapnum2.setText(str2);

        int num1=Integer.parseInt(str1);
        int num2=Integer.parseInt(str2);

        int temp;

        temp =num1;
        num1=num2;
        num2=temp;

        Aswapnum1.setText(String.valueOf(num1));
        Aswapnum2.setText(String.valueOf(num2));



    }
});

clearBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        num1EditText.setText("");
        num2EditText.setText("");
        Bswapnum1.setText("");
        Bswapnum2.setText("");
        Aswapnum1.setText("");
        Aswapnum2.setText("");

    }
});

    }
}





