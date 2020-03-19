package com.valbeny.quizz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;




public class QuizzActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quizz);
		Intent srcIntent = getIntent();//récupération de l'intent
		String difficulty = srcIntent.getStringExtra("Difficulty");

		//MAJ UI
		TextView DifficultyTextView = findViewById(R.id.DifficultytextView);
		DifficultyTextView.setText("Difficulté: "+difficulty);

		

	}
}
