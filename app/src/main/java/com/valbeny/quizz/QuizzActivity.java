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
import java.util.Arrays;
import java.util.Random;


public class QuizzActivity extends AppCompatActivity {

	private RadioGroup radioGroup;
	private RadioButton radioButton;
	private TextView textView;
	private String Difficult;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quizz);
		Intent srcIntent = getIntent();//récupération de l'intent
		String difficulty = srcIntent.getStringExtra("Difficulty");


		//MAJ UI
		TextView DifficultyTextView = findViewById(R.id.DifficultytextView);
		DifficultyTextView.setText("Difficulté: "+ difficulty);
		String Difficult = difficulty;

		if ("normal".equals(Difficult)){
		TextView questionTextView = findViewById(R.id.questionTextView);
		TextView answer1RadioButton = findViewById(R.id.answer1RadioButton);
		TextView answer2RadioButton = findViewById(R.id.answer2RadioButton);
		TextView answer3RadioButton = findViewById(R.id.answer3RadioButton);


		String question1 = "Qui était Alan Turing";
		String answer1 = "Un plombier";
		String answer2 = "Une commode";
		String answer3 = "Un Mathématicien";
		questionTextView.setText( question1 +" ?");
		answer1RadioButton.setText( answer1);
		answer2RadioButton.setText( answer2);
		answer3RadioButton.setText( answer3);
		}

		if ("easy".equals(Difficult)){
			TextView questionTextView = findViewById(R.id.questionTextView);
			TextView answer1RadioButton = findViewById(R.id.answer1RadioButton);
			TextView answer2RadioButton = findViewById(R.id.answer2RadioButton);
			TextView answer3RadioButton = findViewById(R.id.answer3RadioButton);
			String question1 = "Qui était Alan Turing";
			String answer1 = "Une commode";
			String answer2 = "Un Mathématicien";
			String answer3 = "Difficulté normal";
			questionTextView.setText( question1 +" ?");
			answer1RadioButton.setText( answer1);
			answer2RadioButton.setText( answer2);
			answer3RadioButton.setText( answer3);
		}
	}
}
