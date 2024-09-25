package com.example.android_assignment_2;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.RatingBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup sportRadioGroup;
    private RadioGroup roleRadioGroup;
    private RatingBar skillRatingBar;
    private SeekBar trainingSeekBar;
    private TextView skillLevelValue;
    private TextView trainingIntensityValue;
    private Switch switchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sportRadioGroup = findViewById(R.id.sportRadioGroup);
        roleRadioGroup = findViewById(R.id.roleRadioGroup);
        skillRatingBar = findViewById(R.id.skillRatingBar);
        trainingSeekBar = findViewById(R.id.trainingSeekBar);
        skillLevelValue = findViewById(R.id.skillLevelValue);
        trainingIntensityValue = findViewById(R.id.trainingIntensityValue);
        switchButton = findViewById(R.id.switchButton);


        sportRadioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton selectedSport = findViewById(checkedId);
            Toast.makeText(this, "Selected Sport: " + selectedSport.getText(), Toast.LENGTH_SHORT).show();
        });


        roleRadioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton selectedRole = findViewById(checkedId);
            Toast.makeText(this, "Selected Role: " + selectedRole.getText(), Toast.LENGTH_SHORT).show();
        });


        skillRatingBar.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> {
            skillLevelValue.setText("Skill Level: " + rating);
            Toast.makeText(this, "Skill Level Rated: " + rating, Toast.LENGTH_SHORT).show();
        });



        switchButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            String message = isChecked ? "Notifications Enabled" : "Notifications Disabled";
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        });
    }
}
