package com.example.androidcalculator;

import android.graphics.Color;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    //global variable
     static boolean check = true;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //preload stuff
        setContentView(R.layout.activity_main); //prewritten

        //local variable delcaration
        final  Switch darkModeSwitch = findViewById(R.id.switchToggle);
        TextView Txt = findViewById(R.id.textView);


        darkModeSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (check == true){
                    dark();
                } else {
                    light();
                }
            }
        });



    }

    public void dark(){ //method for the dark mode
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(Color.parseColor ("#121212"));
        TextView Txt = findViewById(R.id.textView);
        Txt.setTextColor(Color.parseColor("#BB86FC"));
        check = false;
    }

    public void light(){ //method for the ligth mode
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(Color.parseColor ("#FFFFFF"));
        TextView Txt = findViewById(R.id.textView);
        Txt.setTextColor(Color.parseColor("#000000"));
        check = true;
    }



}
