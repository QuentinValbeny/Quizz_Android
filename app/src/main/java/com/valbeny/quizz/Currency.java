package com.valbeny.quizz;

import android.os.Parcel;
import android.os.Parcelable;

public class Currency implements Parcelable {
	public int docId;
	public String question;
	public String answer1;
	public String answer2;
	public String answer3;

	public Currency(int docId, String question, String answer1, String answer2, String answer3) {
		this.docId = docId;
		this.question = question;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
	}

	protected Currency(Parcel in) {
		docId = in.readInt();
		question = in.readString();
		answer1 = in.readString();
		answer2 = in.readString();
		answer3 = in.readString();
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeInt(docId);
		dest.writeString(question);
		dest.writeString(answer1);
		dest.writeString(answer2);
		dest.writeString(answer3);
	}

	@Override
	public int describeContents() {
		return 0;
	}

	public static final Creator<Currency> CREATOR = new Creator<Currency>() {
		@Override
		public Currency createFromParcel(Parcel in) {
			return new Currency(in);
		}

		@Override
		public Currency[] newArray(int size) {
			return new Currency[size];
		}
	};

	public int getDocId() {
		return docId;
	}

	public String getQuestion() {
		return question;
	}

	public String getAnswer1() {
		return answer1;
	}

	public String getAnswer2() {
		return answer2;
	}

	public String getAnswer3() {
		return answer3;
	}
}
