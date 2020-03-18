package com.valbeny.quizz;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CurrencyAdapter extends RecyclerView.Adapter<CurrencyAdapter.ViewHolder> {

	private List<Question> currencies;

	public CurrencyAdapter(List<Question> currencies){
		this.currencies = currencies;
	}

	@NonNull
	@Override
	public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.item_currency, parent, false);
		return new ViewHolder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
		Question currency = currencies.get(position);
		holder.doc.setImageResource(currency.docId);
		holder.question.setText(currency.question);
	}

	@Override
	public int getItemCount() {
		return currencies.size();
	}

	class ViewHolder extends RecyclerView.ViewHolder {
		final ImageView doc;
		final TextView question;
		final TextView answer1;
		final TextView answer2;
		final TextView answer3;


		public ViewHolder(@NonNull View itemView) {
			super(itemView);

			//Récupération des éléments graphiques
			doc = itemView.findViewById(R.id.docImageView);
			question = itemView.findViewById(R.id.questionTextView);
			answer1 = itemView.findViewById(R.id.answerTextView1);
			answer2 = itemView.findViewById(R.id.answerTextView2);
			answer3 = itemView.findViewById(R.id.answerTextView3);
		}
	}
}
