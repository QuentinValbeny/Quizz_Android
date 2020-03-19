package com.valbeny.quizz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CurrencyListeActivity extends AppCompatActivity {

	private CurrencyAdapter adapter;
	private List<Currency> currencies;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_currency_liste);

		currencies = new ArrayList<>();

		for (int i = 0; i<50; i++){
			currencies.add(new Currency(R.drawable.alan_turing, "Qui était Alan Turing ?","Un plombier","Une commode","Un Mathématicien"));
			currencies.add(new Currency(R.drawable.bill_gates, " A quel âge Bill Gate a fondé Microsoft?","18 ans","20 ans","37 ans"));
			currencies.add(new Currency(R.drawable.ascii, "Combien y a t-il de caractère dans la table ascii ?","36","127","86"));
		}

		adapter = new CurrencyAdapter(currencies);

		RecyclerView recyclerView = findViewById(R.id.recyclerView);
		recyclerView.setAdapter(adapter);
		recyclerView.setLayoutManager(new LinearLayoutManager(this));
	}
}
