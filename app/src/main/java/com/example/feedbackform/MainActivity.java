package com.example.feedbackform;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText myTextField;
    Button btn_Submit;
    CheckBox Terms_Conditions;
    RadioButton radio_Male,radio_Female;
    RatingBar ratingBar;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextField = (EditText)findViewById(R.id.et_myTextField);
        Terms_Conditions =(CheckBox)findViewById(R.id.et_Terms_Conditions);
        radio_Male = (RadioButton)findViewById(R.id.et_radio_Male);
        radio_Female = (RadioButton)findViewById(R.id.et_radio_Female);
        ratingBar = (RatingBar)findViewById(R.id.et_ratingBar);
        seekBar = (SeekBar)findViewById(R.id.et_seekBar);
        btn_Submit = (Button)findViewById(R.id.btn_Submit);

        radio_Male.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked == true){

                    radio_Female.setChecked(false);
                    Toast.makeText(getApplicationContext(),"Male",Toast.LENGTH_SHORT).show();

                }

            }
        });

        radio_Female.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked == true){

                    radio_Male.setChecked(false);
                    Toast.makeText(getApplicationContext(),"Female",Toast.LENGTH_SHORT).show();

                }

            }
        });
        Terms_Conditions.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if( isChecked == true){

                    Toast.makeText(getApplicationContext(),"Agreed to terms & conditions",Toast.LENGTH_SHORT).show();

                }

            }
        });

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                Toast.makeText(getApplicationContext(),"Rating"+rating,Toast.LENGTH_SHORT).show();

            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int c = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                seekBar.setMax(100);
                c = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                Toast.makeText(getApplicationContext(),"SeekBar"+c,Toast.LENGTH_SHORT).show();

            }
        });

        btn_Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Submitted Successfully",Toast.LENGTH_SHORT).show();
            }
        });



    }
}
