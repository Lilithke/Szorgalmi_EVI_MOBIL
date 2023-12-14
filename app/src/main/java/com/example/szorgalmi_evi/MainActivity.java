package com.example.szorgalmi_evi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekRed;
    private SeekBar seekGreen;

    private SeekBar seekBlue;

    private RelativeLayout relativeLayout;

    private TextView redText;
    private TextView greenText;
    private TextView blueText;

    private TextView successText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }


    seekRed.setOnSeekBarChangeListener(
            new SeekBar.OnSeekBarChangeListener(){
                int progress_value;



                @Override
                public void onProgressChanged(SeekBar seekRed, int progress, boolaen){
                progress_value=progress;
                red=progress_value;
                redText.setText("Red:"+ red);
                relativeLayout.setBackgroundColor(Color.rgb(red,green,blue));
                successText.setText("("+red+","+green+","+blue+")");
                }
            )

    private void init(){
        seekBlue=findViewById(R.id.seekBlue);
        seekGreen=findViewById(R.id.seekGreen);
        seekRed=findViewById(R.id.seekRed);
        redText=findViewById(R.id.redText);
        greenText=findViewById(R.id.greenText);
        blueText=findViewById(R.id.blueText);
    }
}