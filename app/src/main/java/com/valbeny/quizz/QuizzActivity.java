package com.valbeny.quizz;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class QuizzActivity extends AppCompatActivity {

	private RadioGroup radioGroup;
	private RadioButton radioButton;
	private TextView textView;
	private String Difficult;
	//private int doc;
	private QuizzTest test;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quizz);
		Intent srcIntent = getIntent();//get intent
		String difficulty = srcIntent.getStringExtra("Difficulty");//get difficulty normal/easy


		//MAJ UI
		TextView DifficultyTextView = findViewById(R.id.DifficultytextView);
		DifficultyTextView.setText("Difficulté: " + difficulty);
		String Difficult = difficulty;

		TextView questionTextView = findViewById(R.id.questionTextView);  //found UI elements
		TextView answer1RadioButton = findViewById(R.id.answer1RadioButton);
		TextView answer2RadioButton = findViewById(R.id.answer2RadioButton);
		TextView answer3RadioButton = findViewById(R.id.answer3RadioButton);
		ImageView imageView = findViewById(R.id.imageView);

		test = getIntent().getParcelableExtra("Test"); //get test class in the difficulty chosen

		questionTextView.setText(test.question + " ?");
		answer1RadioButton.setText(test.answers.get(0));//take answers in array
		answer2RadioButton.setText(test.answers.get(1));
		answer3RadioButton.setText(test.answers.get(2));
		//imageView.setImageResource(test.doc);

		Button validButton = findViewById(R.id.validButton);
		validButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				RadioGroup radioGroup = findViewById(R.id.radioGroup);
				int id = radioGroup.getCheckedRadioButtonId();//radio button selected id
				Log.i("Radio", "ICI" + id);
				RadioButton radioButton = findViewById(id);//Retrieve the radio button of the id id
				Log.i("Radio", "" + radioButton.getText());

				String answer = radioButton.getText().toString();//Get text from radio button selected
				if (answer.equals(test.goodAnswer)) {
					Toast.makeText(QuizzActivity.this, "Bonne réponse", Toast.LENGTH_SHORT).show();
					Intent intent = new Intent(QuizzActivity.this, CurrencyListeActivity.class); //Changer de view
					startActivity(intent);//use intent
				} else {
					Toast.makeText(QuizzActivity.this, "Mauvaise réponse: " + test.goodAnswer, Toast.LENGTH_SHORT).show();
				}
			}
		});
	}
}
