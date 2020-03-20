package com.valbeny.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class QuizzTriche extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quizz_triche);

		TextView questionTextView = findViewById(R.id.questionTextView);

		TextView rep1button = findViewById(R.id.rep1button);
		rep1button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(QuizzTriche.this, falseActivity.class); //Changer de view
				Toast.makeText(QuizzTriche.this, "0",Toast.LENGTH_SHORT).show();
				startActivity(intent);//use intent
			}
		});

		TextView rep2button = findViewById(R.id.rep2button);
		rep2button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(QuizzTriche.this, falseActivity.class); //Changer de view
				Toast.makeText(QuizzTriche.this, "0",Toast.LENGTH_SHORT).show();
				startActivity(intent);//use intent
			}
		});

		TextView rep3button = findViewById(R.id.rep3button);
		rep3button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(QuizzTriche.this, QuizzTriche2.class); //Changer de view
				Toast.makeText(QuizzTriche.this, "+1",Toast.LENGTH_SHORT).show();
				startActivity(intent);//use intent
			}
		});


		String question1 = "Qui était Alan Turing";
		String answer1 = "Un plombier";
		String answer2 = "Une commode";
		String answer3 = "Un Mathématicien";
		questionTextView.setText( question1 +" ?");
		rep1button.setText( answer1);
		rep2button.setText( answer2);
		rep3button.setText( answer3);
	}
}
