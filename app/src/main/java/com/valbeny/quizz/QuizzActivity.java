package com.valbeny.quizz;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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
	private QuizzTest test;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quizz);
		Intent srcIntent = getIntent();//récupération de l'intent
		String difficulty = srcIntent.getStringExtra("Difficulty");


		//MAJ UI
		TextView DifficultyTextView = findViewById(R.id.DifficultytextView);
		DifficultyTextView.setText("Difficulté: " + difficulty);
		String Difficult = difficulty;

		TextView questionTextView = findViewById(R.id.questionTextView);
		TextView answer1RadioButton = findViewById(R.id.answer1RadioButton);
		TextView answer2RadioButton = findViewById(R.id.answer2RadioButton);
		TextView answer3RadioButton = findViewById(R.id.answer3RadioButton);

		test = getIntent().getParcelableExtra("Test");

		questionTextView.setText(test.question + " ?");
		answer1RadioButton.setText(test.answers.get(0));
		answer2RadioButton.setText(test.answers.get(1));
		answer3RadioButton.setText(test.answers.get(2));


		Button validButton = findViewById(R.id.validButton);
		validButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				RadioGroup radioGroup = findViewById(R.id.radioGroup);
				int id = radioGroup.getCheckedRadioButtonId();//id du radio boutton selectionné
				Log.i("Radio", "ICI" + id);
				RadioButton radioButton = findViewById(id);//Récup le radio boutton de l'id id
				Log.i("Radio", "" + radioButton.getText());

				String answer = radioButton.getText().toString();//Récupère le text du radio boutton selected
				if (answer.equals(test.goodAnswer)) {
					Toast.makeText(QuizzActivity.this, "Bonne réponse", Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(QuizzActivity.this, "Mauvaise réponse", Toast.LENGTH_SHORT).show();
				}
			}
		});
	}
}
