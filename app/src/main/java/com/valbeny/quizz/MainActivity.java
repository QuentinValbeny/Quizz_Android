package com.valbeny.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Log.i("MainActivity", "Quizz lancé");

		Button goQuizzButtonNormal = findViewById(R.id.goQuizzButtonNormal);//Start Quizz button
		goQuizzButtonNormal.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ArrayList<String> listAnswer = new ArrayList<String>(); //Set the first question in normal difficulty
				listAnswer.add("Un plombier");
				listAnswer.add("Une commode");
				listAnswer.add("Un Mathématicien");
				QuizzTest test = new QuizzTest("Qui était Alan Turing", "Un Mathématicien", listAnswer);//instantiate test
				//QuizzTest test = new QuizzTest("Qui était Alan Turing", "Un Mathématicien", listAnswer, idDoc);

				Intent intent = new Intent(MainActivity.this, QuizzActivity.class); //Changer de view
				intent.putExtra("Difficulty", "normal");//send information
				intent.putExtra("Test", test);
				startActivity(intent);//use intent

			}
		});

		Button goQuizzButton = findViewById(R.id.goQuizzButtonEasy);
		goQuizzButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ArrayList<String> listAnswer = new ArrayList<String>();//Set the first question in easy difficulty
				listAnswer.add("Un capitaine de galion");
				listAnswer.add("Une poule");
				listAnswer.add("Un Mathématicien");
				QuizzTest test = new QuizzTest("Qui était Alan Turing", "Un Mathématicien", listAnswer);

				Intent intent = new Intent(MainActivity.this, QuizzActivity.class); //Changer de view
				intent.putExtra("Difficulty", "easy");//send information
				intent.putExtra("Test", test);
				startActivity(intent);//use intent
			}
		});

		Button listQuestionButton = findViewById(R.id.listQuestionButton);
		listQuestionButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, CurrencyListeActivity.class); //Changer de view
				startActivity(intent);//use intent
			}
		});

		Button aboutButton = findViewById(R.id.aboutButton);
		aboutButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, aboutActivity.class); //Changer de view
				startActivity(intent);//use intent
			}
		});

		Button tricheButton = findViewById(R.id.tricheButton);
		tricheButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, QuizzTriche.class); //Changer de view
				startActivity(intent);//use intent
			}
		});
	}
}
