package com.example.p03;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button btn; //step 2 create an object of UI element
    EditText etExample;
    TextView tvDisplay;
    ToggleButton tbtn;
    RadioGroup rgGender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        etExample = findViewById(R.id.etExample);
        tvDisplay = findViewById(R.id.tvDisplay);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.rgGender);
        //step 3, linking objects with Ui element by ID


        etExample.isEnabled();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String said = "";
                String stringResponse = etExample.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioBtnMale){
                    // Write the code when male selected
                    said = "He said ";
                }
                else if (checkedRadioId == R.id.radioBtnFemale){
                    // Write the code when female selected
                    said = "She said ";
                } else {
                    said = "They said ";
                }
                tvDisplay.setText(said + stringResponse);
            }
        });
//        btn.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onClick(View v) {
//                String strAmount = etExample.getText().toString();
//                tvDisplay.setText(strAmount);
//
//                Toast.makeText(MainActivity.this, "You typed: "+strAmount, Toast.LENGTH_LONG).show();
//
//            }
//        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                etExample.setEnabled(tbtn.isChecked());


            }
        });




//




    }
}